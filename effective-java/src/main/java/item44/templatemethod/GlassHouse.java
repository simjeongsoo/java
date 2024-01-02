package item44.templatemethod;

public class GlassHouse extends HouseTemplate {
    @Override
    public void buildWalls() {
        System.out.println("유리 벽");
    }

    @Override
    public void buildPillars() {
        System.out.println("유리 기둥");
    }
}
