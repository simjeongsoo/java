package e.thread.endless;

public class RunEndlessThreads {
    public static void main(String[] args) {
        RunEndlessThreads sample = new RunEndlessThreads();
        sample.endless(); // main 메소드의 수행이 끝나더라도 쓰레드가 종료하지 않아 자바 프로세스는 끝나지 않음
    }

    public void endless() {
        EndlessThread thread = new EndlessThread();
        thread.start();
    }
}
