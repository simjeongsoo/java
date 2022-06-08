package c.util.finalmethod;

public abstract class FinalMethodClass {
        /*
        * 메소드를 final 로 선언
        * 메소드가 final 로 선언 되어 있으면 더이상 Overriding 할 수 없다
        * */
    public final void printLog(String data) {
        System.out.println("Data="+data);
    }
}
