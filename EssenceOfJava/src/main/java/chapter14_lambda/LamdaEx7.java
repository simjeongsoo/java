package chapter14_lambda;

import java.util.function.Function;
import java.util.function.Predicate;

public class LamdaEx7 {
    public static void main(String[] args) {
        Function<String, Integer> f = (s) -> Integer.parseInt(s, 16); // 16진수 변환
        Function<Integer, String> g = Integer::toBinaryString;

        Function<String, String> h = f.andThen(g); // f의 출력과 g의 입력이 같을때 결합
        Function<Integer, Integer> h2 = f.compose(g); // g.andThen(f)

        System.out.println(h.apply("FF"));
        System.out.println(h2.apply(2));

        Function<String, String> f2 = x -> x; // 항등함수(Identity Function)
        System.out.println(f2.apply("AAA"));

        Predicate<Integer> p = i -> i < 100;
        Predicate<Integer> q = i -> i < 200;
        Predicate<Integer> r = i -> i%2 == 0;
        Predicate<Integer> notP = p.negate(); // i >= 100

        Predicate<Integer> all = notP.and(q.or(r));
        System.out.println(all.test(150)); // true

        String str1 = new String("abc");
        String str2 = new String("abc");

        Predicate<String> p2 = Predicate.isEqual(str1);
//         Boolean result = str1.equals(str2);
        boolean result = Predicate.isEqual(str1).test(str2);
        System.out.println(result);
        System.out.println(p2.test(str2));

    }
}
