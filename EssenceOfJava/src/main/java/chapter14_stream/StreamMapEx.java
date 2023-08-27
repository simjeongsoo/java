package chapter14_stream;

import java.io.File;
import java.util.stream.Stream;

public class StreamMapEx {
    public static void main(String[] args) {
        Stream<File> fileStream = Stream.of(new File("Ex1.java"), new File("Ex1"),
                new File("Ex1.bak"), new File("Ex2.java"), new File("Ex1.txt"));

        // map으로 Stream<File>을 Stream<String> 으로 변환
//        fileStream.map(File::getName).forEach(System.out::println);

        /**
         * map()
         */
//        fileStream.map(File::getName) // tream<File>을 Stream<String> 으로 변환
//                .filter(s -> s.indexOf('.') != -1) // 확장자가 없는것은 제외
//                .map(s -> s.substring(s.indexOf('.') + 1)) // Stream<String> -> Stream<String>
//                .map(String::toUpperCase) // 모두 대문자로 변환
//                .distinct() // 중복제거
//                .forEach(System.out::println);

        /**
        * peek()
        */
        fileStream.map(File::getName) // tream<File>을 Stream<String> 으로 변환
                .filter(s -> s.indexOf('.') != -1) // 확장자가 없는것은 제외
                .peek(s -> System.out.printf("filename=%s%n", s)) // 파일명 출력
                .map(s -> s.substring(s.indexOf('.') + 1)) // Stream<String> -> Stream<String>
                .peek(s -> System.out.printf("extension=%s%n", s)) // 확장자명 출력
                .forEach(System.out::println);


    }
}
