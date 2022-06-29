package e.thread.support;

public class RunSupportThreads {
    public static void main(String[] args) {
        RunSupportThreads threads = new RunSupportThreads();
        threads.checkThreadState1();
    }

    public void checkThreadState1() {
        SleepThread sleepThread = new SleepThread(2000);
        try {
            System.out.println("thread sate = " + sleepThread.getState());
            sleepThread.start();
            System.out.println("thread state(after start) = " + sleepThread.getState());

            sleepThread.sleep(1000);
            System.out.println("thread state(after 1 sec) = " + sleepThread.getState());

            sleepThread.join();
            sleepThread.interrupt();
            System.out.println("thread state(after join) = " + sleepThread.getState());
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
    }
}
