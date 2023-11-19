package item34;

public enum Planet {
    MERCURY(3.302e+23, 2.439e6),
    VENUS(4.869e+24, 6.052e6),
    EARTH(5.975e+24, 6.378e6);

    private final double mass;              // 질량(단위: 킬로그램)
    private final double radius;            // 반지름(단위: 미터)
    private final double surfaceGravity;    // 표면중력(단위 m/s^2)

    // 중력상수(단위: m^2 / kg s^2)
    private static final double G = 6.67300E-11;

    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
        this.surfaceGravity = G * mass / (radius * radius);
    }

    public double mess(){return mass;}
    public double radius(){return radius;}
    public double surfaceGravity(){return surfaceGravity;}

    public double surfaceWeight(double mass) {
        return mass * surfaceGravity; // F = ma
    }
}
