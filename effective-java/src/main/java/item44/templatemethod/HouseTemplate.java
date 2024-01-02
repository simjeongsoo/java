package item44.templatemethod;

public abstract class HouseTemplate {

    // final로 Override 방지
    public final void buildHouse() {
        System.out.println("집짓기 시작");
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
        System.out.println("집짓기 완료");
    }

    // 기본으로 구현
    public void buildFoundation() {
        System.out.println("땅파기");
    }

    public void buildWindows() {
        System.out.println("유리창");
    }

    // 서브 클래스에서 직접 구현
    public abstract void buildWalls();
    public abstract void buildPillars();
}
