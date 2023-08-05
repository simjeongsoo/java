package d.collection;

import java.util.Hashtable;
import java.util.Set;

public class HashtableSample {
    public static void main(String[] args) {
        Hashtable<Integer, Integer> hashtable = new Hashtable<>();
        hashtable.put(4, 400);
        hashtable.put(3, 300);
        hashtable.put(6, 600);
        hashtable.put(2, 200);
        hashtable.put(1, 100);
        hashtable.put(5, 500);

        System.out.println(hashtable);

        Set<Integer> ketSet = hashtable.keySet();

        for (int temp : ketSet) {
            System.out.println(temp);
        }

    }
}
