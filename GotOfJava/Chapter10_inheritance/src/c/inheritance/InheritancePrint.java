package c.inheritance;

public class InheritancePrint {
    public static void main(String[] args) {
        Child child = new Child();
        //자식 클래스의 생성자가 호출되면, 자동으로 부모 클래스의 매개변수 없는 생성자가 실행
        child.printName();
    }
}
