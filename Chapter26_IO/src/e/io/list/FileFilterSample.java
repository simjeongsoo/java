package e.io.list;

import java.io.File;
// JDK 7 이상의 버전이면 java.nio.file 패키지의 Files 클래스 사용하는게 효과적

// 디렉터리에 있는 이미지 파일 목록을 가져오는 코드
public class FileFilterSample {
    public static void main(String[] args) {
        FileFilterSample sample = new FileFilterSample();
        String pathName =
                File.separator + "/Users"
                        + File.separator + "/simjeongsu"
                        + File.separator + "/Documents"
                        + File.separator + "/GodOfJava/"
                        + File.separator + "Chapter26_IO"
                        + File.separator + "test";
        sample.checkList(pathName);
    }

    public void checkList(String pathName) {
        File file;
        try {
            file = new File(pathName); // pathName 으로 File 객체 생성
//            File[] mainFileList = file.listFiles(); // 현재 디렉터리 하위에 있는 목록을 File 배열로 저장
//            File[] mainFileList = file.listFiles(new JPGFilenameFilter());
            File[] mainFileList = file.listFiles(new JPGFileFilter());
            for (File tempFile : mainFileList) {
                System.out.println(tempFile.getName()); // file 이름 출력
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
