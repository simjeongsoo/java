package chapter14_lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LamdaEx5 {
    public static void main(String[] args) {
        Supplier<Integer> s = () -> (int) (Math.random() * 100) + 1; // 1~100 사이의 난수 반환
        Consumer<Integer> c = i -> System.out.print(i + ", ");
        Predicate<Integer> p = i -> i % 2 == 0; // 짝수 검사
        Function<Integer, Integer> f = i -> i / 10 * 10; // i의 일의 자리를 없앤다.

        List<Integer> list = new ArrayList<>();
        makeRandomList(s, list); // list 를 랜덤값 으로 채움
        System.out.println("랜덤값 10개 추출 list : " + list);
        printEvenNum(p, c, list); // 짝수 출력
        List<Integer> newList = doSomething(f, list);
        System.out.println("일의 자리 없앤 newList : "+ newList);
    }

    static <T> List<T> doSomething(Function<T, T> f, List<T> list) {
        List<T> newLists = new ArrayList<T>(list.size());

        for (T i : list) {
            newLists.add(f.apply(i)); // 일의 자리를 없애서 새로운 list 에 저장
        }

        return newLists;
    }

//    Consumer<Integer> c = i -> System.out.print(i + ", ");
//    Predicate<Integer> p = i -> i % 2 == 0; // 짝수 검사
    static <T> void printEvenNum(Predicate<T> p, Consumer<T> c, List<T> list) {
        System.out.print("짝수만 Consumer : [");
        for (T i : list) {
            if (p.test(i)) { // 짝수인지 검사
                c.accept(i); // true 인 경우 Consumer로 처리
            }
        }
        System.out.println("]");
    }

    static <T> void makeRandomList(Supplier<T> s, List<T> list) {
        for (int i = 0; i < 10; i++) {
            list.add(s.get()); // Supplier로 부터 1~100의 난수를 받아서 list 추가
        }
    }
}
