package e.thread.object;

public class RunObjectThreads {
    public static void main(String[] args) {
        RunObjectThreads threads = new RunObjectThreads();
//        threads.checkThreadState2();
//        threads.checkThreadState3();
        threads.checkThreadState3();
    }

    // notify()
    public void checkThreadState2() {
        Object monitor = new Object(); // StateThread 의 매개변수로 넘겨줄 monitor 라는 Object 클래스 객체 생성
        StateThread thread = new StateThread(monitor);
        try {
            System.out.println("thread state = " + thread.getState()); // NEW
            thread.start(); // 쓰레드 객체 생성 후 실행
            System.out.println("thread state(after start) = " + thread.getState()); // RUNNABLE

            Thread.sleep(100);
            System.out.println("thread state(after 0.1 sec) = " + thread.getState());  // WAITING

            synchronized (monitor) {
                monitor.notify();
            }

            Thread.sleep(100);
            System.out.println("thread state(after notify) = " + thread.getState()); // TIMED_WATING

            thread.join(); // 쓰레드 종료 대기후 상태 출력
            System.out.println("thread state(after join) = " + thread.getState()); // TERMINATED
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }

    //  notifyAll()
    public void checkThreadState3() {
        Object monitor = new Object(); // StateThread 의 매개변수로 넘겨줄 monitor 라는 Object 클래스 객체 생성
        StateThread thread = new StateThread(monitor);
        StateThread thread2 = new StateThread(monitor);
        try {
            System.out.println("thread state = " + thread.getState()); // NEW
            thread.start(); // 쓰레드 객체 생성 후 실행
            thread2.start();
            System.out.println("thread state(after start) = " + thread.getState()); // RUNNABLE

            Thread.sleep(100);
            System.out.println("thread state(after 0.1 sec) = " + thread.getState());  // WAITING

            synchronized (monitor) {
                /*monitor.notify();
                monitor.notify(); // thread2 무한 대기 풀어주는 2번째 notify()
                */
                monitor.notifyAll(); // wait() 상태가 몇개인지 모르는 상태에서 사용
            }

            Thread.sleep(100);
            System.out.println("thread state(after notify) = " + thread.getState()); // TIMED_WATING

            thread.join(); // 쓰레드 종료 대기후 상태 출력
            System.out.println("thread state(after join) = " + thread.getState()); // TERMINATED
            thread2.join(); // 쓰레드 종료 대기후 상태 출력
            System.out.println("thread2 state(after join) = " + thread2.getState()); // TERMINATED
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }

}
