package c.enums;

public enum OverTimeValues2 {
    //상수값 지정
    THREE_HOUR(18000),
    FIVE_HOUR(30000),
    WEEKEND_FOR_HOUR(40000),
    WEEKEND_EIGHT_HOUR(60000); // ';' 필수

    private final int amount; // OverTimeValues2 생성자에서 매개 변수로 넘겨받은 값을 할당할 때 사용

    OverTimeValues2(int amount) { // enum 클래스의 생성자는 아무것도 명시하지 않은 package-private, private 만 사용 가능
        this.amount = amount;
    }

    // getter
    public int getAmount() {
        return amount;
    }
}
/*
* enum 상수 값을 지정 가능 -> 동적으로 할당 불가
* 각 상수를 enum 클래스 내에서 선언할 때에만 생성자 사용 가능
* enum 클래스는 일반 클래스와 마찬가지로, 컴파일 할 때 자동으로 생성자 를 만들어줌 */