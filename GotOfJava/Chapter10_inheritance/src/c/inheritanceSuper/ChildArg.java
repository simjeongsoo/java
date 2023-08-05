package c.inheritanceSuper;

public class ChildArg extends ParentArg {

    // ParentArg 클래스의 매개변수가 없는 기본 생성자가 없다는 에러 발생
    // 1. 부모 클래스에 "매개변수가 없는" 기본 생성자 생성
    // 2. 자식 클래스에서 부모 클래스의 생성자를 명시적으로 지정하는 super() 사용
    public ChildArg() {

        super("ChildArg");

        //호출하고자 하는 생성자의 기본타입을 넘겨주지 않으면 오류 발생
        //super(null);

        System.out.println("Child Constructor");

        // 부모클래스의 printName() 메소드 호출
        //super.printName();
    }


}
