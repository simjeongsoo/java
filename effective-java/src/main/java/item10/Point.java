package item10;

/**
 * equals의 추이성
 *  A.equals(B) && B.equals(C), A.equals(C)
 */
public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (!(obj instanceof Point)) {
//            return false;
//        }
//        Point p = (Point) obj;
//        return p.x == x && p.y == y;
//    }

    // 잘못된 코드 - 리스코프 치환 원칙 위배! (p.59)
    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        Point p = (Point) obj;
        return p.x == x && p.y == y;
    }
}
