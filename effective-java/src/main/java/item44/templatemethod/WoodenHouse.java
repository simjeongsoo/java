package item44.templatemethod;

public class WoodenHouse extends HouseTemplate {
    @Override
    public void buildWalls() {
        System.out.println("나무 벽");
    }

    @Override
    public void buildPillars() {
        System.out.println("나무 기둥");
    }
}
