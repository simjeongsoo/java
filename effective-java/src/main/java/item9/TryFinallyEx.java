package item9;

import java.io.*;

public class TryFinallyEx {
    /**
     * 두번째 예외가 첫 번째 예외를 집어 삼켜 버린다.
     */
    static String firstLineOfFile(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        try {
            return br.readLine(); // 예외 발생 exception1 : 없어짐
        }finally {
            br.close(); // close()실패 exception2 : 기록
        }
    }

    private static final byte BUFFER_SIZE = 10;

    /**
     * 자원이 둘 이상이면 try-finally 방식은 너무 지저분하다.
     */
    static void copy(String src, String dst) throws IOException {
        InputStream in = new FileInputStream(src);
        try {
            OutputStream out = new FileOutputStream(dst);
            try {
                byte[] buf = new byte[BUFFER_SIZE];
                int n;
                while ((n = in.read(buf)) >= 0) {
                    out.write(buf, 0, n);
                }
            }finally {
                out.close();
            }
        }finally {
            in.close();
        }
    }
}
