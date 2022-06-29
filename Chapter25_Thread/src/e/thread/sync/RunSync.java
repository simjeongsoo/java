package e.thread.sync;

// ModifyAmountThread 쓰레드를 실행하는 클래스
public class RunSync {
    public static void main(String[] args) {
        RunSync sync = new RunSync();
        for (int loop = 0; loop < 5; loop++) {
            sync.runCommonCalculate();
        }
    }

    public void runCommonCalculate() {
        CommonCalculate calc = new CommonCalculate(); // CommonCalculate 클래스의 객체생성

        // ModifyAmountThread 클래스의 객체 생성할 때 calc 를 매개변수로 넘기고, plus() 메소드만 수행하도록 true 를 넘김
        ModifyAmountThread thread1 = new ModifyAmountThread(calc, true);
        ModifyAmountThread thread2 = new ModifyAmountThread(calc, true);
/*===============================================================================================================*/
        // 메소드를 synchronized 할 때에는 같은 객체를 참조할 때에만 유효
        CommonCalculate calc1 = new CommonCalculate();
        ModifyAmountThread thread3 = new ModifyAmountThread(calc1,true);

        CommonCalculate calc2 = new CommonCalculate();
        ModifyAmountThread thread4 = new ModifyAmountThread(calc2,true);
        // 두개의 쓰레드가 동일한 clac 객체가 아닌 서로 다른 객체를 참조한다면 synchronized 로 선언된 메소드는 같은 객체를 참조하는 것이 아니므로
        // synchronized 를 안쓰는 것과 동일함

/*===============================================================================================================*/
        // 쓰레드 시작
        thread1.start();
        thread2.start();

        try {
            thread1.join(); // join() : 쓰레드가 종료될 때 가지 기다리는 메소드
            thread2.join();
            System.out.println("Final value is " + calc.getAmount()); // 모든 쓰레드가 종료된 이후의 결과
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
