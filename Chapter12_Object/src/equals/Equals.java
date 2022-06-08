package equals;

public class Equals {
    public static void main(String[] args) {
        Equals equals = new Equals();
        //equals.equalMethod();
        //equals.equalMethod2();

        MemberDTO dto1 = new MemberDTO("java");
        MemberDTO dto2 = new MemberDTO("java");

        // 어떤 두 객체가 동일하다면, hashCode() 도 동일 해야 함
        // equals() 메소드를 Override 하면, hashCode() 메소드도 override 해서 동일한 결과가 나오도록 해야함
        System.out.println("dto1.equals(dto2) : "+dto1.equals(dto2));
        System.out.println("dto1.hashCode() : "+dto1.hashCode());
        System.out.println("dto2.hashCode() : "+dto2.hashCode());

        /*
        * 두 객체를 equals() 메소드를 사용하여 비교한 결과 false 를 리턴 했다고 해서, hashCode() 메소드를 호출한
        * int 값이 무조건 달라야 할 필요는 없음
        * 이 경우에 서로 다른 int 값을 제공하면 hashtable 의 성능을 향상시키는데 도움이 됨
        * */
    }
    public void equalMethod() {
        MemberDTO obj1 = new MemberDTO("SangMin");
        MemberDTO obj2 = new MemberDTO("SangMin");
        if (obj1 == obj2) {
            System.out.println("obj1 and obj2 is same");
        } else {
            System.out.println("obj1 and obj2 is different");
        }
    }
    public void equalMethod2() {
        MemberDTO obj1 = new MemberDTO("SangMin");
        MemberDTO obj2 = new MemberDTO("SangMin");
        if (obj1.equals(obj2)) {
            System.out.println("obj1 and obj2 is same");
        } else {
            System.out.println("obj1 and obj2 is different");
        }
    }
}
