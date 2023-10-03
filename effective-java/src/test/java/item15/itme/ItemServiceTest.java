package item15.itme;

import item15.member.MemberService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ItemServiceTest {

    @Mock
    MemberService memberService;

    @Test
    void itemService() {
        // DefaultMemberService 클래스를 참조 불가능(같은 패키지가 아님)
        ItemService service = new ItemService(memberService);
        assertNotNull(service);
        assertNotNull(service.getMemberService() );

    }


}