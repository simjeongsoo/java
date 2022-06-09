package c.exception;

public class ThrowableSample {
    public static void main(String[] args) {
        ThrowableSample sample = new ThrowableSample();
        sample.throwable();
    }

    public void throwable() {
        int[] intArray = new int[5];
        try {
            intArray = null;
            System.out.println(intArray[5]);
        } catch (Throwable throwable) { // Exception 이 아닌 Throwable 로 받아도 무관 ( 공통 부모 클래스 )
            System.out.println("getMessage() : "+throwable.getMessage()); // null
            System.out.println("toString() : "+throwable.toString()); // java.lang.NullPointerException
            System.out.println("getCause() : "+throwable.getCause()); // null
            System.out.println("getClass() : "+throwable.getClass()); // class java.lang.NullPointerException
            System.out.println("getStackTrace() : "+throwable.getStackTrace()); //[Ljava.lang.StackTraceElement;@3d24753a
            System.out.print("printStackTrace() : ");
            throwable.printStackTrace();
            /*java.lang.NullPointerException
                at c.exception.ThrowableSample.throwable(ThrowableSample.java:13)
                at c.exception.ThrowableSample.main(ThrowableSample.java:6)*/

        }

    }
}
