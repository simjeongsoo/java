package c.casting;

// 자식 클래스
/*
* 상속 관계가 성립되면 ParentCasting() obj = new ChildCasting(); 객체 생성 가능
* ChildCasting() obj2 = new ParentCasting(); 은 불가능
*   -> 자바 컴파일러에서는 자식 객체를 생성할 때 부모 생성자를 사용하면 안됨 (명시적 형변환 필요)
*   -> 참조 자료형은 자식 클래스의 타입을 부모 클래스의 타입으로 형 변환 하면 부모 클래스에서 호출할 수 있는 메소드들은 자식 클래스에서 호출
*       할 수 있으므로 오류가 아님
* */
public class ChildCasting extends ParentCasting {
    public ChildCasting() {
    }
    public ChildCasting(String name) {
    }
    public void printName() {
        System.out.println("printName() - Child");
    }
    public void printAge() {
        System.out.println("printAge() - 18 month");
    }

}
