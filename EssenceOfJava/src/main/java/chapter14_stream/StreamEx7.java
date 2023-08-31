package chapter14_stream;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.*;

public class StreamEx7 {
    public static void main(String[] args) {
        Student[] stuArr = {
                new Student("나자바", true, 1, 1, 300),
                new Student("나자바", true, 1, 1, 300),
                new Student("학생1", true, 1, 1, 100),
                new Student("학생2", false, 1, 1, 150),
                new Student("학생3", true, 2, 2, 200),
                new Student("학생4", false, 2, 2, 170),
                new Student("학생5", true, 2, 3, 180),
                new Student("학생6", false, 2, 3, 210),
                new Student("학생7", true, 2, 1, 190),
                new Student("학생8", false, 2, 1, 220),
                new Student("학생9", true, 3, 3, 240),
                new Student("학생10", false, 3, 3, 260),
                new Student("학생11", true, 3, 2, 270),
                new Student("학생12", false, 3, 2, 120),
                new Student("학생13", true, 3, 1, 130),
                new Student("학생14", false, 3, 1, 140),
                new Student("학생15", true, 1, 2, 170),
                new Student("학생16", false, 1, 2, 190),
                new Student("학생17", true, 1, 3, 200),
                new Student("학생18", false, 1, 3, 220),
                new Student("학생19", true, 3, 2, 240)
        };

        System.out.println("1. 단순분할(성별로 분할) %n");
        Map<Boolean, List<Student>> stuBySex = Stream.of(stuArr)
                .collect(partitioningBy(Student::isMale));

        List<Student> maleStudent = stuBySex.get(true);
        List<Student> femaleStudent = stuBySex.get(false);

        for (Student s : maleStudent) {
            System.out.println(s);
        }
        for (Student s : femaleStudent) {
            System.out.println(s);
        }

        System.out.printf("%n2. 단순분할 + 통계(성별 학생수) %n");
        Map<Boolean, Long> stuNumBySex = Stream.of(stuArr)
                .collect(partitioningBy(Student::isMale, counting()));
        System.out.println("남학생 수 : " + stuNumBySex.get(true));
        System.out.println("여학생 수 : " + stuNumBySex.get(false));

        System.out.printf("%n3. 단순분할 + 통계(성별 1등) %n");
        Map<Boolean, Optional<Student>> topScoreBySex = Stream.of(stuArr)
                .collect(partitioningBy(Student::isMale, maxBy(comparingInt(Student::getScore))));
        System.out.println("남학생 1등 : " + topScoreBySex.get(true));
        System.out.println("여학생 1등 : " + topScoreBySex.get(false));
        Map<Boolean,Student> topScoreBySex2 = Stream.of(stuArr)
                .collect(partitioningBy(Student::isMale, collectingAndThen(
                        maxBy(
                                comparingInt(Student::getScore)), Optional::get
                )
                ));
        System.out.println("남학생 1등 : " + topScoreBySex2.get(true));
        System.out.println("여학생 1등 : " + topScoreBySex2.get(false));

        System.out.printf("%n3. 다중분할 (성별 불합격자, 100점이하) %n");
        Map<Boolean, Map<Boolean, List<Student>>> failedStuBySex = Stream.of(stuArr).collect(partitioningBy(Student::isMale, partitioningBy(student -> student.getScore() <= 100)));
        List<Student> failedMaleStu = failedStuBySex.get(true).get(true);
        List<Student> failedFemaleStu = failedStuBySex.get(false).get(true);

        for (Student s : failedMaleStu) {
            System.out.println(s);
        }
        for (Student s : failedFemaleStu) {
            System.out.println(s);
        }


    }
}

class Student{
    String name;
    boolean isMale;
    int hak;
    int ban;
    int score;

    public Student(String name, boolean isMale, int hak, int ban, int score) {
        this.name = name;
        this.isMale = isMale;
        this.hak = hak;
        this.ban = ban;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public boolean isMale() {
        return isMale;
    }

    public int getHak() {
        return hak;
    }

    public int getBan() {
        return ban;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return String.format("[%s, %s, %d학년 %d반, %3d점]", name, isMale ? "남" : "여", hak, ban, score);
    }

    // groupingBy에서 사용
    enum Level{HIGH, MID, LOW} // 성적을 상, 중, 하 세 단계로 분류
}