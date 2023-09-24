package item17;

/**
 * 객체의 상태를 변경하는 메서드(변경자; setter) 를 제공하지 않으면 불변이라고 생각할 수 있는데,
 * 상속으로 인해 불변 클래스가 깨질 수 있다.
 */
public class MyPhoneNumber extends PhoneNumber {
    // PhoneNumber 타입으로 사용할 수 있는 MyPhoneNumber 클래스 -> 불변 클래스를 상속 받으면서 가변 클래스가 됨
    public MyPhoneNumber(short areaCode, short prefix, short lineNum) {
        super(areaCode, prefix, lineNum);
    }

    private String name; // 불변이 아닌 필드

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
