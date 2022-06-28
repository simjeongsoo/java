package d.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapSample {
    public static void main(String[] args) {
        MapSample sample = new MapSample();
//        sample.checkHashMap();
        sample.checkKeySet();
//        sample.checkValues();
//        sample.checkHashMapEntry();
//        sample.checkContains();
//        sample.checkRemove();
    }

    // basic HashMap
    public void checkHashMap() {
        HashMap<String, String> map = new HashMap<String,String>(); // HashMap 클래스의 객체를 생성
        map.put("A", "a"); // 데이터를 넣음
        System.out.println(map.get("A")); // a
        System.out.println(map.get("B")); // null

        map.put("A", "B"); // 이미 존재하는 키로 값을 넣을 때는 기존의 값을 새로운 값으로 대치
        System.out.println(map.get("A")); //B
    }

    // KeySet() 메소드 확인
    public void checkKeySet() {
        HashMap<String, String> map = new HashMap<>();
        map.put("C", "c");
        map.put("A", "a");
        map.put("E", "e");
        map.put("D", "d");
        Set<String> keySet = map.keySet(); // keySet 이라는 Set 타입의 변수를 선언 , map 의 keySet() 메소드 수행 결과 할당

        for (String tempKey : keySet) { // tempKey = 키 , map.get(tempKey) = 값
            // tempKey 변수에 할당되는 값들은 HashMap 에 담겨있는 키값이 될 것이므로, get() 메소드를 사용하여 값을 확인
            System.out.println(tempKey + " = " + map.get(tempKey));
        }
    }

    // HashMap 객체에 담겨있는 값만 필요할때 사용하는 values() 메소드
    public void checkValues() {
        HashMap<String, String> map = new HashMap<>();
        map.put("A", "a");
        map.put("C", "c");
        map.put("D", "d");

        Collection<String> values = map.values(); // values() 는 HashMap 에 담겨있는 목록을 Collection 타입의 목록으로 리턴
        for (String tempValue : values) {
            System.out.println(tempValue);
        }
    }

    // entrySet()
    public void checkHashMapEntry() {
        HashMap<String, String> map = new HashMap<>();
        map.put("A", "a");
        map.put("B", "b");
        map.put("C", "c");
        map.put("D", "d");

        // map 의 entrySet() 메소드를 호출하면 Set 타입으로 리턴하며, 그 Set 내에는 Entry 타입으로 데이터가 저장
        // 이 Entry 에는 단하나의 키와 값만이 저장
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> tempEntry : entries) {
            System.out.println(tempEntry.getKey() + " = " + tempEntry.getValue()); // getKey() getValue() 로 키와 값 호출
        }
    }

    // containsKey() containsValue() , Map 에 어떤 키나 값이 존재하는지를 확인하는 메소드 , boolean 값 리턴
    public void checkContains() {
        HashMap<String, String> map = new HashMap<>();
        map.put("A", "a");
        map.put("B", "b");
        map.put("C", "c");
        map.put("D", "d");

        System.out.println(map.containsKey("A"));
        System.out.println(map.containsKey("Z"));
        System.out.println(map.containsValue("a"));
        System.out.println(map.containsValue("z"));
    }

    // 데이터를 삭제하는 remove() 메소드
    public void checkRemove() {
        HashMap<String, String> map = new HashMap<>();
        map.put("A", "a");
        map.remove("A");
        System.out.println(map.size()); // result = 0

    }
}
