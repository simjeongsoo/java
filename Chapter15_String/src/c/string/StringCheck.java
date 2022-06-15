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
        check.checkSplit();
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
}
