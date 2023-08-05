package inheritanceSource;

public class bird extends Animal{

    public bird(String name, int legCount, boolean hasWing) {
        super(name,legCount, hasWing);
    }

    @Override
    public void eatFood() {
        System.out.println("bird eat food");
    }

    @Override
    public void fly() {
        System.out.println("bird is fly");
    }
}
