package e.thread.sync;

// synchronized 블록 (synchronized statements)
public class CommonCalculate2 {
    private int amount; // 인스턴스 변수

    public CommonCalculate2() {
        amount=0;
    }

    // 메소드 전체를 synchronized 로 선언하면 나머지 소스코드를 처리 할때 필요없는 대기 시간이 발생하기 때문에
    // synchronized 가 필요한 변수를 처리하는 부분만 synchronized 블록으로 감싸줌
    public void plus(int value) {
        synchronized (this) {
            amount += value;
        }
    }

    Object lock = new Object(); // 잠금 처리를 하기 위한 객체 선언
    public void minus(int value) {
        synchronized (lock) { // 하나의 객체를 사용하여 블록 내의 문장을 하나의 쓰레드만 수행하도록 지정
            amount -= value;
        }
    }
//=======================================================================
    /*
    * lock 객체는 하나의 클래스에서 두개 이상 만들어 사용 가능
    * interest 변수와 temp 변수 모두 여러 쓰레드에서 접근하면 안되는경우, 만약 lock 이라는 하나의 잠금용 객체만을 사용하면
    * temp 변수를 처리할 때 interest 변수를 처리하려는 부분도 처리를 못하게 됨
    *   -> 두개의 별도의 lock 객체를 사용
    * */
    private int temp;
    private int interest;
    private Object interestLock = new Object(); // lock 객체 1
    private Object tempLock = new Object(); // lock 객체 2

    public void addInterest(int value) {
        synchronized (interestLock) {
            interest += value;
        }
    }

    public void addTemp(int value) {
        synchronized (tempLock) {
            temp += value;
        }
    }
    //=======================================================================

    public int getAmount() {
        return amount;
    }
}
