package chapter12.enums;

public enum Direction {
    EAST(1, ">"), SOUTH(2,"V"), WEST(3,"<"), NORTH(4,"^");

    private static final Direction[] DIR_ARR = Direction.values();
    private final int value;
    private final String symbol;

    Direction(int value, String symbol) { // access modifier private is omitted
        this.value = value;
        this.symbol = symbol;
    }

    public int getValue() { return value; }
    public String getSymbol() { return symbol; }

    public static Direction of(int dir) {
        if (dir < 1 || dir > 4) {
            throw new IllegalArgumentException("Invalied value : " + dir);
        }
        return DIR_ARR[dir - 1];
    }

    // A method to rotate the direction. Rotate clockwise by 90 degrees by the value of num
    public Direction rotate(int num) {
        num = num % 4;

        if (num <0) num += 4; // If num is negative, rotate counterclockwise.

        return DIR_ARR[(value - 1 + num) % 4];
    }

    public String toString() {
        return name() + getSymbol();
    }
}
