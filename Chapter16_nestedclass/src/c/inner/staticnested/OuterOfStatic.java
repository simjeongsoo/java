package c.inner.staticnested;

public class OuterOfStatic { // OuterOfStatic 클래스 선언

    static class StaticNested { // OuterOfStatic 내부에 static 으로 선언된 StaticNested 클래스 선언
        private int value = 0; // 인스턴스 변수

        public int getValue() { // 인스턴스 변수 값 조회
            return value;
        }

        public void setValue(int value) { // 인스턴스 변수 값 지정
            this.value = value;
        }
    }

}
