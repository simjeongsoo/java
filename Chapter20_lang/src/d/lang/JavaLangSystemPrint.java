package d.lang;

// System.out
public class JavaLangSystemPrint {
    public static void main(String[] args) {
        JavaLangSystemPrint print = new JavaLangSystemPrint();
        //print.printStreamCheck();
        print.printNull();
    }

    public void printStreamCheck() {
        byte b = 127;
        short s = 32767;
        System.out.println(b);
        System.out.println(s);
        printInt(b);
        printInt(s);
    }
    private void printInt(int value) {
        System.out.println(value);
    }

    public void printNull() {
        Object obj = null;
        System.out.println(obj); // 실제로는 String.valueOf(obj) 가 출력

        System.out.println(obj+" is object's value"); // 컴파일러에서 더하기 문장을 StringBuilder 로 변환
                                                      // == new StringBuilder().append(obj).append(" is object's value)

        System.out.println(obj.toString()); // NullPointerException 발생
    }

}
