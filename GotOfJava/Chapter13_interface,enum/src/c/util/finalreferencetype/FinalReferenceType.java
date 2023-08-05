package c.util.finalreferencetype;

import c.model.MemberDTO;

/*
* 참조 자료형에 final 선언
* 두번 이상 값을 할당 하거나 새로 생성자를 사용하여 초기화 할 수 없다
* */
public class FinalReferenceType {
    final MemberDTO dto = new MemberDTO();

    public static void main(String[] args) {
        FinalReferenceType referenceType = new FinalReferenceType();
        referenceType.checkDTO();
    }
    public void checkDTO() {
        System.out.println(dto);
//        dto = new MemberDTO(); //cannot assign a value to final variable dto
        dto.name = "java"; // dto 객체 안에 있는 인스턴스 변수나 클래스 변수가 final 이 아니므로 제약이 없음
        System.out.println(dto);
    }
}
/*
* dto 객체, 즉 MemberDTO 클래스의 객체는 FinalReferenceType 클래스에서 두번 이상 생성 할 수 없다
* 하지만, 그 안의 객체들은 final 로 선언된 것이 아니기 때문에 그러한 제약이 없다
*   -> MemberDTO 에 선언 되어 있는 name,phone,email 모두 final 이 아니기 때문
* */

