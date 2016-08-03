/**
 * Modify the previous exercise by creating an abstract class and inheriting that into the derived class.
 *
 * Exercise 14:
 * Create three interfaces, each with two methods. Inherit a new interface that combines the three, adding a
 * new method. Create a class by implementing the new interface and also inheriting from a concrete class.
 * Now write four methods, each of which takes one of the four interfaces as an argument. In main( ), create
 * an object of your class and pass it to each of the methods.
 */

import static net.mindview.util.Print.*;

interface First {
    void a();
    void b();
}

interface Second {
    void c();
    void d();
}

interface Third {
    void e();
    void f();
}

interface Common extends First, Second, Third {
    void g();
}

abstract class Something {
    int x;
    Something(int xxx) { x = xxx; }
    abstract void abs();
}

class Combined extends Something implements Common {
    Combined(int x) { super(x); }

    @Override public void a() { printnb(" a()"); }
    @Override public void b() { printnb(" b()"); }
    @Override public void c() { printnb(" c()"); }
    @Override public void d() { printnb(" d()"); }
    @Override public void e() { printnb(" e()"); }
    @Override public void f() { printnb(" f()"); }
    @Override public void g() { printnb(" g()"); }

    @Override void abs() { printnb(" abs()"); }
}

public class Ex15_ThreeInterfacesAbstract {

    static void method1(First f) {
        f.a();
        f.b();
    }

    static void method2(Second s) {
        s.c();
        s.d();
    }

    static void method3(Third t) {
        t.f();
        t.e();
    }

    static void methodForAll(Common c) {
        c.a();
        c.b();
        c.c();
        c.d();
        c.e();
        c.f();
    }

    public static void main(String[] args) {

        Combined c = new Combined(123);

        method1(c);
        method2(c);
        method3(c);
        methodForAll(c);
    }
}
