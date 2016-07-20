/**
 * Create a base class with only a non-default constructor, and a
 * derived class with both a default (no-arg) and non-default constructor.
 * In the derived-class constructors, call the base-class constructor.
 */

class Base {
    public Base(int x) {
        System.out.println("Base(" + x + ") called.");
    }
}

class Derived extends Base {
    public Derived() {
        super(123);
        System.out.println("Derived() called.");
    }

    public Derived(int x) {
        super(x);
        System.out.println("Derived(" + x + ") called.");
    }
}

public class Ex08_NonDefaultCtor {
    public static void main(String[] args) {
        new Derived();
        new Derived(321);
    }
}
