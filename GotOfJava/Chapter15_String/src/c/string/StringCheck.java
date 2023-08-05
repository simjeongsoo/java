package c.string;

public class StringCheck {
    public static void main(String[] args) {
        StringCheck check = new StringCheck();

        String addresses[] = new String[]{
                "서울시 구로구 신림동",
                "경기도 성남시 분당구 정자동 개발 공장",
                "서울시 구로구 개봉동",
        };
//        check.checkAddress(addresses);
//        check.containsAddress(addresses);
//        check.checkMatch();
//        check.checkIndex();
//        check.checkLastIndex();
//        check.checkSubstring();
//        check.checkSplit();
//        check.checkTrim();
//        check.checkReplace();
//        check.checkFormat();
//        check.valueOfCheck();
        check.internCheck();
    }


    // startsWith() endsWith() 메소드로 원하는 값이 해당 문자열 시작과 끝에 있는지 확인
    public void checkAddress(String[] addresses) {
        int startCount = 0, endCount = 0;
        String startText = "서울시";
        String endText = "동";
        for (String address : addresses) {
            if (address.startsWith(startText)) {
                startCount++;
            }
            if (address.endsWith(endText)) {
                endCount++;
            }
        }
        System.out.println("Starts with "+startText+" count is "+startCount); // 3
        System.out.println("Ends with "+endText+" count is "+endCount);// 2
    }

    // contains() 메소드 , matches(String 정규표현식)
    public void containsAddress(String[] addresses) {
        int containCount = 0;
        String containText = "구로";
        for (String address : addresses) {
            if (address.contains(containText)) {
                containCount++;
            }
        }
        System.out.println("Contains "+containText+" count is "+containCount);
    }

    // regionMatches()
    public void checkMatch() {
        String text = "This is a text";
        String compare1 = "is";
        String compare2 = "this";
        System.out.println(text.regionMatches(2,compare1,0,1)); // text 2번째 위치 i 인지 확인
        System.out.println(text.regionMatches(5, compare1, 0, 2)); // text 5번째 위치 is 확인
        System.out.println(text.regionMatches(true,0,compare2,0,4)); // 대소문자 구분x text 0번째 위치 this 확인
    }

    // indexOf() 문자열의 위치를 찾는 메소드
    public void checkIndex() {
        String text = "Java technology is both a programming language and a platform.";
        System.out.println(text.indexOf('a'));
        System.out.println(text.indexOf("a "));
        System.out.println(text.indexOf('a', 20));
        System.out.println(text.indexOf("a ", 20));
        System.out.println(text.indexOf('z')); // 없음 -1
    }

    // lastIndexOf() 문자열의 위치를 오른쪽부터 찾는 메소드
    // charAt() 특정 위치의 char 값을 리턴하는 메소드
    public void checkLastIndex() {
        String text = "Java technology is both a programming language and a platform.";
        System.out.println(text.lastIndexOf('a'));
        System.out.println(text.lastIndexOf("a "));
        System.out.println(text.lastIndexOf('a', 20));
        System.out.println(text.lastIndexOf("a ", 20));
        System.out.println(text.lastIndexOf('z')); // 없음 -1

        System.out.println(text.charAt(30)); // 특정 위치의 char 값을 리턴
    }

    // substring() 문자열을 잘라내는 메소드
    public void checkSubstring() {
        String text = "Java technology";
        String technology = text.substring(5);
        System.out.println(technology);

        String tech = text.substring(5, 9);
        System.out.println(tech);
    }

    // split() 정규표현식에 맞추어 문자열을 잘라 String 배열로 리턴하는 메소드
    public void checkSplit() {
        String text = "Java technology is both a programming language and a platform.";
        String[] splitArray = text.split(" ");

        for (String temp : splitArray) {
            System.out.println(temp);
        }
    }

    // concat()  == +  , trim() == 공백제거
    public void checkTrim() {
        String strings[] = new String[]{
                " a", " b ", "   c", "d   ", "e  f","   "
        };
        for (String string : strings) {
            System.out.println("["+string+"]");
            System.out.println("["+string.trim()+"]");
        }
        String text = " a ";
        if (text != null && text.trim().length() > 0) { // string 호출전 null check
            System.out.println("ok");
        }
    }

