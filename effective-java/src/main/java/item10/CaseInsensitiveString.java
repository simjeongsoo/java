package item10;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * equals의 대칭성
 *  A.equals(B) == B.equals(A)
 */
public class CaseInsensitiveString {
    private final String s;

    public CaseInsensitiveString(String s) {
        this.s = Objects.requireNonNull(s);
    }

//    대칭성 위배
//    @Override
//    public boolean equals(Object obj) {
//        if (obj instanceof CaseInsensitiveString) {
//            return s.equalsIgnoreCase(
//                    ((CaseInsensitiveString) obj).s
//            );
//        }
//        // 다른 타입의 equals를 지원
//        if (obj instanceof String) { // 한 방향으로만 작동한다.
//            return s.equalsIgnoreCase((String) obj);
//        }
//        return false;
//    }

//    문제 사연 (p.55)
    public static void main(String[] args) {
        CaseInsensitiveString cis = new CaseInsensitiveString("Polish");
        String polish = "polish";
        // 재정의한 equals 사용
        System.out.println(cis.equals(polish)); // true
        // string 의 equals 사용
        System.out.println(polish.equals(cis)); // false

        List<CaseInsensitiveString> list = new ArrayList<>();
        list.add(cis); // list의 equals 사용
        System.out.println(list.contains(polish)); // false
    }

    @Override
    public boolean equals(Object obj) {
        // 대칭성을 유지하려면 다른타입을 지원하지 말아야 한다.
        return obj instanceof
                CaseInsensitiveString &&
                ((CaseInsensitiveString) obj).s.equalsIgnoreCase(s);
    }
}
