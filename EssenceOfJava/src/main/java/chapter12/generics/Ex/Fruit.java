package chapter12.generics.Ex;

interface Eatable {}

class Fruit implements Eatable{

    String name;
    int weight;

    public Fruit() {
    }

    public Fruit(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String toString() {
        return name + "(" + weight + ")";
    }
}
