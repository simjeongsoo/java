package d.collection;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapSample {
    public static void main(String[] args) {
        TreeMapSample sample = new TreeMapSample();
        sample.checkTreeMap();
    }

    // 키를 정렬하여 저장하는 TreeMap(SortMap 인터페이스 구현) , 정렬 순서 : 숫자 > 알파벳 대문자 > 알파벳 소문자 > 한글
    // HashMap 보다 성능 저하
    // firstKey() lastKey() HigherKey() lowerKey() 메소드 제공
    public void checkTreeMap() {
        TreeMap<String, String> map = new TreeMap<>();
        map.put("A", "a");
        map.put("가", "e");
        map.put("1", "f");
        map.put("a", "g");
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> tempEntry : entries) {
            System.out.println(tempEntry.getKey() + " = " + tempEntry.getValue());
        }
    }
}
