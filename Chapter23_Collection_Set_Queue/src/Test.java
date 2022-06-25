class SuperObj {
    public void show() {
        print();
    }
    public void print() { // 3
        print(); // 3, 객체 s 가 넘어온 print()메소드 수행 이므로 자식클래스의 print() 메소드 수행
        System.out.print("Super"); // 5 
    }
}

class SubObj extends SuperObj {
    @Override
    public void show() {  // 2
        super.print(); // 2
    }
    @Override
    public void print() { // 4
        System.out.print("Sub"); // 4

    }
}
public class Test {
    public static void main(String[] args) {
        // 부모 클래스로 자식클래스 객체생성가능
        SuperObj s = new SubObj(); // subObj 객체 s
        s.show(); // 1
    }
}
