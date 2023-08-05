package chapter13;

public class ThreadEx1 {
    public static void main(String[] args) {
        ThreadEx1_1 t1 = new ThreadEx1_1();

        Runnable r = new ThreadEx1_2();
        Thread t2 = new Thread(r);

        t1.start();
        t2.start();

    }
}

class ThreadEx1_1 extends Thread { // 1. Implement a thread by inheriting from the Thread class.
    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            System.out.print(this.getName()); // Call getName() of the ancestor Thread
        }
    }
}

class ThreadEx1_2 implements Runnable { // 2. Implement a thread by implementing the Runnable interface

    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
//            Thread.currentThread(); // Returns the currently running Thread
            System.out.print(Thread.currentThread().getName());
        }
    }
}
