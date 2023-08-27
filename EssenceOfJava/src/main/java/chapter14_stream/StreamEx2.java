package chapter14_stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx2 {
    public static void main(String[] args) {
        Stream<String[]> strArrStream = Stream.of(
                new String[]{"abc", "def", "ghi"},
                new String[]{"ABC", "DEF", "GHI"}
        );

        Stream<Stream<String>> strStrStream = strArrStream.map(Arrays::stream);

        Stream<String> strStream = strArrStream.flatMap(Arrays::stream);

        Stream<String> abc = Stream.of("abc", "def", "jklimn");
        Stream<String> abc1 = Stream.of("ABC", "DEF", "JKLMN");

        Stream<Stream<String>> abc2 = Stream.of(abc, abc1);
        Stream<String> stringStream = abc2
                .map(s -> s.toArray(String[]::new))
                .flatMap(Arrays::stream);


    }
}
