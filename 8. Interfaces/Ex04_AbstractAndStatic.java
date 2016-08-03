/**
 * Create an abstract class with no methods. Derive a class and add a method. Create a static method that takes
 * a reference to the base class, downcasts it to the derived class, and calls the method. In main( ), demonstrate
 * that it works. Now put the abstract declaration for the method in the base class, thus eliminating the need
 * for the downcast.
 */

abstract class Base1 {}

class Derived1 extends Base1 {
    void f() { System.out.println("Derived1.f()"); }
}

abstract class Base2 {
    abstract void f();
}

class Derived2 extends Base2 {
    void f() { System.out.println("Derived2.f()"); }
}

public class Ex04_AbstractAndStatic {

    static void testMethod1(Base1 b) {
        ((Derived1)b).f();
        //!b.f();
        //!No downcasting = cannot resolve method
    }

    static void testMethod2(Base2 b) {
        b.f();
    }

    public static void main(String[] args) {
        Derived1 d1 = new Derived1();
        Derived2 d2 = new Derived2();

        testMethod1(d1);
        testMethod2(d2);
    }
}
