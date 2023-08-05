package c.overriding;

public class InheritanceOverriding {
    public static void main(String[] args) {
        ChildOverriding child = new ChildOverriding();
        child.printName();

        //overriding 접근 제어자 확대
        ChildOverridingPrivate overridingPrivate = new ChildOverridingPrivate();
        overridingPrivate.printName();

    }
}
