package c.annotation;

import java.lang.reflect.Method;

public class UserAnnotationCheck {
    public static void main(String[] args) {
        UserAnnotationCheck check = new UserAnnotationCheck();
        check.checkAnnotations(UserAnnotationSample.class);
    }

    public void checkAnnotations(Class useClass) {// Class 는 reflection api 에서 제공하는 클래스 정보 확인 클래스
        // Class 클래스에 선언되어 있는 getDeclaredMethod() 메소드를 호출하면 , 해당 클래스에 선언 되어 있는 메소드들의 목록을 배열로 리턴
        Method[] methods = useClass.getDeclaredMethods(); // Method 는 reflection api 에서 제공하는 메소드 정보 확인 클래스

        for (Method tempMethod : methods) {

            /*
             Method 클래스에 선언되어 있는 getAnnotation() 이라는 메소드를 호출하면, 해당 메소드에 선언되어 있는 매개 변수로 넘겨준 어노테이션이
             있는지 확인하고, 있을 경우 그 어노테이션의 객체를 리턴
            */
            UserAnnotation annotation = tempMethod.getAnnotation(UserAnnotation.class);

            if (annotation != null) {
                int number = annotation.number(); // 어노테이션에 있는 값을 호출하면 그 값을 리턴
                String text = annotation.text();
                System.out.println(tempMethod.getName() + "() : number = " + number + " text = " + text);
            } else {
                System.out.println(tempMethod.getName()+"() annotation is null.");
            }
        }

    }
}
