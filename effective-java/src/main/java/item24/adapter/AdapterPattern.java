package item24.adapter;

import java.io.*;

public class AdapterPattern {
    /**
     * adapter의 예시
     * InputStream을 InputStreamReader에 담아 InputStreamReader처럼 사용
     * InputStreamReader을 BufferedReader에 담아 BufferedReader처럼 사용
     */
    public static void main(String[] args) {
        try (InputStream is = new FileInputStream("test.txt")) {
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader reader = new BufferedReader(isr);
            while (reader.ready()) {
                System.out.println(reader.readLine());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
