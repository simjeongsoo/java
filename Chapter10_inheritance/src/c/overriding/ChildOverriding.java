package c.overriding;

public class ChildOverriding extends ParentOverriding{
    public ChildOverriding() {
        System.out.println("ChildOverriding Constructor");
    }

    //@Override
    public void printName() {
        //super.printName();
        System.out.println("ChildOverriding printName()");
    }

    /* 부모 클래스에 printName() 이라는 메소드가 있는 이상 자식은 메소드의 리턴 타입을 마음대로 바꾸지 못한다
    public String printName() {
        System.out.println("ChildOverriding printName()");
    }
     */

    /* 메소드 오버라이딩에서 접근제어자가 확대되는것은 문제가 없지만 축소 되는 것은 오류 발생
            -> ParentOverridingPrivate() 에서 확인
    private void printName(){
        System.out.println("ChildOverriding printName()");
    }
     */


}
