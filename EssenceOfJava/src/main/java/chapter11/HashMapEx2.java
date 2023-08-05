package chapter11;

import java.util.*;

public class HashMapEx2 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("kim", new Integer(100));
        map.put("lee", new Integer(100));
        map.put("kim", new Integer(80));
        map.put("ann", new Integer(90));

        Set set = map.entrySet();
        Iterator it = set.iterator();

        while (it.hasNext()) {
            Map.Entry e = (Map.Entry) it.next();
            System.out.println("name : " + e.getKey() + ", score : " + e.getValue());
        }

        set = map.keySet();
        System.out.println("all entry : " + set);

        Collection value = map.values();
        it = value.iterator();

        int total = 0;

        while (it.hasNext()) {
            Integer i = (Integer) it.next();
            total += i.intValue();
        }

        System.out.println("total : " + total);
        System.out.println("avg : " + (float) total / set.size());
        System.out.println("max score : " + Collections.max(value));
        System.out.println("min score : " + Collections.min(value));
    }
}
