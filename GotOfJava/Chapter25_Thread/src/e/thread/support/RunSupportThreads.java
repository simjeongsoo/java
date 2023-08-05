package e.thread.support;

public class RunSupportThreads {
    public static void main(String[] args) {
        RunSupportThreads threads = new RunSupportThreads();
//        threads.checkThreadState1();
        threads.checkJoin();
    }

    public void checkThreadState1() {
        SleepThread sleepThread = new SleepThread(2000); // SleepThread 의 생성자 매개변수에 2000을 넘김 , 2초대기
        try {
            System.out.println("thread sate = " + sleepThread.getState()); // getState() 메소드로 상태 출력
            sleepThread.start();
            System.out.println("thread state(after start) = " + sleepThread.getState());

            sleepThread.sleep(1000); // 1초 대기
            System.out.println("thread state(after 1 sec) = " + sleepThread.getState());

            sleepThread.join(); // 메소드가 끝날때 까지 대기
            sleepThread.interrupt(); // 쓰레드 종료우 interrupt() 호출
            System.out.println("thread state(after join) = " + sleepThread.getState());
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        /*
thread sate = NEW // 쓰레드가 시작한 상황이 아님 -> NEW 상태
thread state(after start) = RUNNABLE // 쓰레드가 시작한 상황, 아직 첫 출력문까지 도달하지 않음 -> RUNNABLE 상태
Sleeping Thread-0
thread state(after 1 sec) = TIMED_WAITING // 2초간 sleep 모드 -> TIMED_WAITING 상태
Stopping Thread-0
thread state(after join) = TERMINATED // 쓰레드가 종료되기를 join() 메소드에서 기다린 후 상태 -> TERMINATED 상태
    * */
    }

    public void checkJoin() {
        SleepThread thread = new SleepThread(2000);
        try {
            thread.start();
            thread.join(500);
            thread.interrupt();
            System.out.println("thread state(after join) = " + thread.getState());
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();

        }
    }

}
