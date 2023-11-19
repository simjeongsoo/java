package item34;

import java.util.Scanner;

public class WeightTable {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("지구에서의 무게 입력 : ");
        double earthWeight = scr.nextDouble();

        double mass = earthWeight / Planet.EARTH.surfaceGravity();
        for (Planet p : Planet.values()) {
            System.out.printf("%s에서의 무게는 %f이다.%n", p, p.surfaceWeight(mass) );
        }

        System.out.println(Planet.VENUS);
    }
}
