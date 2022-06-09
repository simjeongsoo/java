package c.exception;

public class MultiCatchSample {
    public static void main(String[] args) {
        MultiCatchSample sample = new MultiCatchSample();
        //sample.multiCatch();
        //sample.multiCatchThree();
        sample.multiCatchThreeWithNULL();
    }

    public void multiCatchThreeWithNULL() {
        int[] intArray = new int[5];
        try {
            intArray = null;
            System.out.println(intArray[5]);
        } catch (NullPointerException e) {
            System.err.println("NullPointerException occurred");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("ArrayIndexOutOfBoundsException occurred");
        } catch (Exception e) {
            System.err.println(intArray.length);
        }
    }

    public void multiCatchThree() {
        int[] intArray = new int[5];
        try {
            System.out.println(intArray[5]);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException occurred");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurred");
        } catch (Exception e) {
            System.out.println(intArray.length);
        }

    /* Exception 클래스의 자식 클래스인 ArrayIndexOutOfBoundsException 클래스
        -> 부모 예외 클래스가 이미 catch 를 처리하고 자식클래스가 아래에서 catch 를 하도록 되어 있을 경우에는 자식클래스가 예외를 처리할 기회가 없다
    public void multiCatch() {
        int[] intArray = new int[5];
        try {
            System.out.println(intArray[5]);
        } catch (Exception e) {
            System.out.println(intArray.length);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurred");
        }
    }*/
    }
}

