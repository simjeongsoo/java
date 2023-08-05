package e.thread.sync;

// CommonCalculate 클래스의 객체를 매개 변수로 받아서 처리하는 쓰레드 클래스
// CommonCalculate 클래스의 객체를 받아서 addFlag 가 true 면 1을 더하고 addFlag 가 false 면 1을 빼는 연산을 수행,
// 덧셈이나 뺄셈 연산을 만번 수행하고 나서, 해당 쓰레드는 종
public class ModifyAmountThread extends Thread{
    private CommonCalculate calc; // CommonCalculate 타입의 인스턴스 변수 선언
    private boolean addFlag;

    public ModifyAmountThread(CommonCalculate calc, boolean addFlag) {
        this.calc = calc; // 매개변수로 받은 CommonCalculate 클래스 객체를 인스턴스 변수에 지정
        this.addFlag = addFlag;
    }

    @Override
    public void run() {
        for (int loop = 0; loop < 10000; loop++) {
            if (addFlag) {
                calc.plus(1);
            } else {
                calc.minus(1);
            }
        }
    }
}
