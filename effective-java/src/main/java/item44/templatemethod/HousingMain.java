package item44.templatemethod;

public class HousingMain {
    public static void main(String[] args) {
        // template method 사용

        // 1. Wooden House
        HouseTemplate houseType = new WoodenHouse();

        houseType.buildHouse();

        System.out.println();
        System.out.println("===============");
        System.out.println();

        // 2. Glass House
        houseType = new GlassHouse();
        houseType.buildHouse();
    }
}
