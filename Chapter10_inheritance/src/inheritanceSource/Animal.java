package inheritanceSource;

public class Animal {
    String name;
    int legCount;
    boolean hasWing;

    public Animal(String name, int legCount, boolean hasWing) {
        this.name = name;
        this.legCount = legCount;
        this.hasWing = hasWing;
    }

    public static void main(String[] args) {
        Animal cat = new Cat("cat",4,false);
        System.out.println("name : "+cat.name);
        System.out.println("legCount : "+cat.legCount);
        System.out.println("hasWing : "+cat.hasWing);
        cat.move();

        System.out.println("---------------------");

        Animal bird2 = new bird("animalbird",99,false);
        System.out.println("name : "+bird2.name);
        System.out.println("legCount : "+bird2.legCount);
        System.out.println("hasWing : "+bird2.hasWing);
        bird2.fly();

    }
    public void move() {
        System.out.println("move animal");
    }
    public void eatFood() {
        System.out.println("animal eat Food");
    }

    public void fly() {
        System.out.println("fly?");
    }

}
