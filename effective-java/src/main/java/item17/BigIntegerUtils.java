package item17;

import java.math.BigInteger;

public class BigIntegerUtils {
    // 상속이 허용된 경우 하위타입으로 들어올 파라미터를 알 수 없기 때문에 검증후 재정의를 해야 한다.
        //-> 방어적 복사
    public static BigInteger safeInstance(BigInteger val) {
        return val.getClass() == BigInteger.class ? val : new BigInteger(val.toByteArray());
    }
}
