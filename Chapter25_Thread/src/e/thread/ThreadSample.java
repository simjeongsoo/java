package e.thread;

public class ThreadSample extends Thread {
    @Override
    public void run() { // 쓰레드의 시작점
        // 스레드가 시작되면 한줄 출력후 쓰레드 종료
        System.out.println("This is ThreadSample's run() method.");
    }
}
