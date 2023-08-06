package chapter14_lambda;

public class Ex14_0 {
    public static void main(String[] args) {
//        Object obj = (a, b) -> a > b ? a : b; // 람다식,  익명객체

        // 모든 메서드는 객체 안에 있어야 한다.
        Object obj = new Object() {
            // java 에서는 메서드만 단독으로 존재 할 수 없기 때문에 익명 객체안에 넣어 표현 (람다식)
            int max(int a, int b) {
                return a > b ? a : b;
            }
        };

//        int value = obj.max(3, 5); // Object 에는 max() 함수가 없고, 형변환도 불가  , 함수형 인터페이스 필요
    }
}
