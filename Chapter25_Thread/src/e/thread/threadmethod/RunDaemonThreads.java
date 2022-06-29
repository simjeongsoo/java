package e.thread.threadmethod;

import e.thread.ThreadSample;

public class RunDaemonThreads {
    public static void main(String[] args) {
        RunDaemonThreads sample = new RunDaemonThreads();
        sample.checkThreadProperty();
    }

    // 쓰레드의 속성을 확인하고, 지정하기 위한 메소드
    public void checkThreadProperty() {
        ThreadSample thread1 = new ThreadSample();
        ThreadSample thread2 = new ThreadSample();
        ThreadSample daemonThread = new ThreadSample();

        System.out.println("thread1 id = " + thread1.getId());
        System.out.println("thread2 id = " + thread2.getId());

        System.out.println("thread1 name = " + thread1.getName());
        System.out.println("thread2 name = " + thread2.getName());

        System.out.println("thread1 priority = " + thread1.getPriority()); // default : 5

        daemonThread.setDaemon(true); // 스레드를 데몬으로 설정할지 여부 설정
        System.out.println("thread1 isDaemon = " + thread1.isDaemon());
        System.out.println("daemonThread isDaemon = "+daemonThread.isDaemon());

    }

}
