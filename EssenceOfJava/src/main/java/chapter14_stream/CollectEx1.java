package chapter14_stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Stream;


// Stream<String> 의 모든 문자열을 하나로 결합해서 String으로 반환하는 ConcatCollector 구현
public class CollectEx1 {
    public static void main(String[] args) {
        String[] strArr = {"aaa", "bbb", "ccc"};
        Stream<String> strStream = Stream.of(strArr);

        String result = strStream.collect(new ConcatCollector());

        System.out.println(Arrays.toString(strArr));
        System.out.println("result = " + result);

    }
}

class ConcatCollector implements Collector<String, StringBuilder, String> {

    @Override
    public Supplier<StringBuilder> supplier() {
        // 작업 결과를 저장할 공간 제공
        return StringBuilder::new;
    }

    @Override
    public BiConsumer<StringBuilder, String> accumulator() {
        // 스트림의 요소를 수집(collect)할 방법을 제공
        return StringBuilder::append;
    }

    @Override
    public BinaryOperator<StringBuilder> combiner() {
        // 두 저장공간을 병합할 방법을 제공(병렬 스트림)
        return StringBuilder::append;
    }

    @Override
    public Function<StringBuilder, String> finisher() {
        // 결과를 최종적으로 변환할 방법을 제공
        return StringBuilder::toString;
    }

    @Override
    public Set<Characteristics> characteristics() {
        return Collections.emptySet();
    }
}
