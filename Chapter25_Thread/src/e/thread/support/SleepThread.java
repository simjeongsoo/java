package e.thread.support;

// 매개변수로 지정한 시간만큼 대기하는 쓰레드
public class SleepThread extends Thread{
    long sleepTime;

    public SleepThread(long sleepTime) {  // 밀리초 시간 단위의 시간을 매개 변수로 받아서 인스턴스 변수에 지정
        this.sleepTime = sleepTime;
    }

    @Override
    public void run() { // 지정한 인스턴스 변수 만큼 sleep()
        try {
            System.out.println("Sleeping " + getName());
            Thread.sleep(sleepTime);
            System.out.println("Stopping " + getName());
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}
