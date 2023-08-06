package chapter14_lambda;

@FunctionalInterface // 함수형 인터페이스는 단 하나의 추상 메서드만 가져야 함
interface MyFunction {
    void run(); // public abstract void run();
}

public class LambdaEx1 {
    static void execute(MyFunction f) { // 매개변수의 타입이 MyFunction인 메서드
        f.run();
    }

    static MyFunction getMyFunction() { // 반환 타입이 MyFunction인 메서드
//        MyFunction f = () -> System.out.println("f3.run()");
//        return f;

        return () -> System.out.println("f3.run()");
    }

    public static void main(String[] args) {
        // 람다식으로 MyFunction의 run()을 구현
        MyFunction f1 = () -> System.out.println("f1.run()");

        MyFunction f2 = new MyFunction() { // 익명 클래스로 run() 구현
            @Override
            public void run() { // public을 반드시 붙여야 함
                System.out.println("f2.run()");
            }
        };

        MyFunction f3 = getMyFunction();

        f1.run();
        f2.run();
        f3.run();

        execute(f1);
        execute(() -> System.out.println("run()"));

    }
}
