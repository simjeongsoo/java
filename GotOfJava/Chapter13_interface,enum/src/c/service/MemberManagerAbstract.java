package c.service;

import c.model.MemberDTO;

public abstract class MemberManagerAbstract {
    public abstract boolean addMember(MemberDTO member);

    public abstract boolean removeMember(String name, String phone);

    public abstract boolean updateMember(MemberDTO member);

    public void printLog(String data) {
        System.out.println("Data="+data);
    }
}

/*
*  abstract 클래스는 클래스 선언시 abstract 라는 예약어가 클래스 앞에 추가되면 된다
*  abstract 클래스 안에는 abstract 으로 선언된 메소드가 0개 이상 있으면 된다
*  abstract 으로 선안된 메소드가 하나라도 있으면, 그 클래스는 반드시 abstract 로 선언되어야만 한다
*  abstract 클래스는 몸통이 있는 메소드가 0개 이상 있어도 전혀 상관 없으며, static 이나 final 메소드가 선언되어 있으면 안된다
* */
