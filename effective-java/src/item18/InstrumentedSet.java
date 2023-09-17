package item18;

import java.util.*;

/**
 * HashSet의 모든 기능을 재정의한 Set 인터페이스를 활용해 설계되어 견고하고 유연하다.
 * Set 인터페이스를 구현한 다른 클래스를 포함하고 있으며, 기존 Set의 기능을 유지하면서 추가적인 동작을 수행 - 래퍼클래스
 * @param <E>
 */
public class InstrumentedSet<E> extends ForwardingSet<E> {
    private int addCount = 0;

    public InstrumentedSet(Set<E> s) {
        super(s);
    }

    @Override public boolean add(E e) {
        addCount++;
        return super.add(e);
    }

    @Override public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return super.addAll(c);
    }

    public int getAddCount() {
        return addCount;
    }

    public static void main(String[] args) {
        // HashSet을 생성하고 InstrumentedSet으로 래핑합니다.
        Set<String> originalSet = new HashSet<>();
        InstrumentedSet<String> instrumentedSet = new InstrumentedSet<>(originalSet);
//
//        // 요소를 추가하면서 addCount 값이 증가합니다.
//        instrumentedSet.add("apple");
//        instrumentedSet.add("banana");
//        instrumentedSet.add("cherry");
//
//        // getAddCount 메서드를 사용하여 addCount 값을 얻습니다.
//        int addCount = instrumentedSet.getAddCount();
//        System.out.println("addCount: " + addCount); // 출력: addCount: 3

        // 컬렉션을 추가하면서 addCount 값이 증가합니다.
        Set<String> elementsToAdd = new HashSet<>();
        elementsToAdd.add("apple");
        elementsToAdd.add("banana");
        elementsToAdd.add("cherry");
        instrumentedSet.addAll(elementsToAdd);

        // getAddCount 메서드를 사용하여 addCount 값을 얻습니다.
        int addAllCount = instrumentedSet.getAddCount();
        System.out.println("addCount: " + addAllCount); // 출력: addCount: 3
    }
}
