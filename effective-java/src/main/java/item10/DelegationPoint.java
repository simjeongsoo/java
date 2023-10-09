package item10;

import java.util.Objects;

// 코드 10-5 equals 규약을 지키면서 값 추가하기 (p.60)
//  - 상속을 하지 않고 컴포지션 사용
public class DelegationPoint {
    private final Point point; // 상속이 아닌 하나의 필드로 선언
    private final Color color;

    public DelegationPoint(int x, int y, Color color) {
        point = new Point(x, y);
        this.color = Objects.requireNonNull(color);
    }

    /**
     * @return 이 DelegationPoint 의 Point 뷰를 반환한다.
     */
    public Point asPoint(){return point;}

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof DelegationPoint)) {
            return false;
        }
        DelegationPoint dp = (DelegationPoint) obj;
        return dp.point.equals(point) && dp.color.equals(color);
    }
}
