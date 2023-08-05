package c.exception;

public class ExceptionVariable {
    public static void main(String[] args) {
        ExceptionVariable variable = new ExceptionVariable();
        variable.checkVariable();
    }
    public void checkVariable2() {
        int[] intArray = null; // try 블록 안에 선언된 변수는 중괄호 안에서만 사용이 가능하기 때문에 try 블록 앞에 선언
        try {
            intArray = new int[5]; // exception 구문 전까지는 try 블록의 코드가 실행
            System.out.println(intArray[5]); // exception 발생
        } catch (Exception e) {
            System.out.println(intArray.length); // intArray = new int[5];
        }
        System.out.println("This code must run.");
    }

    public void checkVariable() {
        int[] intArray = new int[5];
        try {
            System.out.println(intArray[5]);
        } catch (Exception e) {
            System.out.println(intArray.length);
        }
        System.out.println("This code must run.");
    }
}
