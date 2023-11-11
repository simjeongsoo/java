package item24.memberclass;

import java.util.AbstractSet;
import java.util.HashSet;
import java.util.Iterator;

/**
 * 어댑터 : 클래스의 타입을 원하는 타입으로 변환
 * - AbstractSet 을 상속/구현한 MySet 클래스
 *      1. iterator() 오버라이드
 *          - Iterator 인터페이스의 구현체인 FakeIterator를 클래스의 인스턴스 반환
 */
public class MySet<E> extends AbstractSet<E> { // 1. AbstractSet 을 상속받은 MySet 클래스

    // 기존의 HashSet을 이용하여 AbstractSet의 인터페이스를 구현 + FakeIterator를 통해 외부에서 커스텀된 Iterator를 사용
    private HashSet<E> set = new HashSet<>();

    @Override
    public Iterator<E> iterator() {
        // 실제 구현은 내부적으로 FakeIterator의 인스턴스를 생성하여 반환
        return new CustomIterator();
    }

    @Override
    public int size() {
        return set.size();
    }

    @Override
    public boolean add(E e) {
        return set.add(e);
    }

    /**
     *
     * - Iterator 인터페이스를 구현하고 있는 MyIterator
     *      1. 외부에서 사용되는 Iterator의 역할을 함
     *      2. 내부적으로는 어댑터로 동작
     */
        private class CustomIterator implements Iterator<E> {
            private Iterator<E> iterator = set.iterator(); // MySet의 iterator를 사용
        @Override
        public boolean hasNext() {
            System.out.println("using : RealIterator hasNext()");
            return iterator.hasNext();
        }

        @Override
        public E next() {
            System.out.println("using : RealIterator next()");
            return iterator.next();
        }
    }

}
