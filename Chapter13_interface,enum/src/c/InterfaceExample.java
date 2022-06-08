package c;

import c.service.MemberManager;
import c.service.MemberManagerImpl;

public class InterfaceExample {
    public static void main(String[] args) {
        // MemberManager 는 Interface 이기 때문에 초기화가 안됨
        MemberManager member = new MemberManagerImpl();
        /*
        * 겉으로 보기에 member 의 타입은 MemberManager 이다.
        * 그리고 MemberManagerImpl 클래스에는 인터페이스에 선언되에어있는 모든 메소드 들이 구현 되어 있음
        * 따라서, 실제  member 의 타입은 MemberManager 가 되기 때문에,
        * member 에 선언된 메소드들을 실행하면 MemberManagerImpl 에 있는 메소드들이 실행
        * */

    }
}
