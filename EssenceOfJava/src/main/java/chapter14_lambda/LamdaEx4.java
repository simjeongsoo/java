package chapter14_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LamdaEx4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) list.add(i);

        list.forEach(i -> System.out.print(i + " "));
        System.out.println();

        list.removeIf(x -> x % 2 == 0 || x % 3 == 0); // 2의 배수이거나, 3의 배수이면 삭제
        System.out.println(list);

        Map<String, String> map = new HashMap<>();
        map.put("1", "1");
        map.put("2", "2");
        map.put("3", "3");
        map.put("4", "4");

        map.forEach((k, v) -> System.out.print("{" + k + "," + v + "}"));
        System.out.println();




    }
}
