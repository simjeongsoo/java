package tostring;

public class ToString { // Object class 상속
    // toString() == getClass().getName()+'@'+Integer.toHexString(hashCode())
    /* toString() 자동 호출
    * 1. System.out.println() 메소드에 매개 변수로 들어가는 경우
    * 2. 객체에 대하여 더하기 연산을 하는 경우
    * */
    public static void main(String[] args) {
        ToString thisObject = new ToString();
        //thisObject.toStringMethod(thisObject);
        thisObject.toStringMethod2();

    }

    public void toStringMethod(Object obj) { // Object class 의 상속을 자동으로 받음
        System.out.println(obj); // toString()에 의해 String 값 출력
        System.out.println(obj.toString()); // toString()에 의해 String 값 출력
        System.out.println("plus "+obj); // toString()에 의해 String 값 출력
    }
    public void toStringMethod2() { // 매개변수 없는 메소드
        // 자신의 객체를 참조 할때 예약어 this 사용
        System.out.println(this);
        System.out.println(this.toString());
        System.out.println("plus "+this);
    }
    // toString() 메소드 오버라이딩 하지 않을시 return 값 출력
    // DTO 를 사용할때는 toString() 메소드를 Overriding 하는것이 좋음
    public String toString() {
        return "tostring.ToString class";
    }
}