    // replace() 내용을 교체하는 메소드
    public void checkReplace() {
        String text = "The String Class represents character strings.";
        System.out.println(text.replace('s','z')); // 대소문자 구분
        System.out.println(text);
        System.out.println(text.replace("tring", "trike"));
        System.out.println(text.replaceAll(" ", "|"));
        System.out.println(text.replaceFirst(" ","|"));
    }

    // format() 특정 형식에 맞춰 값을 치환하는 메소드
    public void checkFormat() {
        String text = "제 이름은 %s입니다. 지금까지 %d 권의 책을 썼고," + "하루에 %f %%의 시간을 책을 쓰는데 사용.";
        String realText = String.format(text, "java", 7, 10.5);
//        String realText = String.format(text, "java", 7); // MissingFormatArgumentException 발생
        System.out.println(realText);

    }

    // toLowerCase() toUpperCase() 대소문자를 바꾸는 메소드

    // valueOf() 기본 자료형을 문자열로 변환하는 메소드
    public void valueOfCheck() {
        byte b=1;
        // 둘다 문자열로 변환
        String byte1 = String.valueOf(b);
        String byte2 = b + "";
        // 별도의 문자열과 합치는 과정이 없을 경우에 valueOf() 메소드 권장
        /*
        * valueOf() 메소드의 매개 변수로 객체가 넘어왔을 경우
        *   -> toString() 을 구현한 객체나 정상적인 객체를 valueOf() 메소드에 넘겨주면 toString()의 결과를 리턴해줌
        *       하지만 null 객체인경우 toString() 메소드를 사용할 수 없어서 객체를 출력할때 valueOf()를 사용하면 null 을 리턴
        *       System.out.println 이나  System.out.print 메소드에서 null 인 객체를 출력했을때 NullPointException 이 발생하지 않는 이유 */
    }

    // 사용하면 안되는 메소드 intern() , c 로 구현되어 있는 native 메소드
    public void internCheck() {
        String text1 = "Java Basic";
        String text2 = "Java Basic";
        String text3 = new String("Java Basic");
        text3 = text3.intern(); // intern 메소드를 수행한 뒤에 문자열은 == 으로 동일한지 비교 가능
        System.out.println(text1 == text2);
        System.out.println(text1 == text3);
        System.out.println(text1.equals(text3));
        /*
        * new String(String) 으로 생성한 문자열 객체라고 할지라도, 풀에 해당 값이 있으면, 풀에 있는 값을 참조하는 객체를 리턴,
        * 만약 동일한 동일한 문자열이 존재하지 않으면 풀에 해당 값을 추가
        *   -> 새로운 문자열을 쉴새 없이 만드는 프로그램에서 intern() 메소드를 사용하여 억지로 문자열 풀에 값을 할당하도록만들면
        *       저장되는 영역은 한계가 있기 때문에 그 영역에 대해서 별도로 메모리를 청소하는 단계를 거쳐 전체 자바 시스템 성능에 악영향*/
    }

    public void StringBufferStringBuilderCheck() {
        // String 문자열을 더하면 새로운 String 객체가 생성되고, 기존 객체는 버려짐 , 계속 하나의 String 을 만들어 더하는 작업을 하면 쓰레기를 만듬
        String text = "Hello"; // 이 객체는 Garbage Collection 의 대상이 됨
        text = text + "world";

        // StringBuffer : Thread safe
        //  ->어떤 클래스에 문자열을 생성하여 더하기 위한 문자열을 처리하기 위한 인스턴스 변수가 선언 되어 있고,
        //      여러 쓰레드에서 이 변수를 동시에 접근하는 일이 있을 경우 사용

        // StringBuilder : Thread not safe , 속도 빠름
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" world"); // 매개변수가 변수 일때 성능의 차이 발생
        sb.append("Hello").append(" world"); // append 메소드를 수행 한 후에 해당 StringBuilder 객체가 리턴되므로 붙이는 작업 가능
        // JDK5 이상에서는 String 더하기 연산을 할 경우, 컴파일 할 때 자동으로  해당 연산을 StringBuilder 로 변환해줌
        // 하지만 for loop 같은 반복연산에서는 자동변환 안해줌
    }

}
