package e.io.list;

import java.io.File;
import java.io.FilenameFilter;

public class JPGFilenameFilter implements FilenameFilter {
    @Override
    public boolean accept(File file, String fileName) {
        // FilenameFilter 는 메소드 매개 변수로 fileName 이 넘어오기 때문에 별도로 File 객체의 getName() 메소드를 호출할 필요가 없음
        // 하지만 FilenameFilter 는 디렉터리와 파일을 구분하지 못하기 때문에 .jpg 로 끝나는 디렉터리가 있으면 필터로 걸러낼 수 없음
        if (fileName.endsWith(".jpg")) {
            return true;
        }
        return false;
    }
}
