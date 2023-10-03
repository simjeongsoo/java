package item16;

/*
 *  public 필드 사용시
 * 1. 필드명 변경시 사용처를 찾기 어렵다.
 * 2. 필드의 값을 주거나 가져올때 부가적인 작업을 하기 어렵다.
 */
public class PublicFieldPoint {
    // public 필드가 아닌 접근자를 사용해라!
    public double x;
    public double y;

    public static void main(String[] args) {
        // 캡슐화의 장점을 제공하지 못함
        PublicFieldPoint p = new PublicFieldPoint();

        // 직접 필드에 접근
        p.x = 10;
        p.y = 20;

        // 메서드가 수행 된 뒤의 p객체의 값은 예상할 수 없다.
        doSomething(p);

        System.out.println(p.x);
        System.out.println(p.y);

    }

    // 가변 필드의 인스턴스를 사용하는 scope 내에서 복사해서 사용해야 안전하다.
    private static void doSomething(PublicFieldPoint p) {
        PublicFieldPoint localP = new PublicFieldPoint();
        localP.x = p.x;
        localP.y = p.y;
    }
}
