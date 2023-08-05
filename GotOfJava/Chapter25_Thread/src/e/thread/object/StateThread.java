package e.thread.object;

// wait() notify() check
public class StateThread extends Thread {
    private Object monitor;

    public StateThread(Object monitor) { // monitor 라는 이름의 객체를 매개 변수로 받아 인스턴스 변수로 선언
        this.monitor = monitor;
    }

    @Override
    public void run() {
        try {
            for (int loop = 0; loop < 10000; loop++) { // 쓰레드를 실행중인 상태로 만들기 위해 간단한 loop 로 String 객체 생성
                String a = "A";
            }
            synchronized (monitor) { // synchronized 블록 안에서 monitor 객체의 wait 메소드 호출
                monitor.wait();
            }
            System.out.println(getName() + " is notified.");
            Thread.sleep(1000); // wait() 상황이 끝나면 1초간 대기 후 종료
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}
