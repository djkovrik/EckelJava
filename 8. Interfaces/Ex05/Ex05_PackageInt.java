/**
 * Create an interface containing three methods, in its own package. Implement the interface in a different package.
 */

import somepackage.*;

class Derived implements Base {
    @Override
    public void method1() {
        System.out.println("method1()");
    }

    @Override
    public void method2() {
        System.out.println("method2()");
    }

    @Override
    public void method3() {
        System.out.println("method3()");
    }
}

public class Ex05_PackageInt {

    public static void main(String[] args) {

        Derived d = new Derived();
        d.method1();
        d.method2();
        d.method3();
    }
}
