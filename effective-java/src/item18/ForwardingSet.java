package item18;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/**
 * Set 인터페이스 구현
 * 임의의 Set에 계측 기능을 덧씌워 새로운 Set으로 만드는 것이 핵심!
 * @param <E>
 */
public class ForwardingSet<E> implements Set<E> {

    // 새로운 클래스를 만들고 private 필드로 기존 클래스의 인스턴스를 참조하게 하자.
    private final Set<E> s;

    // Set의 인스턴스를 인수로 받는 생성자 제공
    public ForwardingSet(Set<E> s) {
        this.s = s;
    }

    public void clear() { s.clear(); }
    public boolean contains(Object o) { return s.contains(o); }
    public boolean isEmpty() { return s.isEmpty(); }
    public int size() { return s.size(); }
    public Iterator<E> iterator() { return s.iterator(); }
    public boolean add(E e) { return s.add(e); }
    public boolean remove(Object o) { return s.remove(o); }
    public boolean containsAll(Collection<?> c)
    { return s.containsAll(c); }
    public boolean addAll(Collection<? extends E> c)
    { return s.addAll(c); }
    public boolean removeAll(Collection<?> c)
    { return s.removeAll(c); }
    public boolean retainAll(Collection<?> c)
    { return s.retainAll(c); }
    public Object[] toArray() { return s.toArray(); }
    public <T> T[] toArray(T[] a) { return s.toArray(a); }

    @Override public boolean equals(Object o)
    { return s.equals(o); }
    @Override public int hashCode() { return s.hashCode(); }
    @Override public String toString() { return s.toString(); }
}
