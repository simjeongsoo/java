package item24.localclass;

/**
 * 로컬 클래스
 *  1. 메서드가 길어질 가능성이 큼
 *  2. 거의 사용하지 않음
 */
public class MyClass {

    private int number = 10;

    // 멤버
    void doSomething() {
        // doSomething()의 로컬 클래스
        class LocalClass {
            private void printNumber() {
                System.out.println(number);
            }
        }
        // MyClass의 멤버 메서드에서 인스턴스 생성후 사용
        LocalClass localClass = new LocalClass();
        localClass.printNumber();
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.doSomething();
    }
}
