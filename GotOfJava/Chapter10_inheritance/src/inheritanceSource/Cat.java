package inheritanceSource;

public class Cat extends Animal{
    public Cat(String name, int legCount, boolean hasWing) {
        super(name, legCount, hasWing);
    }

    @Override
    public void move() {
        System.out.println("cat move");
        System.out.println(super.name);
        super.fly();
    }

    @Override
    public void eatFood() {
        System.out.println("cat eat food");
    }
}
