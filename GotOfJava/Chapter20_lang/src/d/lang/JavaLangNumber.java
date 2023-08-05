
package d.lang;
public class JavaLangNumber {
    public static void main(String[] args) {
        JavaLangNumber javaLangNumber = new JavaLangNumber();
//        javaLangNumber.numberTypeCheck();
//        javaLangNumber.numberTypeCheck2();
        javaLangNumber.numberMinMaxCheck();
    }

    // Number abstract class 자동 형변환 확인
    public void numberTypeCheck() {
        String value1 = "3";
        String value2 = "5";

        byte byte1 = Byte.parseByte(value1); // parseByte() 메소드를 사용하여 byte로 변환
        byte byte2 = Byte.parseByte(value2);
        System.out.println(byte1+byte2); // 더한값 출력
        // parseByte() : 기본자료형 리턴

        Integer refInt1 = Integer.valueOf(value1); // valueOf() 메소드를 사용하여 Integer 타입으로 변환
        Integer refInt2 = Integer.valueOf(value2);
        System.out.println(refInt1 + refInt2 + "7"); // 두 값을 더한 뒤 7이라는 String 값도 더해줌
        // valueOf() : 참조자료형 리턴
    }

    // Byte,Integer 등 은 static 메소드
    public void numberTypeCheck2() {
        Integer refInt1; // new 없이 값 할당 가능
        refInt1 = 100;
        System.out.println(refInt1.doubleValue());
    }

    // MIN_VALUE , MAX_VALUE
    public void numberMinMaxCheck() {
        System.out.println("Byte min = "+Byte.MIN_VALUE+"  max = "+Byte.MAX_VALUE);
        System.out.println("Short min = "+Short.MIN_VALUE+"  max = "+Short.MAX_VALUE);
        System.out.println("Integer min = "+Integer.MIN_VALUE+"  max = "+Integer.MAX_VALUE);
        System.out.println("Long min = "+Long.MIN_VALUE+"  max = "+Long.MAX_VALUE);
        System.out.println("Float min = "+Float.MIN_VALUE+"  max = "+Float.MAX_VALUE);
        System.out.println("Double min = "+Double.MIN_VALUE+"  max = "+Double.MAX_VALUE);
        System.out.println("Character min = "+(int)Character.MIN_VALUE+"  max = "+(int)Character.MAX_VALUE);
        System.out.println();
        System.out.println("Integer BINARY min = "+Integer.toBinaryString(Integer.MIN_VALUE));
        System.out.println("Integer BINARY max = "+Integer.toBinaryString(Integer.MAX_VALUE));
        System.out.println("Integer HEX min = "+Integer.toHexString(Integer.MIN_VALUE));
        System.out.println("Integer HEX max = "+Integer.toHexString(Integer.MAX_VALUE));

    }

}


