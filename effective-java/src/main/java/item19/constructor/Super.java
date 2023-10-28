package item19.constructor;

// 재정의 가능 메서드를 호출하는 생성자 - 따라하지 말 것! (p.115)
public class Super {
    // 잘못된 예 - 생성자가 재정의 가능 메서드를 호출 한다. (자기 사용 코드)
    public Super() {
        // Sub 생성자에서 호출
        overrideMe();
    }

    public void overrideMe() {
    }
}
