package c.service;

import c.model.MemberDTO;

// 외부에 노출되는 것을 정의 하고자 할때 사용
public interface MemberManager {
    public boolean addMember(MemberDTO member);

    public boolean removeMember(String name, String phone);

    public boolean updateMember(MemberDTO member);
}
