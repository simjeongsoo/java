package chapter14_lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparatorEx {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("abc", "aaa", "bbb", "ddd", "aaa");

//        Collections.sort(list, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareTo(o2);
//            }
//        });

        // 익명객체를 람다식으로 대체
        Collections.sort(list, (o1, o2) -> o1.compareTo(o2));

        System.out.println(list);

    }
}
