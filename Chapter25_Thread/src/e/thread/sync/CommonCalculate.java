package e.thread.sync;

// 메소드 자체를 synchronized 로 선언
public class CommonCalculate {
    private int amount; // 인스턴스 변수

    public CommonCalculate() {
        amount=0;
    }

    // plus() 메소드에 thread1 과 thread2 가 동시에 접근하여 결과 오류 -> synchronized 예약어 사용
    // synchronized 사용으로 이 메소드는 동일한 객체를 참조하는 다른 쓰레드에서, 이 메소드를 변경하려고 하면 먼저들어온 쓰레드가 종료될 때 까지 대기
    public synchronized void plus(int value) {
        amount += value;
    }

    // The plus(), minus() methods are thread-safe
    public synchronized void minus(int value) {
        amount -= value;
    }

    public int getAmount() {
        return amount;
    }
}
