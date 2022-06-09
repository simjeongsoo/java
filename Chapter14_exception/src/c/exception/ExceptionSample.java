package c.exception;

public class ExceptionSample {
    public static void main(String[] args) {
        ExceptionSample sample = new ExceptionSample();
        //sample.arrayOutBounds();
        sample.arrayOutBoundsTryCatch();
    }
    public void arrayOutBoundsTryCatch() {
        int[] intArray = new int[5];

        try {
            System.out.println(intArray[5]);
            System.out.println("This code should run");
        } catch (Exception e) {
            System.err.println("Exception occured."); //System.err.println() -> catch 구문에서 사용
        }

        System.out.println("This code must run");

    }
    public void arrayOutBounds() {
        int[] intArray = new int[5];
        System.out.println(intArray[5]);
    }

}

/*
*  int[] intArray = new int[5];
*  System.out.println(intArray[5]);
*   -> 실행시 exception 발생
*       = Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
	        at c.exception.ExceptionSample.arrayOutBounds(ExceptionSample.java:10)
	        at c.exception.ExceptionSample.main(ExceptionSample.java:6)
	            // at 으로 시작하는 스택 호출추적(call stack trace) , 스택 트레이스 출력
*
* */