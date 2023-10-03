package item15.itme;

import item15.member.MemberService;

public class ItemService {

    // public한 클래스에 되도록이면 public한 인스턴스는 존재하면 안된다.(test를 위해서라도)
    private MemberService memberService;

    // 이렇게 변경될 수 있는 멤버는 만들면 안된다.
//    public static final String[] NAMES = new String[10];

    boolean onSale;

    // 상속을 받으면 공개 api가 되는 protected (피하는것을 권장)
    protected int saleRate;

    public ItemService(MemberService memberService) {
        // 가장 이상적인 체크
        if (memberService == null) {
            throw new IllegalArgumentException("memberService should not be null.");
        }
        this.memberService = memberService;
    }

    // test를 위해 getter를 package-private 으로 만듬
    // test 때문에 public한 멤버들을 만들면 안된다.
    MemberService getMemberService() {
        return memberService;
    }
}
