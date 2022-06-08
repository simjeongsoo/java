package c.util.finalvariable;

/*
* 변수에 final 선언
* 변수에 final 을 선언하면 그 변수는 "더 이상 바꿀 수 없다" 라는 의미
* 그래서 인스턴스 변수나 static 으로 선언된 클래스 변수는 선언과 함께 값을 지정 해야 한다
* 변수 생성과 동시에 초기화를 해야 함
* */
public class FinalVariable {
    final int instanceVariable=1;

    // 매개변수나 지역변수는 final 을 사용하여도 초기화 할 필요 없음
    public void method(final int parameter) {
        final int localVariable;
        localVariable = 2;
//        localVariable = 3; // error
//        parameter = 4; // error
    }
}
