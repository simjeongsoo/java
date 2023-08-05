package c.exception;

public class CustomException {
    public static void main(String[] args) {
        CustomException exception = new CustomException();
        try {
            exception.throwMyException(13);
        } catch (MyException mye) { // 반드시 MyException 으로 catch 할 필요 없고 부모 클래스인 Exception 클래스로 catch 해도 무방
            mye.printStackTrace();
        }
    }

    // 직접 만든 예외를 던지고, catch 블럭에서 사용
    public void throwMyException(int number) throws MyException {
        try {
            throw new MyException("Number is over than 12");
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}
