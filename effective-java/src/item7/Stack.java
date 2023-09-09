package item7;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * <h2> 다 쓴 객체 참조를 해제하라</h2>
 * 이 stack 클래스에는 메모리 누수가 일어난다. <br>
 * 메모리 누수가 일어나게 되면, 점차 가비지컬렉션 활동과 메모리 사용량이 늘어나 결국 성능이 저하될 것이다. <br>
 * ex) disk paging, OOM <br>
 */
public class Stack {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
    }

    /**
     * <h3>메모리 누수가 일어나는 pop()</h3>
     * 이 코드에서는 스택이 커졌다 줄어들었을 때 스택에서 꺼내진 객체들을 gc가 더이상 회수하지 않는다. <br>
     * 이 스택은 다 쓴 참조(obsolete reference)를 여전히 가지고 있기 때문이다. <br>
     * <p>&nbsp;-> elements 배열 의 활성 영역 : index > size <br>
     * <p>&nbsp;-> 다 쓴 참조(obsolete reference) : elements 배열의 활성 영역 밖의 참조들 <br>
     */
    public Object memoryLeakPop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        return elements[--size]; // 다 쓴 참조가 생김
    }

    /**
     * <h3>메모리 누수를 해결한 pop()</h3>
     * 해당 참조를 다 사용했을 때 null 처리(참조 해제) <br>
     * <p>&nbsp;-> null처리 한 참조를 실수로 사용하면 NPE가 터짐(조기 발견)
     * <p>&nbsp;-> 모든 객체를 null처리 할 필요는 없음 : 예외적인 경우에만 null처리
     */
    public Object pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        Object result = elements[size--]; // Object 객체에 담아 return
        elements[size] = null; // 각 원소의 참조가 더 이상 필요없어지는 시점 -> 참조 해제
        return result;
    }


    /**
     * 원소를 위한 공간을 적어도 하나 이상 확보한다. <br>
     * 배열 크기를 늘려야 할 때마다 대략 두 배씩 늘린다.
     */
    private void ensureCapacity() {
        if (elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }
}
