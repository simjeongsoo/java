package StaticMethod;

public class ReferenceStatic {
    public static void main(String[] args) {
        ReferenceStatic.staticMethod();
        ReferenceStatic.staticMethodCallVariable();
    }
    public static String name="min";
    public static void staticMethod(){
        System.out.println("This is a staticMethod");
    }
    public static void staticMethodCallVariable(){
        System.out.println(name);
    }
}
