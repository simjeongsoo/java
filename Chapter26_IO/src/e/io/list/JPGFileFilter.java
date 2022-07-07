package e.io.list;

import java.io.File;
import java.io.FileFilter;

public class JPGFileFilter implements FileFilter { // FileFilter 인터페이스 구현
    @Override
    public boolean accept(File file) {
        if (file.isFile()) { // 파일 객체가 디렉터리가 아닌 파일인지 확인
            String fileName = file.getName();
            if (fileName.endsWith(".jpg")) {
                return true; // 파일이름이 .jpg 이면 true
            }
        }
        return false;
    }
}
