package e.thread;

public class RunnableSample implements Runnable{
    @Override
    public void run() { // 쓰레드의 시작점
        // 스레드가 시작되면 한줄 출력후 쓰레드 종료
        System.out.println("This is RunnableSample's run() method.");
    }
}
