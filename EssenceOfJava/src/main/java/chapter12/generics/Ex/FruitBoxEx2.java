package chapter12.generics.Ex;

public class FruitBoxEx2 {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<>();
        FruitBox<Apple> appleFruitBox = new FruitBox<>();
        FruitBox<Grape> grapeFruitBox = new FruitBox<>();
//        FruitBox2<Grape2> grape2FruitBox21 = new FruitBox2<Apple2>(); // error
//        FruitBox2<Toy2> toy2FruitBox2 = new FruitBox2<Toy2>(); // error

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());
        fruitBox.add(new Grape());
        appleFruitBox.add(new Apple());
//        appleFruitBox.add(new Grape());
        grapeFruitBox.add(new Grape());

        System.out.println("fruitBox-"+fruitBox);
        System.out.println("appleBox-"+appleFruitBox);
        System.out.println("grapeBox-"+grapeFruitBox);

    }
}

//class FruitBox2<T extends Fruit2 & Eatable> extends Box4{}
//class FruitBox2<T extends Fruit2 & Eatable> extends Box<T>{}

