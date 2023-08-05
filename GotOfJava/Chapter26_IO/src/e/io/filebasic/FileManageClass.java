package e.io.filebasic;

import java.io.File;
import java.io.IOException;

// File 클래스를 이용하여 파일 처리
public class FileManageClass {
    public static void main(String[] args) {
        FileManageClass sample = new FileManageClass();
        String pathName =
                File.separator + "/Users"
                        + File.separator + "/simjeongsu"
                        + File.separator + "/Documents"
                        + File.separator + "/GodOfJava/"
                        + File.separator + "Chapter26_IO"
                        + File.separator + "test";
        String fileName = "test.text";
        sample.checkFile(pathName, fileName);
    }

    // file.createNewFile()
    public void checkFile(String pathName, String fileName) {
        File file = new File(pathName, fileName);
        try {
            System.out.println("Create result = " + file.createNewFile());
            getFileInfo(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 파일의 정보를 확인하는 메소드
    public void getFileInfo(File file) throws IOException{
        System.out.println("Absolute path = " + file.getAbsolutePath());
        System.out.println("Absolute file = " + file.getAbsoluteFile());
        System.out.println("Canonical path = " + file.getCanonicalPath());
        System.out.println("Canonical file = " + file.getCanonicalFile());

        System.out.println("Name = " + file.getName());
        System.out.println("Path = " + file.getPath());

        System.out.println("Parent = " + file.getParent()); // 파일명을 제외한 경로만 출력

    }
}
