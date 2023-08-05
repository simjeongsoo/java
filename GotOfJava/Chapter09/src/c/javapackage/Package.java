package c.javapackage;
import c.javapackage.sub.Sub;
// static 변수,메소드 사용
//import c.javapackage.sub.SubStatic;

//import static 사용
import static c.javapackage.sub.SubStatic.subStaticMethod;
import static c.javapackage.sub.SubStatic.CLASS_NAME;

// SubStatic 클래스 전체 사용
//import static c.javapackage.sub.SubStatic.*;

public class Package{

  // static 메소드나 변수가 중복되는 상황에서는 자신의 클래스에 있는 static변수나 메소드가 import static으로 가져온 것보다 우선
  public static String CLASS_NAME = "my static value";

  public static void main(String[] args){
    //System.out.println("Package class.");
    Sub sub=new Sub();
    sub.subClassMethod();

// static 변수,메소드 사용
//    SubStatic.subStaticMethod();
//    System.out.println(SubStatic.CLASS_NAME);

    //import static 사용
    subStaticMethod();
    System.out.println(CLASS_NAME);

  }
}
