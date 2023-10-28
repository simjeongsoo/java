package item24.memberclass;

import java.util.AbstractSet;
import java.util.Iterator;

/**
 * 어댑터 패턴
 * @param <E>
 */
public class MySet<E> extends AbstractSet<E> {

    @Override
    public Iterator<E> iterator() {
        return new MyIterator();
    }

    @Override
    public int size() {
        return 0;
    }

    /**
     * 어댑터
     * 클래스의 타입을 원하는 타입으로 변환
     */
    private class MyIterator implements Iterator<E> {
        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public E next() {
            return null;
        }
    }

}
