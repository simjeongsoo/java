package e.thread;

// Runnable 과 Thread 클래스 모두 쓰레드로 실행할 수 있다는 공통점이 있다
// 하지만 이 두개의 쓰레드 클래스를 실행하는 방식이 다름
public class RunThreads {
    public static void main(String[] args) {
        RunThreads threads = new RunThreads();
        threads.runBasic();
    }

    // 쓰레드가 수행되는 실제 구현하는 메소드는 run() 메소드다 -> 시작점
    // 쓰레드를 시작하는 메소드는 start() 이다
    public void runBasic() {
        RunnableSample runnable = new RunnableSample(); // Runnable 객체 생성
        new Thread(runnable).start(); // Runnable 인터페이스를 구현한 RunnableSample 클래스를 쓰레드로 바로 시작할수는 없다.
                                      // Thread 클래스의 생성자에 해당 객체를 추가하여 시작해 주어야만 한다
                                      // start() 메소드로 Runnable 시작

        ThreadSample thread = new ThreadSample(); // Thread 객체 생성
        thread.start(); // Thread 클래스 객체에 바로 start() 메소드 호출

        System.out.println("RunThreads.runBasic() method is ended.");

        /*
        * 자바에서 Thread 클래스를 확장 받아야만 쓰레드로 구현할 수 있는데, 다중 상속이 불가능하므로 해당 클래스를 쓰레드로 만들 수 없다
        * 하지만 인터페이스는 여러 개의 인터페이스를 구현 해도 전혀 문제가 발생하지 않는다
        * 쓰레드 클래스가 다른 클래스를 확장할 필요가 있을 경우에는 Runnable 인터페이스를 구현하면 되며, 그렇지 않은 경우에는 쓰레드 클래스를
        * 사용하는 것이 편함
        * */
    }
}
