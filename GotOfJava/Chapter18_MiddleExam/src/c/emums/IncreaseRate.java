package c.emums;

// type 에 따른 연봉 인상률을 정의한 enum 클래스
public enum IncreaseRate {
    OWNER(-0.95),
    MANAGER(0.1),
    DESIGNER(0.2),
    ARCHITECT(0.3),
    DEVELOPER(1);


    private final double increaseRate;

    IncreaseRate(double increaseRate) {
        this.increaseRate = increaseRate;
    }

    public double getIncreaseRate() {
        return increaseRate;
    }
}
