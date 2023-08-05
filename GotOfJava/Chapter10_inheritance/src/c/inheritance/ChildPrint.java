package c.inheritance;

public class ChildPrint extends Parent{
    public ChildPrint(){
        System.out.println("Child Constructor");
    }
    //확장한 클래스는 추가적인 메소드를 만들어도 문제가 없음
    public void printAge(){
        System.out.println("printAge() - 18 month");
    }

}
