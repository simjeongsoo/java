package c.enums;

public class OverTimeManager {
    public static void main(String[] args) {
        OverTimeManager manager = new OverTimeManager();

//        enum 타입은 " enum 클래스 이름.상수이름 " 을 지정함으로써 클래스의 객체 생성이 되는 개념
//        enum 타입은 생성자를 만들 수 있지만, 생성자를 통하여 객체를 생성 할 수는 없다
        int myAmount = manager.getOverTimeAmount(OverTimeValues.THREE_HOUR);
        System.out.println(myAmount);
    }

    public int getOverTimeAmount(OverTimeValues values) {
        int amount = 0;
        System.out.println(values);

        switch (values) {
            case THREE_HOUR:
                amount = 18000;
                break;
            case FIVE_HOUR:
                amount = 30000;
                break;
            case WEEKEND_FOR_HOUR:
                amount = 40000;
                break;
            case WEEKEND_EIGHT_HOUR:
                amount = 60000;
                break;
        }
        return amount;
    }
}
