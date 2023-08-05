package e.thread;

public class NameCalcThread extends Thread{
    private int calcNumber;

    public NameCalcThread(String name, int calcNumber) {
        super(name); // -> Thread(String name) 생성자 호출
        this.calcNumber = calcNumber; // calcNumber 값을 동적으로 지정하여 쓰레드를 시작
    }

    @Override
    public void run() {
        calcNumber++;
    }
}

