package item16;

// public class 인 경우
public class PrivateFieldPoint {
    // 필드의 접근 제한자를 private으로 바꾸고 getter를 제공 -> 정보 은닉
    private double x;
    private double y;

    public PrivateFieldPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // 필드명을 바꾸더라도 메서드명은 유지 가능(유연한 대응)
    public double getX() {
        // 부가 작업이 가능하다
        return x;
    }
    public double getY() {return y;}

    public void setX(double x) {
        // 부가 작업
        this.x = x;
    }
    public void setY(double y) {this.y = y;}
}
