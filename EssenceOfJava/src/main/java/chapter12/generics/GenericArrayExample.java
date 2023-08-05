package chapter12.generics;

import java.lang.reflect.Array;

public class GenericArrayExample<T> {
    private Class<T> type;
    private T[] array;

    public GenericArrayExample(Class<T> type, int size) {
        this.type = type;
        this.array = (T[]) Array.newInstance(type, size);
    }

    public void set(int index, T value) {
        array[index] = value;
    }

    public T get(int index) {
        return array[index];
    }

    public static void main(String[] args) {
        GenericArrayExample<String> example = new GenericArrayExample<>(String.class, 5);

        example.set(0, "Hello");
        example.set(1, "World");

        System.out.println(example.get(0));
        System.out.println(example.get(1));
    }
}

