package item19.constructor;

import java.time.Instant;

// 생성자에서 호출하는 메서드를 재정의했을 때의 문제점을 보여준다 (p.126)
public class Sub extends Super {
    // 초기화 되지 않은 final 필드. 생성자에서 초기화 한다
    private final Instant instant;

    Sub() {
//        Super() 상위 클래스 생성자 호출중
        instant = Instant.now();
    }

    // 재정의 가능 메서드. 상위 클래스의 생성자가 호출 한다.
    @Override public void overrideMe() {
        System.out.println(instant);
    }

    public static void main(String[] args) {
        // Sub 클래스 객체 생성(Sub 클래스의 인스턴스)
        // Super 클래스 타입의 참조변수 sub로 참조
        Super sub = new Sub();
        sub.overrideMe(); // Sub 클래스의 overrideMe() 메서드가 호출됨

        // result
        // null
        // now()
    }
}
