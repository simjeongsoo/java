package chapter12.generics.Ex;

import java.util.Comparator;

public class FruitComp implements Comparator<Fruit> {
    @Override
    public int compare(Fruit o1, Fruit o2) {
        return o2.weight - o1.weight;
    }
}
