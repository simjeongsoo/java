package chapter12.generics;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Generic generic = new Generic("ss");
        Generic generic2 = new Generic(3);

        generic.print();
        generic2.print();

        List<String> strings = new ArrayList<>();
        List<Integer> integers = new ArrayList<>();

        strings.add("a");
        integers.add(1);

        Generic generic1 = new Generic("list", strings);
        generic1.list.add(integers);
        generic1.print();

    }
}

class Generic<T, V> {
    T value;
    List<V> list;

    public Generic(T value) {
        this.value = value;
    }

    public Generic(T value, List<V> list) {
        this.value = value;
        this.list = list;
    }

    public void print() {
        System.out.println("value : " + value);
        System.out.println(list);
    }
}
