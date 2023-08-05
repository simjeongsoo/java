package c.exception;

// Throwable 이나 그 자식 클래스의 상속을 받아 임의로 추가한 예외 클래스
// Exception 을 처리하는 클래스라면 java.lang.Exception 클래스의 상속을 받는것이 좋음
public class MyException extends Exception{
    public MyException() {
        super();
    }

    public MyException(String message) {
        super(message);
    }
}
