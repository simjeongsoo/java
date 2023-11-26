package item34;

import java.util.Optional;

public class Operation3Use {
    public static void main(String[] args) {
//        Scanner scr = new Scanner(System.in);
//        double x = scr.nextDouble();
//        double y = scr.nextDouble();
//        for (Operaion3 op3 : Operaion3.values()) {
//            System.out.printf("%f %s %f = %f%n", x, op3, y, op3.apply(x, y));
//        }

        // 문자열로부터 Operation 상수 얻기
        Optional<Operation3> plusOperation = Operation3.fromString("+");
        if (plusOperation.isPresent()) {
            // Operation 상수가 존재하는 경우
            Operation3 operation = plusOperation.get();
            double result = operation.apply(2.0, 3.0);
            System.out.println("Result of + operation: " + result);
        } else {
            // Operation 상수가 존재하지 않는 경우
            System.out.println("Operation not found");
        }

        // 존재하지 않는 연산에 대한 처리
        Optional<Operation3> unknownOperation = Operation3.fromString("#");
        if (unknownOperation.isPresent()) {
            System.out.println("Result of unknown operation: " + unknownOperation.get().apply(2.0, 3.0));
        } else {
            System.out.println("Unknown operation not found");
        }
    }
}
