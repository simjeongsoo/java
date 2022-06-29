package e.thread.daemonthread;

// 데몬 쓰레드의 특징
public class DaemonThread extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(Long.MAX_VALUE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
