package StaticBlock;

public class StaticBlockCheck {
    public static void main(String[] args) {
        StaticBlockCheck check = new StaticBlockCheck();
        //check.makeStaticBlockObject();
        check.makeStaticBlockObjectWithData();
    }
    public void makeStaticBlockObjectWithData(){
        System.out.println("data="+StaticBlock.getData());
        StaticBlock block1=new StaticBlock(); // 객체 생성
        block1.data=1;
        System.out.println("------------------");
        StaticBlock block2=new StaticBlock();
        block2.data=2;
        System.out.println("data="+StaticBlock.getData());
    }
    public void makeStaticBlockObject(){
        System.out.println("Creating block1");
        StaticBlock block1=new StaticBlock();
        System.out.println("Created block1");

        System.out.println("------------------");

        System.out.println("Creating block2");
        StaticBlock block2=new StaticBlock();
        System.out.println("Created block2");
    }
}
