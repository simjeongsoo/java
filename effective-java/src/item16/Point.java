package item16;

/**
 *  public 필드 사용시
 * 1. 필드명 변경시 사용처를 찾기 어렵다.
 * 2. 필드의 값을 주거나 가져올때 부가적인 작업을 하기 어렵다.
 */
public class Point {
    // public 필드가 아닌 접근자를 사용해라!
    public double x;
    public double y;

    public static void main(String[] args) {
        // 캡슐화의 장점을 제공하지 못함
        Point p = new Point();

        // 직접 필드에 접근
        p.x = 10;
        p.y = 20;
        System.out.println(p.x);
        System.out.println(p.y);

    }
}
