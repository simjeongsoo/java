package item28;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * 배열을 사용한 코드를 제네릭으로 만드는 방법 1
 * 배열 elements는 push(E)로 넘어온 E 인스턴스만 담는다.
 * 따라서 타입 안정성을 보장하지만, 이 배열의 런타임 타입은 E[] 가 아닌 Object[]다.
 */
public class GenericStack<E> {
    private E[] elements; // 힙 오염 발생 가능성 있음
    private int size = 0;
    private static final int INITIAL_CAPACITY = 16;

   /**
    * 1. Object로 들어온 타입을 <E>로 제한해 주었기 때문에 [비검사 형변환 경고] 무시 가능
    * 2. elements 는private 필드에 저장, 클래스 내부에서만 사용
    *  -> 만약 클라이언트로 반환되거나, 다른 메서드에 전달된다면 배열 안의 요소 타입을 바꿀 수 있기때문에 위험
    */
    @SuppressWarnings("unchecked")
    public GenericStack() {
        /*
        * item 28. E와 같은 실체화 불가 타입으로는 배열을 만들 수 없다.
        * elements = new E[INITIAL_CAPACITY];  -> 컴파일 되지 않음
        * */

        // 런타임에 E[] 제네릭은 소거되기 때문에 Object 배열로 동작
        // 하지만 사용할때 E[] 타입으로 꺼내서 사용 가능
        elements = (E[]) new Object[INITIAL_CAPACITY]; // 형변환을 배열 생성시 한 번만 하는 장점
    }

    public void push(E e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public E pop() {
        if (size == 0) throw new EmptyStackException();

        E result = elements[--size];
        elements[size] = null;  // 다 쓴 참조 해제
        return result;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void ensureCapacity() {
        if (elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }
}
