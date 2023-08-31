package chapter14_stream;

import java.util.Optional;

public class StreamEx4 {
    public static void main(String[] args) {

        /**
         * of(), ofNullable()
         */
        String str = "abc";
        Optional<String> optVal = Optional.of(str);
        Optional<String> optVal2 = Optional.of("abc");
        Optional<String> optVal3 = Optional.of(new String("abc"));

        Optional<Object> optVal4 = Optional.of(null); // NPE 발생
        Optional<Object> optVal5 = Optional.ofNullable(null); // ok

        Optional<String> optVal6 = null; // null로 초기화
        Optional<String> optVal7 = Optional.<String>empty(); // 빈 객체로 초기화

        /**
         * get(), orElse()
         */
        Optional<String> optVal8 = Optional.of("abc");
        String str1 = optVal8.get(); // null이면 예외발생
        String str2 = optVal8.orElse(""); // null일 경우 , "" 반환
    }
}
