package DTO;

public class ReferenceConstructor {
    public static void main(String[] args) {
        ReferenceConstructor reference = new ReferenceConstructor();
    }
    public void makeMemberObject(){
        MemberDTO dto1 = new MemberDTO();
        MemberDTO dto2 = new MemberDTO("sangmin");
        MemberDTO dto3 = new MemberDTO("sangmin","01011112222");
        MemberDTO dto4 = new MemberDTO("sangmin","01011112222","google@google.com");


    }
}
