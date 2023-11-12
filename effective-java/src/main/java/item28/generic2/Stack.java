package item28.generic2;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * 배열을 사용한 코드를 제네릭으로 만드는 방법 2 : 배열의 요소를 꺼내올 때 형변환
 * elements 필드 타입 Object[]
 */
public class Stack<E> {
    private Object[] elements; // 힙 오염의 여지가 없음.
    private int size = 0;
    private static final int INITIAL_CAPACITY = 16;

    public Stack() {
        elements = new Object[INITIAL_CAPACITY];
    }

    public void push(E e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public E pop() {
        if (size == 0) throw new EmptyStackException();

        // push()에서 E 타입만 허용하므로 이 형변환은 안전하다.
        // 배열에서 원소를 읽을때 마다 형변환을 해줘야 한다는 단점!
        @SuppressWarnings("unchecked") E result = (E) elements[--size];

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

    public static void main(String[] args) {
//        Stack stack = new Stack();
//        for (String item : List.of("a", "b", "c")) {
//            stack.push(item);
//        }
//        while (!stack.isEmpty()) {
//            // 제네릭을 사용한다면 사용부 에서 형변환을 하지 않아도 된다! (ClassCastException) 방지
//            System.out.println(((String) stack.pop()).toUpperCase());
//        }

        Stack<String> stringStack = new Stack<>();
        stringStack.push("a");
        stringStack.push("b");

        Object o = stringStack;

        Stack<Integer> integerStack = (Stack<Integer>) o;
        integerStack.push(1);
        integerStack.push(2);

        while (!stringStack.isEmpty()) {
            System.out.println(stringStack.pop().getClass().getName());
//            System.out.println(integerStack.pop());
        }

    }
}
