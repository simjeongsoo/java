package chapter14_lambda;

import java.util.function.Function;
import java.util.function.Supplier;

public class Lamda_Method_Reference {
    public static void main(String[] args) {
//        Function<String, Integer> f = (String s) -> Integer.parseInt(s);
        Function<String, Integer> f = Integer::parseInt; // 메서드 참조
        System.out.println(f.apply("100") + 200);

        //== 생성자의 메서드 참조 ==//
//        Supplier<MyClass> s = () -> new MyClass();
//        Supplier<MyClass> s = MyClass::new;
//        MyClass mc = s.get(); // MyClass 객체 반환
//        System.out.println(mc);
//        System.out.println(s.get());

        // 생성자 파라미터 있을 경우
        Function<Integer, MyClass> s = MyClass::new;
        MyClass mc = s.apply(10);
        System.out.println(mc.iv);
        System.out.println(s.apply(20).iv);

        System.out.println(s.apply(100).iv);
    }
}

class MyClass {
    int iv;

    public MyClass(int iv) {
        this.iv = iv;
    }
}
