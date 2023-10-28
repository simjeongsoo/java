package item24.memberclass;

/**
 * 특정한 inner class가 바깥 클래스에 대한 인스턴스에 참조하는 경우가 많으면 비정적 멤버 클래스가 적합
 */
public class OutterClass {

    private int number = 10;

    // OutterClass 내부의 인스턴스 메서드에서 생성 하여 사용
    void printNumber() {
        InnerClass innerClass = new InnerClass();
        innerClass.doSomething();
    }

    // 비정적 멤버 클래스
    private class InnerClass {
        void doSomething() {
            // 본인을 감싸고 있는 바깥 클래스의 인스턴스 참조가 암묵적으로 생김(사용 가능)
            //  -> OutterClass 인스턴스 없이는 자기자신을 생성 할 수 없음
            System.out.println(number);

            OutterClass.this.printNumber();
        }
    }

    public static void main(String[] args) {
        // 이렇게 잘 안씀
        InnerClass innerClass = new OutterClass().new InnerClass();
        innerClass.doSomething();
    }

}
