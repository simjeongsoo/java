package item15.member;

import java.util.Arrays;

/**
 * MemberService 인터페이스를 구현한 DefaultMemberService는 package-private 으로 선언
 *  -> 구현체는 내부 패키지 안에서만 알면 되기 때문
 *  -> item은 MemberService라는 인터페이스만 가지고 사용 하길 바람(어떤 구현체를 사용하는지는 클라이언트 코드가 알 필요 없음 )
 *  -> item 에서 구체적인 클래스는 컨테이너나 스프링 IOC 컨테이너로 제공받는다면 구현체를 알 필요가 없다.
 *  -> 서비스 로딩을 한다고해도 인터페이스만 알면 된다.
 */
class DefaultMemberService implements MemberService{

    private String name;

    // DefaultMemberService와 단방향으로 사용한다면 private static 사용
    private static class PrivateStaticClass {
        // inner class 이지만 DefaultMemberService 클래스를 참조하는 필드가 없다.
        //  -> DefaultMemberService 클래스와 각각의 클래스로 정의됨
    }

    // DefaultMemberService와 양방향으로 사용한다면 private 사용
    private class PrivateClass {
        // static이 아니라면 감싸고 있는 DefaultMemberService의 인스턴스를 가지고 있다.
        //  -> DefaultMemberService 클래스의 필드에 접근하는 것이 수월하다.
        void doSomething() {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        // DefaultMemberService 타입으로 필드가 선언되어있어 서로 참조 가능
        // result : ... item15.member.DefaultMemberService
        Arrays.stream(PrivateClass.class.getDeclaredFields()).forEach(System.out::println);
    }

}
