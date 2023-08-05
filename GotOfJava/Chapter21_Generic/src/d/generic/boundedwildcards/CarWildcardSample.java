package d.generic.boundedwildcards;

import d.generic.WildcardGeneric;

public class CarWildcardSample {
    public static void main(String[] args) {
        CarWildcardSample sample = new CarWildcardSample();
        sample.callBoundedWildcardMethod();
        sample.callBusWildcardMethod();
    }

    public void callBoundedWildcardMethod() {
        WildcardGeneric<Car> wildcard = new WildcardGeneric<Car>();
        wildcard.setWildcard(new Car("Mustang"));
        boundedWildcardMethod(wildcard);
    }

    public void callBusWildcardMethod() {
        WildcardGeneric<Bus> wildcardBus = new WildcardGeneric<Bus>();
        wildcardBus.setWildcard(new Bus("1000"));
        boundedWildcardMethod(wildcardBus);
    }

    private void boundedWildcardMethod(WildcardGeneric<? extends Car> c) {
        Car value = c.getWildcard();
        System.out.println(value);
    }
}
