package chapter12.generics.Ex;

public class FruitBoxEx1 {
    public static void main(String[] args) {
        Box<Fruit> fruitBox3 = new Box<Fruit>();
        Box<Apple> appleBox3 = new Box<Apple>();
        Box<Toy> toyBox3 = new Box<Toy>();
//        Box3<Grape> grapeBox3 = new Box3<Apple>();  // error , type miss match

        fruitBox3.add(new Fruit()); // Fruit
        fruitBox3.add(new Apple()); // Apple

        appleBox3.add(new Apple()); // Apple
        appleBox3.add(new Apple()); // Apple
//        appleBox3.add(new Toy()); // error

        toyBox3.add(new Toy()); // Toy
//        toyBox3.add(new Apple()); // error

        System.out.println(fruitBox3);
        System.out.println(appleBox3);
        System.out.println(toyBox3);
    }
}

