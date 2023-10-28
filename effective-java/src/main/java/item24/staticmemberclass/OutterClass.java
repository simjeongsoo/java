package item24.staticmemberclass;

/**
 * inner class가 OutterClass의 인스턴스가 필요없다면 정적 멤버 클래스 사용
 */
public class OutterClass {

    // 정적 static 멤버 변수
    private static int number = 10;

    // 정적 static 멤버 클래스
    static private class InnerClass {
        void doSomething() {
            // 바깥 클래스에 있는 static한 멤버에 접근 가능
            // 바깥 클래스의 인스턴스를 필요로 하지 않음(독립적)
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        InnerClass innerClass = new InnerClass();
        innerClass.doSomething();
    }
}
