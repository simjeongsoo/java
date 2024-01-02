package item44;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiPredicate;

public class MyCache<K, V> extends LinkedHashMap<K, V> {
    private static final int MAX_ENTRIES = 100;


    // 함수형 인터페이스를 사용하여 removeEldestEntry를 구현
    private final BiPredicate<Map.Entry<K, V>, Integer> shouldRemoveEldest =
            (eldest, size) -> size > MAX_ENTRIES;

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return shouldRemoveEldest.test(eldest, size());
    }

    // removeEldestEntry 메서드를 재정의하여 캐시 동작 설정
//    @Override
//    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
//        return size() > MAX_ENTRIES;
//    }

    // 캐시에서 값을 가져오는 메서드
    public V getCachedValue(K key) {
        return get(key);
    }

    // 캐시에 값을 추가하는 메서드
    public void addValueToCache(K key, V value) {
        put(key, value);
    }

    public static void main(String[] args) {
        MyCache<String, Integer> cache = new MyCache<>();

        // 100개의 엔트리 추가
        for (int i = 0; i < 100; i++) {
            cache.addValueToCache("Key" + i, i);
        }

        // 맵 크기 확인 (100)
        System.out.println("Map size: " + cache.size());

        // 이제 추가하면서 가장 오래된 엔트리 제거됨
        cache.addValueToCache("NewKey", 101);

        // 맵 크기 확인 (유지할 엔트리 수인 100)
        System.out.println("Map size after adding new entry: " + cache.size());
    }
}
