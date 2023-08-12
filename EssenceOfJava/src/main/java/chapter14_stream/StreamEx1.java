package chapter14_stream;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamEx1 {
    public static void main(String[] args) {
        Stream<Student> studentStream = Stream.of(
                new Student("name1", 3, 300),
                new Student("name2", 1, 100),
                new Student("name3", 2, 100),
                new Student("name4", 2, 150),
                new Student("name5", 1, 200),
                new Student("name6", 3, 290),
                new Student("name7", 3, 180)
        );

        studentStream.sorted(Comparator.comparing(Student::getBan).thenComparing(Comparator.naturalOrder()))
                .forEach(System.out::println);

    }
}

class Student implements Comparable<Student> {

    String name;
    int ban;
    int totalScore;

    public Student(String name, int ban, int totalScore) {
        this.name = name;
        this.ban = ban;
        this.totalScore = totalScore;
    }

    public String toString() {
        return String.format("[%s, %d, %d]", name, ban, totalScore);
    }

    String getName() {
        return name;
    }

    int getBan() {
        return ban;
    }

    int getTotalScore() {
        return totalScore;
    }

    // 총점 내림차순을 기본 정렬로 한다.
    @Override
    public int compareTo(Student s) {
        return s.totalScore - this.totalScore;
    }
}