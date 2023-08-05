package c.service;

import c.model.MemberDTO;

// abstract 클래스에는 구현된 메소드가 있을 수 있기 때문에 extends 사용
public class MemberManagerImpl2 extends MemberManagerAbstract{ // 단일상속 규칙
    // MemberManagerAbstract 에 대한 정의

    @Override
    public boolean addMember(MemberDTO member) {
        return false;
    }

    @Override
    public boolean removeMember(String name, String phone) {
        return false;
    }

    @Override
    public boolean updateMember(MemberDTO member) {
        return false;
    }
}
