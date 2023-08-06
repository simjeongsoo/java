
package chapter14_lambda;
public class Ex14_0 {

    public static void main(String[] args) {

        // 람다식(익명 객체)을 다루기 위한 참조변수의 타입은 함수형 인터페이스로 한다.
        MyFunction2 f = (a, b) -> a > b ? a : b; // 람다식,  익명객체

        // 모든 메서드는 객체 안에 있어야 한다.
//        MyFunction2 f = new MyFunction2() {
//            // java 에서는 메서드만 단독으로 존재 할 수 없기 때문에 익명 객체안에 넣어 표현 (람다식)
//            public int max(int a, int b) { // 오버라이딩 규칙 - 접근제어자는 좁게 못바꿈
//                return a > b ? a : b;
//            }
//        };

//        int value = f.max(3, 5); // Object 에는 max() 함수가 없고, 형변환도 불가  , 함수형 인터페이스 필요
        int value = f.max(3, 5); // 함수형 인터페이스
        System.out.println("value : " + value);
    }

}

@FunctionalInterface
interface MyFunction2 {
    int max(int a, int b); // public abstract int max(int a, int b);
}
