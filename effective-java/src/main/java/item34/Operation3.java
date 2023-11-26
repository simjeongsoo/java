package item34;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum Operation3 {
    PLUS("+")    {public double apply(double x, double y){return x + y;}},
    MINUS("-")   {public double apply(double x, double y){return x - y;}},
    TIMES("*")   {public double apply(double x, double y){return x * y;}},
    DIVIDE("/")  {public double apply(double x, double y){return x / y;}};

    private final String symbol;

    Operation3(String symbol) {
        this.symbol = symbol;
    }
    @Override public String toString() {
        return symbol;
    }
    public abstract double apply(double x, double y);

    // 열거 타입 상수 생성 후 정적 필드가 초기화될 때 추가됨.
    private static final Map<String, Operation3> stringToEnum =
            Stream.of(values()).collect(Collectors.toMap(Object::toString, e->e));

    // 지정한 문자열에 해당하는 Operaion을(존재한다면) 반환한다.
    public static Optional<Operation3> fromString(String symbol) {
        // 주어진 연산이 가리키는 상수가 존재하지 않을 수 있음
        return Optional.ofNullable(stringToEnum.get(symbol));
    }
}
