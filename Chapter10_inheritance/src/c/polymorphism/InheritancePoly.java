package c.polymorphism;

import c.inheritance.Child;
import c.inheritance.Parent;

public class InheritancePoly {
    public static void main(String[] args) {
        InheritancePoly poly = new InheritancePoly();
        poly.callPrintNames();
    }

    /*
    * 선언시에는 모두 Parent 타입으로 선언 했지만, 실제로 호출된 메소드는 생성자를 사용한 클래스에 있는것이 호출
    *   -> 각 객체의 실제 타입은 다르기 때문
    * 형 변환을 하더라도 실제 호출되는 것은 원래 객체에 있는 메소드가 호출 = 다형성
    * */
    public void callPrintNames() {
        Parent parent1 = new Parent(); // 부모 클래스
        Parent parent2 = new Child(); // 자식클래스1
        Parent parent3 = new ChildOther(); // 자식클래스2

        parent1.printName();
        parent2.printName();
        parent3.printName();

    }
}
