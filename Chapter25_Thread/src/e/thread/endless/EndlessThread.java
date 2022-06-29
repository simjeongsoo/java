package e.thread.endless;

public class EndlessThread extends Thread{
    @Override
    public void run() {
        while (true) {
            try { // Thread.sleep() 메소드는 항상 try-catch 로 묶음
                System.out.println(System.currentTimeMillis());
                Thread.sleep(1000); // Thread 클래스의 sleep() 메소드를 static 하게 호출하여 1초간 대기
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
