package DTO;

public class MemberDTO {
    public String name;
    public String phone;
    public String email;

    public MemberDTO(){
        // no data
    }

    public MemberDTO(String name){
        //이름
        this.name=name;
    }
    public MemberDTO(String name,String phone){
        // 이름, 전화번호
        this.name = name;
        this.phone=phone;
    }
    public MemberDTO(String name, String phone, String email){
        // all data
        this.name = name;
        this.phone=phone;
        this.email=email;
    }
}
