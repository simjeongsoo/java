package e.thread;

public class RunMultiThreads {
    public static void main(String[] args) {
        RunMultiThreads threads = new RunMultiThreads();
        threads.runMultiThread();
    }
    // 10개의 쓰레드 수행
    public void runMultiThread() {
        RunnableSample []runnable = new RunnableSample[5];
        ThreadSample[] thread = new ThreadSample[5];

        for (int loop = 0; loop < 5; loop++) {
            runnable[loop] = new RunnableSample();
            thread[loop] = new ThreadSample();

            new Thread(runnable[loop]).start();
            thread[loop].start();
        }
        System.out.println("RunMultiThreads.runMultiThread() method is ended.");
    }
}
