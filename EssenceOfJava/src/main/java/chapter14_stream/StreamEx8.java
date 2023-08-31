package chapter14_stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class StreamEx8 {
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

        System.out.println("1.단순 그룹화(반별로 그룹화)");
        Map<Integer, List<Student>> stuByBan = Stream.of(stuArr).collect(groupingBy(Student::getBan));
        for (List<Student> ban : stuByBan.values()) {
            for (Student s : ban) {
                System.out.println(s);
            }
        }

        System.out.println();
        System.out.println("2. 단순 그룹화(성적별로 그룹화)");
        Map<Student.Level, List<Student>> stuByLevel = Stream.of(stuArr).collect(groupingBy(student ->
                {
                    if (student.getScore() >= 200) {
                        return Student.Level.HIGH;
                    } else if (student.getScore() >= 100) {
                        return Student.Level.MID;
                    } else {
                        return Student.Level.LOW;
                    }
                }
        ));
        TreeSet<Student.Level> keySet = new TreeSet<>(stuByLevel.keySet());

        for (Student.Level key : keySet) {
            System.out.println("[" + key + "]");

            for (Student s : stuByLevel.get(key)) {
                System.out.println(s);
            }
            System.out.println();
        }

        System.out.println("3. 단순그룹화 + 통계(성적별 학생수)");
        Map<Student.Level, Long> stuCntByLevel = Stream.of(stuArr)
                .collect(groupingBy(student -> {
                    if (student.getScore() >= 200) {
                        return Student.Level.HIGH;
                    } else if (student.getScore() >= 100) {
                        return Student.Level.MID;
                    } else {
                        return Student.Level.LOW;
                    }
                }, counting()));

        for (Student.Level key : keySet) {
            System.out.printf("[%s] - %d명, ", key, stuCntByLevel.get(key));
        }

        System.out.println("4. 다중 그룹화(학년별, 반별)");
        Map<Integer, Map<Integer, List<Student>>> stuByHakAndBan = Stream.of(stuArr)
                .collect(groupingBy(Student::getHak, groupingBy(Student::getBan)));

        for (Map<Integer, List<Student>> hak : stuByHakAndBan.values()) {
            for (List<Student> ban : hak.values()) {
                System.out.println();
                for (Student s : ban) {
                    System.out.println(s);
                }
            }
        }

        System.out.println("5. 다중그룹화 + (학년별, 반별1등)");
        Map<Integer, Map<Integer, Student>> topStuByHakAndBan = Stream.of(stuArr)
                .collect(groupingBy(Student::getHak, groupingBy(
                        Student::getBan, collectingAndThen(
                                maxBy(
                                        Comparator.comparingInt(Student::getScore)
                                ), Optional::get)
                )));
        for (Map<Integer, Student> ban : topStuByHakAndBan.values()) {
            for (Student s : ban.values()) {
                System.out.println(s);
            }
        }

        System.out.println("6. 다중그룹화 + 통계(학년별, 반별 성적그룹)");
        Map<String, Set<Student.Level>> stuByScoreGroup = Stream.of(stuArr)
                .collect(groupingBy(student -> student.getHak() + "-" + student.getBan(),
                        mapping(s -> {
                            if (s.getScore() >= 200) return Student.Level.HIGH;
                            else if (s.getScore() >= 100) return Student.Level.MID;
                            else return Student.Level.LOW;
                        }, toSet())
                ));

        Set<String> keySet1 = stuByScoreGroup.keySet();
        for (String key : keySet1) {
            System.out.println("[" + key + "]" + stuByScoreGroup.get(key));
        }
    }
}
