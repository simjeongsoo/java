package chapter11;

import java.util.*;

public class ArrayListLinkedListTest {
    public static void main(String[] args) {
        ArrayList al = new ArrayList(20000);
        LinkedList ll = new LinkedList();

        System.out.println("= add sequentially =");
        System.out.println("ArrayList : "+ add1(al));
        System.out.println("LinkedList : "+ add1(ll));
        System.out.println();

        Collection c = new HashSet();
    }

    public static long add1(List list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) list.add(i + "");
        long end = System.currentTimeMillis();
        return end - start;
    }
}