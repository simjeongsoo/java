package c.string;

import java.nio.charset.StandardCharsets;

public class StringSample {
    public static void main(String[] args) {
        StringSample sample = new StringSample();
        sample.converter();
    }

    public void converter() {
        try {
            String korean = "한글"; // "한글" 이라는 값을 갖는 String 객체인 korean 을 생성

            byte[] array1 = korean.getBytes(); // getBytes() 메소드를 사용하여 korean 을 byte 배열로 만듬
            for (byte data : array1) { // 만들어진 byte 배열에 어떤 값들이 있는지 살펴보기 위해서 for loop 를 사용하여 각각의 byte 값을 출력
                System.out.println(data + " ");
            }
            System.out.println();

            // byte 배열을 갖고 String 객체를 만들기 위해서 byte 배열(array1) 을 매개변수로 갖는 String 객체를 생성하고, 그 문자열 출력
            String korean2 = new String(array1);
            
            System.out.println(korean2);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
