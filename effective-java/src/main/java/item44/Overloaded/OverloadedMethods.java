package item44.Overloaded;

@FunctionalInterface
interface StringProcessor {
    String process(String input);
}

@FunctionalInterface
interface IntegerProcessor {
    int process(int input);
}

public class OverloadedMethods {

    // 다중정의: 같은 위치의 인수로 서로 다른 함수형 인터페이스를 받음
    public static String processValue(StringProcessor processor, String value) {
        return processor.process(value);
    }

    public static int processValue(IntegerProcessor processor, int value) {
        return processor.process(value);
    }

    public static void main(String[] args) {
        StringProcessor stringProcessor = str -> str.toUpperCase();
        IntegerProcessor integerProcessor = num -> num * 2;

        // 다중정의된 메서드 호출
        String result1 = processValue(stringProcessor, "hello");
        int result2 = processValue(integerProcessor, 5);

        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
    }
}
