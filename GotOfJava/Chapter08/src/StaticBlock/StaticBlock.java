package StaticBlock;

public class StaticBlock {
    static int data=1;
    public StaticBlock(){
        System.out.println("StaticBlock.StaticBlock Constructor");
    }
    static { // 생성자 호출이 안되더라도 클래스에 대한 참조가 생기자마자(getData) 호출
        System.out.println("*** First static block ***");
        data=3;
    }
    static {
        System.out.println("*** Second static block ***");
        data=5;
    }
    public static int getData(){
        return data;
    }

}
