package chapter12.generics;

public class Ex_1 {
    public static void main(String[] args) {
        BoxEx<String> b = new BoxEx<>();

//        b.setItem(new Object());  // error
        b.setItem("ABC");
        String item = b.getItem();

        System.out.println(item);

    }
}

class BoxEx<T>{

    T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}

