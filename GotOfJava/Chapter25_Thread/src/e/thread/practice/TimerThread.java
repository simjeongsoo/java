package e.thread.practice;

import java.util.Date;

// 1초에 한번씩 현재 시간을 출력하는 간단한 쓰레드 클래스
public class TimerThread extends Thread{
    @Override
    public void run() {
        printCurrentTime();
    }

    // 1초에 한번씩 현재 시간을 출력하는 메소드
    public void printCurrentTimeBasic() {
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(1000);
                long currentTime = System.currentTimeMillis();
                System.out.println(new Date(currentTime)+" "+currentTime);
            }
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }

    public void reduceTimeGap() {
        long currentTime = System.currentTimeMillis();
        long timeMod = currentTime%1000;
        try {
            Thread.sleep(1000 - timeMod);
        } catch (Exception e) {

        }
    }

    public void printCurrentTime() {
        try {
            int count = 0;
            while (count < 10) {
                long current = System.currentTimeMillis();
                System.out.println(new Date(current) + " " + current);
                Thread.sleep(900);
                reduceTimeGap();
                count++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
