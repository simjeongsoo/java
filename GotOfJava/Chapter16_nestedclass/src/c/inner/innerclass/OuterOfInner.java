package c.inner.innerclass;

public class OuterOfInner {
    class Inner { // static 선언이 없는 inner 클래스
        private int value = 0;

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }
}
