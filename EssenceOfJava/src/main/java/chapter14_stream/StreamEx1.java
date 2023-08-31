package chapter14_stream;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamEx1 {
    public static void main(String[] args) {
        Stream<StudentEx> studentStream = Stream.of(
                new StudentEx("name1", 3, 300),
                new StudentEx("name2", 1, 100),
                new StudentEx("name3", 2, 100),
                new StudentEx("name4", 2, 150),
                new StudentEx("name5", 1, 200),
                new StudentEx("name6", 3, 290),
                new StudentEx("name7", 3, 180)
        );

        studentStream.sorted(Comparator.comparing(StudentEx::getBan).thenComparing(Comparator.naturalOrder()))
                .forEach(System.out::println);

    }
}

class StudentEx implements Comparable<StudentEx> {

    String name;
    int ban;
    int totalScore;

    public StudentEx(String name, int ban, int totalScore) {
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
    public int compareTo(StudentEx s) {
        return s.totalScore - this.totalScore;
    }
}