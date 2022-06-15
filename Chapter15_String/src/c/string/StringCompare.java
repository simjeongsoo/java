package c.string;

public class StringCompare {
    public static void main(String[] args) {
        StringCompare compare = new StringCompare();
//        compare.checkString();
//        compare.checkCompare();
        compare.checkCompareTo();
    }

    public void checkString() {
        String text = "You must know String class";
        System.out.println("text.length() = "+text.length()); // 문자열의 길이를 확인하는 메소드 return int
        System.out.println("text.isEmpty() = "+text.isEmpty()); // 문자열이 비어있는지 확인하는 메소드 return boolean
    }

    public void checkCompare() {
        String text = "Check value";
//        String text2 = "Check value";
        String text2 = new String("Check value"); // 이렇게 String 객체를 생성하면 Constant Pool 을 사용하지 않고 별도의 객체 생성
        if (text == text2) {
            // 자바에서는 객체를 equals() 메소드로 비교를 해야 하지만 == 연산사로도 비교결과가 나온다
            // 이유는 자바에 Constant Pool 이 존재하기 때문
            // -> 이 풀은 자바에서 객체들을 재사용 하기 위해 Constant Pool 이 만들어져 있고 String 의 경우 동일한 값을 갖는 객체가 있으면,
            //      이미 만든 객체를 재사용 한다, 따라서 text 와 text2 의 객체는 실제로 같은 객체이다
            System.out.println("text==text2 result is same.");
        } else {
            System.out.println("text==text2 result is different");
        }
        if (text.equals("Check value")) {
            System.out.println("text.equals(text2) result is same");
        }

        String text3 = "check value";
        if (text.equalsIgnoreCase(text3)) { // 대소문자 무시 문자열 비교
            System.out.println("text.equalsIgnoreCase(text3) result is same.");
        }
    }

    public void checkCompareTo() { // compareTo() 메소드는 Comparable 인터페이스에 선언
        String text = "a";
        String text2 = "b";
        String text3 = "c";
        System.out.println(text2.compareTo(text)); // 1
        System.out.println(text.compareTo(text2)); // -1
        System.out.println(text.compareTo(text3)); // -2
        // compareTo() 메소드는 보통 정렬(sorting) 할 때 사용
        // compareToIgnoreCase() 는 대소문자를 구분하지 않고 비교
    }

}
