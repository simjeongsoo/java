package d.string;

// byte 배열의 값을 출력하는 메서드
public class StringSample {
    public void printByteArray(byte[] array) {
        for (byte data : array) {
            System.out.print(data+" ");
        }
        System.out.println();
    }
}
