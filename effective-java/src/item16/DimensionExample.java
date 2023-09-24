package item16;

import java.awt.*;

/**
 * 내부를 노출한 Dimension 클래스의 성능 문제
 * 1. Dimension 내부 로직의 성능 문제가 아닌 사용자가 코딩시 안정성을 보장 해 줘야 한다.
 * 2. 안전성을 보장하기 위해 인스턴스를 copy 하여 사용하는 경우, 불필요한 인스턴스를 생성해 성능에 영향을 준다.
 * 3. 하지만 인스턴스를 수백만 개를 만드는 것이 아닌 이상 유의미한 성능 문제?
 * 4. 주요 논점은 사용자가 안정성을 보장해야 하는 불편함과 불안정함이 존재한다.
 */
public class DimensionExample {

    public static void main(String[] args) {
        Button button = new Button("hello world"); // 버튼 생성
        button.setBounds(0, 0, 20, 10); // 위치 좌표 설정

        // Dimension 인스턴스에 직접 접근하여 필드 사용
        Dimension size = button.getSize();

        doSomething(size);

        System.out.println(size.height);
        System.out.println(size.width);
    }

    private static void doSomething(Dimension d) {
        Dimension localD = new Dimension();
        localD.height = d.height;
        localD.width = d.width;
    }
}
