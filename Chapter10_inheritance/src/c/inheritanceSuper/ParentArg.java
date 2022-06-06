package c.inheritanceSuper;

import c.inheritance.InheritancePrint;

public class ParentArg {

    //String 매개 변수를 받는 생성자
    public ParentArg(String name) {
        System.out.println("ParentArg("+name+") Constructor");
    }

    //InheritancePrint 클래스의 객체를 매개 변수로 받는 생성자
    public ParentArg(InheritancePrint obj) {
        System.out.println("ParentArg(InheritancePrint) Constructor");
    }

    //메소드
    public void printName() {
        System.out.println("printName() - ParentArg");
    }
}
