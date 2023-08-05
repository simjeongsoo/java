package c.service;

import c.model.MemberDTO;

// MemberDTO 를 관리하는 클래스
public class MemberManagerImpl implements MemberManager{ // implements 뒤에는 인터페이스가 여러개 존재 가능
    // MemberManager 인터페이스에 대한 정의
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
