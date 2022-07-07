package e.io.filebasic;

import java.io.File;
import java.util.Date;

// 파일의 경로와 관련된 메소드들을 사용
public class FileSample {
    public static void main(String[] args) {
        FileSample sample = new FileSample();
//        String pathName = File.separator +"/Users/simjeongsu/Documents/GodOfJava/Chapter26_IO";
        String pathName = "/Users/simjeongsu/Documents/GodOfJava/Chapter26_IO/test";
//        sample.checkPath(pathName);
//        sample.makeDir(pathName);
//        sample.checkFileMethods(pathName);
//        sample.canFileMethods(pathName);
        sample.lastModified(pathName);
    }

    // file.exists()
    public void checkPath(String pathName) {
        File file = new File(pathName); // 매개변수로 넘어온 경로로 File 객체 생성
        System.out.println(pathName + " is exists? " + file.exists()); // exists() 메소드로 해당 경로 존재 확인

//        System.out.println(file.getName());
    }

    // file.mkdir()
    public void makeDir(String pathName) {
        File file = new File(pathName);
        System.out.println("Make "+pathName+" result = "+file.mkdir());
    }

    // file.isDirectory() , file.isFile() , file.isHidden()
    public void checkFileMethods(String pathName) {
        File file = new File(pathName);
        System.out.println(pathName + " is directory? = " + file.isDirectory());
        System.out.println(pathName + " is file? = " + file.isFile());
        System.out.println(pathName + " is hidden? = " + file.isHidden());
    }

    // 권한 확인 메소드
    public void canFileMethods(String pathName) {
        File file = new File(pathName);
        System.out.println(pathName + " can read? = " + file.canRead());
        System.out.println(pathName + " can write? = " + file.canWrite());
        System.out.println(pathName + " can Execute? = " + file.canExecute()); // Java 6
    }

    // 파일이나 경로가 언제 생성되었는지 확인하는 메소드
    public void lastModified(String pathName) {
        File file = new File(pathName);
        System.out.println(pathName+" last modified = "+new Date(file.lastModified()));
    }
}
