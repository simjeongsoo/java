package item15.member;

/**
 * MemberService 인터페이스를 구현한 DefaultMemberService는 package-private 으로 선언
 *  -> 구현체는 내부 패키지 안에서만 알면 되기 때문
 *  -> item은 MemberService라는 인터페이스만 가지고 사용 하길 바람(어떤 구현체를 사용하는지는 클라이언트 코드가 알 필요 없음 )
 *  -> item 에서 구체적인 클래스는 컨테이너나 스프링 IOC 컨테이너로 제공받는다면 구현체를 알 필요가 없다.
 *  -> 서비스 로딩을 한다고해도 인터페이스만 알면 된다.
 */
class DefaultMemberService implements MemberService{
    MemberRepository memberRepository;

    public Member getMember() {
        memberRepository.findById();
        return null;
    }
}
