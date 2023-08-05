package c.inner.staticnested;

public class NestedSample {
    public static void main(String[] args) {
        NestedSample sample = new NestedSample();
        sample.makeStaticNestedObject();
    }

    public void makeStaticNestedObject() {
        // StaticNested 의 객체 생성
        // 감싸고 있는 클래스이름.StaticNested 클래스 이름
        OuterOfStatic.StaticNested staticNested = new OuterOfStatic.StaticNested();
        staticNested.setValue(3);
        System.out.println(staticNested.getValue());
    }
}
