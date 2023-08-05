package d.lang;

import java.sql.SQLOutput;

public class JavaLangSystem {
    public static void main(String[] args) {
        JavaLangSystem system = new JavaLangSystem();
//        system.systemPropertiesCheck();
        system.numberMinMaxElapsedCheck();
    }

    // System class 속성값 관리 메소드
    public void systemPropertiesCheck() {
        System.out.println("java.version = "+System.getProperty("java.version")); // key 값으로 조회
        System.out.println(System.getProperties());
        System.out.println("JAVA_HOME = "+System.getenv("JAVA_HOME"));
        System.out.println(System.getenv());
    }

    // 현재 시간 조회
    public void numberMinMaxElapsedCheck() {
        JavaLangNumber number = new JavaLangNumber();
        long startTime = System.currentTimeMillis();
        long startNanoTime = System.nanoTime();
        number.numberMinMaxCheck();
        System.out.println("Milli second = "+(System.currentTimeMillis()-startTime));
        System.out.println("nano second = "+(System.nanoTime()-startNanoTime));
    }
}
