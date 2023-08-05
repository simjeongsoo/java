package e.thread.daemonthread;

public class RunDaemonThread {
    public static void main(String[] args) {
        RunDaemonThread thread = new RunDaemonThread();
//        thread.runCommonThread(); // 일반 쓰레드 실행
        thread.runDaemonThread(); // 데몬 쓰레드 지정 후 실행
    }

    public void runCommonThread() {
        DaemonThread thread = new DaemonThread();
        thread.start();
    }

    // 데몬쓰레드는 해당 쓰레드가 종료되지 않아도 다른 실행중인 일반 쓰레드가 없다면 , 멈춤
    // 부가적인 작업을 수행하는 쓰레드를 선언할 때 데몬 쓰레드 사용
    public void runDaemonThread() {
        DaemonThread thread = new DaemonThread();
        thread.setDaemon(true);
        thread.start();
    }

}
