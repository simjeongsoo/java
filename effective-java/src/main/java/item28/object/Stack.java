package item28.object;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.List;

public class Stack {
    private Object[] elements;
    private int size = 0;
    private static final int INITIAL_CAPACITY = 16;

    public Stack() {
        elements = new Object[INITIAL_CAPACITY];
    }

    public void push(Object e){
        ensureCapacity();
        elements[size++] = e;
    }

    public Object pop() {
        if (size == 0) throw new EmptyStackException();
        Object result = elements[--size];
        elements[size] = null; // 다 쓴 참조 해제
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
        Stack stack = new Stack();
        for (String item : List.of("a", "b", "c")) {
            stack.push(item);
        }
        while (!stack.isEmpty()) {
            // 제네릭을 사용한다면 사용부 에서 형변환을 하지 않아도 된다! (ClassCastException) 방지
            System.out.println(((String) stack.pop()).toUpperCase());
        }
    }
}
