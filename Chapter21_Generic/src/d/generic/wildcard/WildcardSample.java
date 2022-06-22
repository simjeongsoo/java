package d.generic.wildcard;

import d.generic.WildcardGeneric;

public class WildcardSample {
    public static void main(String[] args) {
        WildcardSample sample = new WildcardSample();
        sample.callWildcardMethod();
    }

    public void callWildcardMethod() {
        WildcardGeneric<String> wildcard = new WildcardGeneric<String>(); // String 을 사용하는 제네릭한 객체 생성
        wildcard.setWildcard("A");
        wildcardStringMethod(wildcard);
    }

    // 해당 매개변수를 받아서 결과 출력
    private void wildcardStringMethod(WildcardGeneric<String> c) {
        String value = c.getWildcard();
        System.out.println(value);
    }

    // 다른 타입으로 선언된 WildcardGeneric 객체를 받는 메소드
    private void wildcardStringMethod2(WildcardGeneric<?> c) { // 매개변수에 wildcard 타입으로 제네릭 처리
        Object value = c.getWildcard(); // 해당 타입을 모르기 때문에 String 으로 값을 받을수 없고, Object 로 처리
        System.out.println(value);

        // 넘어오는 타입이 두세가지로 정해져 있다면 instanceof 메소드로 타입 체크
        Object value2 = c.getWildcard();
        if (value2 instanceof String) {
            System.out.println(value2);
        }
    }

}
