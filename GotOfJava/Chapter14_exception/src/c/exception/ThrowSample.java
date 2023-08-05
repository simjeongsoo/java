package c.exception;

// 예외를 발생 시키는 방법 throw
public class ThrowSample {
    public static void main(String[] args) throws Exception{
        ThrowSample sample = new ThrowSample();
//        sample.throwException(13);

        /*try { // throws 호출한 메서드에서 try-catch
            sample.throwsException(13);
        } catch (Exception e) {

        }*/

        sample.throwsException(13); // 호출한 메소드에서도 throws
    }

    /*public void throwException(int number) {
        try {
            if (number > 12) {
                throw new Exception("Number is over than 12"); // try 블록 내에서 throw 라고 명시한 뒤 예외 클래스 객체를 생성
                                                                // throw 한 문장 이후에 있는 모든 try 블록 내의 문장 수행 x
            }
            System.out.println("Number is " + number);
        } catch (Exception e) { // catch 블록으로 이동
            e.printStackTrace(); // throw 한 예외와 동일하거나 상속 관계에 있는 예외가 있다면 예외처리 가능
        }
    }*/

    // throw 한 예외와 동일하거나 상속 관계에 있는 예외가 있다면 예외처리 가능
    // 만약 해당되는 예외가 없다면 발생된 예외는 메소드를 밖으로 던져버림
    // 예외가 발생된 메소드를 호출한 메소드로 던짐  -> throws 구문 사용
    public void throwsException(int number) throws Exception { // 메소드에 선언
        // 예외가 발생했을 때 try-catch 로 묶어주지 않아도 그 메소드를 호출한 메소드로 예외 처리를 위임
        // 1. main 메소드의 sample.throwsException(13); 에서 try-catch 를 해주거나
        // 2. main 메소드에 throws 선언 -> 비추
        if (number > 12) {
            throw new Exception("Number is over than 12");
        }

        System.out.println("Number is "+number);
    }

    // 여러가지의 예외를 던질때
    public void multiThrows() throws NullPointerException,Exception{

    }

}

/*
* 예외를 throw 하는 이유는 해당 메소드에서 예외를 처리 못하는 상황이거나, 미처 처리 못한 예외가 있을 경우에 대비 하기 위함
* */