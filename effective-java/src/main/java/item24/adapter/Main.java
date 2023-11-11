package item24.adapter;

import item24.memberclass.MySet;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        MySet<Integer> set = new MySet<>();

        set.add(1);
        set.add(2);
        set.add(3);

        System.out.println("===MySet iterator start===");
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
