package stringsource;

import java.util.Locale;

public class UseStringMethod {
    public static void main(String[] args) {
        UseStringMethod method = new UseStringMethod();
        String str = "The String class represents character strings.";

        method.printWords(str);
        method.findString(str,"string");
        method.findAnyCaseString(str,"string");
        method.countChar(str,'s');
        method.printContainWords(str,"ss");
    }

    public void printWords(String str) { // str 문장의 단어 출력
        String splitArray[] = str.split(" ");

        for (String data : splitArray) {
            System.out.println(data);
        }
    }

    public void findString(String str, String findStr) {
//        System.out.println("string is appeared at "+str.indexOf(findStr));
        int index = str.indexOf(findStr);
        if (index != -1) {
            System.out.println(findStr +" is appeared at "+index);
        }
    }

    public void findAnyCaseString(String str, String findStr) { // 대소문자 구분없이 동일한 단어의 첫번째 위치 출력
//        System.out.println("string is appeared at "+str.toLowerCase(Locale.ROOT).indexOf(findStr));
        String loStr = str.toLowerCase();
        String loFindStr = findStr.toLowerCase();
        int index = loStr.indexOf(loFindStr);
        if (index != -1) {
            System.out.println(findStr+" is appeared at "+ index);
        }
    }

    public void countChar(String str, char c) { // str 에서 c 와 동일한 char 갯수 출력
        char[] charAry = str.toCharArray();
        int cnt = 0;
        for (char data : charAry) {
            if (data == c) {
                cnt++;
            }
        }
        System.out.println("char \'" + c + "\' count is " + cnt);
    }

    public void printContainWords(String str, String findStr) { // str 에서 findStr 이 포함된 단어 출력
        String[] strAry = str.split(" ");
        for (String data : strAry) {
            if (data.contains(findStr)) {
                System.out.println(data +" contains "+ findStr);
                break;
            }
        }
    }
}
