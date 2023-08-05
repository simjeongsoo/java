package c.overriding;

public class ChildOverridingPrivate extends ParentOverridingPrivate{
    public ChildOverridingPrivate() {
        System.out.println("ChildOverridingPrivate Constructor");
    }

    public void printName() {
        System.out.println("ChildOverridingPrivate printName()");
    }
}
