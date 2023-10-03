package item16;

public final class Time {
    private static final int HOURS_PER_DAY = 24;
    private static final int MINUTES_PER_HOUR = 60;

    // 이렇게 사용되는 필드는 많지 않다.
    // 불변필드로 노출 되었더라도 단점이 그나마 줄어드는 것이지 문제가 생긴다.
    public final int hour;
    public final int minute;

    public Time(int hour, int minute) {
        if (hour < 0 || hour >= HOURS_PER_DAY) {
            throw new IllegalArgumentException("시간: " + hour);
        }
        if (minute < 0 || minute >= MINUTES_PER_HOUR) {
            throw new IllegalArgumentException("분: " + minute);
        }
        this.hour = hour;
        this.minute = minute;
    }

    //...
}
