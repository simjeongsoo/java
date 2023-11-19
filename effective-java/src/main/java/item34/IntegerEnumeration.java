package item34;

public class IntegerEnumeration {
    public static final int APPLE_FUFI = 0;
    public static final int APPLE_PIPPIN = 1;
    public static final int APPLE_GRANNY_SMITH = 2;

    public static final int ORANGE_NAVEL = 0;
    public static final int ORANGE_TEMPLE = 1;
    public static final int ORANGE_BLOOD = 2;

    private void inputOrange(int orange) {
        // ORANGE_NAVEL 값에 대해서만 검증 수행
        if (orange == ORANGE_NAVEL) {
            System.out.println("input " + ORANGE_NAVEL + "!!");
        } else {
            throw new IllegalArgumentException(ORANGE_NAVEL + " 가 아닙니다.");
        }
    }

    public static void main(String[] args) {
        IntegerEnumeration ie = new IntegerEnumeration();
        ie.inputOrange(APPLE_FUFI);
    }
}
