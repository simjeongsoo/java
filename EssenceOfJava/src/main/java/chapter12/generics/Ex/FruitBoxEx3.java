package chapter12.generics.Ex;

public class FruitBoxEx3 {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<>();
        FruitBox<Apple> appleFruitBox = new FruitBox<>();

        fruitBox.add(new Apple());
        fruitBox.add(new Grape());
        appleFruitBox.add(new Apple());
        appleFruitBox.add(new Apple());

        System.out.println(Juicer.makeJuice(fruitBox));
        System.out.println(Juicer.makeJuice(appleFruitBox));
        
    }
}
