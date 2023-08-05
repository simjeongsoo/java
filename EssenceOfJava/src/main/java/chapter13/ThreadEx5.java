package chapter13;

public class ThreadEx5 {
    static long startTIme = 0;

    public static void main(String[] args) {
        ThreadEx5_1 th1 = new ThreadEx5_1();
        ThreadEx5_2 th2 = new ThreadEx5_2();
        th1.start();
        th2.start();

        startTIme = System.currentTimeMillis();

        try {
            th1.join();
            th2.join();
        } catch (InterruptedException e) {

        }
        System.out.print("time taken: " + (System.currentTimeMillis() - ThreadEx5.startTIme));

    }// main
}

class ThreadEx5_1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.printf("%s", new String("-"));
        }
//        System.out.print("time taken 1 : " + (System.currentTimeMillis() - ThreadEx5.startTIme));
    }
}

class ThreadEx5_2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.printf("%s", new String("|"));
        }
//        System.out.print("time taken 2 : " + (System.currentTimeMillis() - ThreadEx5.startTIme));
    }
}
