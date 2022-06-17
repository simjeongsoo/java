package c.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) // 해당 어노테이션 사용 대상 지정 -> 메소드에 사용
@Retention(RetentionPolicy.RUNTIME) // 어노테이션 유지 정보 지정 -> 깅랜기네 니 어노테이션 참조
public @interface UserAnnotation { // @interface 로 선언하면 @UserAnnotation 으로 어노테이션 사용 가능
    public int number(); // 리턴 타입 int 메소드
            // 어노테이션 안에 메소드를 선언해 놓으면 이 어노테이션을 사용할 때 해당 항목에 대한 타입으로 값 지정 가능
    public String text() default "This is first annotation"; // 리턴타입 String 메소드 , 값을 지정하지 않아도 default 예약어 뒤의 값이 깁본값이됨
}
