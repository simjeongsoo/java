package c.inner.innerclass;

// inner class 는 캡슐화를 위해 사용 , GUI 관련 프로그램 개발 시 주로 사용
public class InnerSample {
    public static void main(String[] args) {
        InnerSample sample = new InnerSample();
        sample.makeInnerObject();
    }

    public void makeInnerObject() {
        OuterOfInner outer = new OuterOfInner(); // Inner 클래스를 감싸고 있는 OuterOfInner 클래스의 객체 outer 생성
        OuterOfInner.Inner inner = outer.new Inner(); // outer 객체를 통해서 Inner 클래스의 객체를 만듬
        inner.setValue(1);
        System.out.println(inner.getValue());
    }
}
