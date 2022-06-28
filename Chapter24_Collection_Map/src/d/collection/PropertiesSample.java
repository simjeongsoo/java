package d.collection;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;
import java.util.Set;

public class PropertiesSample {
    public static void main(String[] args) {
        PropertiesSample sample = new PropertiesSample();
//        sample.checkProperties();
//        sample.saveAndLoadProperties();
        sample.saveAndLoadPropertiesXML();
    }

    // Properties 클래스로 시스템 속성값 확인
    public void checkProperties() {
        Properties properties = new Properties();
        Set<Object> KeySet = properties.keySet();
        for (Object tempObject : KeySet) {
            System.out.println(tempObject + " = " + properties.get(tempObject));
        }
    }

    // Properties 클래스로 속성값을 넣고 빼고 저장하고 읽어들이는 메소드
    public void saveAndLoadProperties() {
        try {
            String fileName = "test.properties"; // 파일이름 지정
            File propertiesFile = new File(fileName); // 파일 객체 생성
            FileOutputStream fos = new FileOutputStream(propertiesFile); // 파일 저장

            Properties prop = new Properties(); // Properties 객체 생성
            prop.setProperty("Writer", "Value"); // Key - Value
            prop.setProperty("WriterHome", "http://www.URL.com"); // Key - Value
            prop.store(fos, "Basic Properties file."); // store(OutputStream,주석) 메소드로 파일에 속성 저장
            fos.close();

            FileInputStream fis = new FileInputStream(propertiesFile); // 파일 읽기
            Properties propLoaded = new Properties();
            propLoaded.load(fis); // 파일에서 속성을 읽는 load(InputStream) 메소드
            fis.close();
            System.out.println(propLoaded); // result = {WriterHome=http://www.URL.com, Writer=Value}
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // XML 로 파일을 저장하고 읽는 메소드
    public void saveAndLoadPropertiesXML() {
        try {
            String fileName = "test.xml";
            File propertiesFile = new File(fileName);
            FileOutputStream fos = new FileOutputStream(propertiesFile);
            Properties prop = new Properties();
            prop.setProperty("Writer", "Value");
            prop.setProperty("WriterHome", "http://www.URL.com"); // Key - Value
            prop.storeToXML(fos, "Basic XML Property file.");
            fos.close();

            FileInputStream fis = new FileInputStream(propertiesFile);
            Properties propLoaded = new Properties();
            propLoaded.loadFromXML(fis);
            System.out.println(propLoaded);
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
