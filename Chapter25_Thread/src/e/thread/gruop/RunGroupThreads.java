package e.thread.gruop;

import e.thread.support.SleepThread;

// 쓰레드 그룹 생성, 정보 확인
public class RunGroupThreads {
    public static void main(String[] args) {
        RunGroupThreads threads = new RunGroupThreads();
        threads.groupThread();
    }

    private void groupThread() {
        try {
            SleepThread sleep1 = new SleepThread(5000);
            SleepThread sleep2 = new SleepThread(5000);

            ThreadGroup group = new ThreadGroup("Group1"); // 그룹이름 지정
            Thread thread1 = new Thread(group, sleep1);
            Thread thread2 = new Thread(group, sleep2);

            thread1.start();
            thread2.start();
            Thread.sleep(1000);
            System.out.println("Group name=" + group.getName()); // 그룹이름 출력
            int activeCount = group.activeCount();
            System.out.println("Active count=" + activeCount); // 실행중인 쓰레드 갯수 출력
            group.list(); // 그룹 정보 출력

            Thread[] tempThreadList = new Thread[activeCount]; // 실행중인 쓰레드의 갯수로 Thread 배열객체 생성
            int result = group.enumerate(tempThreadList); // 현재 쓰레드 그룹에 있는 모든 쓰레드를 매개 변수로 넘어온 쓰레드 배열에 담음. 반환값 쓰레드의 갯수 int
            System.out.println("Enumerate result=" + result); // 배열에 담긴 갯수 출력
            for (Thread thread : tempThreadList) {
                System.out.println(thread); // 배열에 담긴 쓰레드 정보 출력
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
