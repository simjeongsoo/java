package DTO;

public class ReferenceString {
    ReferenceString(){}
    ReferenceString(String arg){}
    public static void main(String[] args) {
        ReferenceString referenceString = new ReferenceString();
    }

    public MemberDTO getMemberDTO(){ // 리턴타입을 DTO로 선언 하고 객체를 리턴 하면 DTO에 들어있는 데이터타입을 리턴할수있음
        MemberDTO memberDTO = new MemberDTO();
        return memberDTO;
    }

}

