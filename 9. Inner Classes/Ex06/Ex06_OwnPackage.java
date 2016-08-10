/**
 * Create an interface with at least one method, in its own package. Create a class in a separate package.
 * Add a protected inner class that implements the interface. In a third package, inherit from your class and,
 * inside a method, return an object of the protected inner class, upcasting to the interface during the return.
 */

import own.SomeInterface;
import own2.SomeClass;

public class Ex06_OwnPackage extends SomeClass {

    SomeInterface foo() { return new Inner(); }

    public static void main(String[] args) {
        Ex06_OwnPackage op = new Ex06_OwnPackage();
        SomeInterface si = op.foo();
        si.f();
    }
}
