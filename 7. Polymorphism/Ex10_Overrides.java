/**
 * Create a base class with two methods. In the first method, call the
 * second method. Inherit a class and override the second method. Create
 * an object of the derived class, upcast it to the base type, and call
 * the first method. Explain what happens.
 */

class Base {
    public void f() { System.out.println("Base.f() calls g(): "); g(); }
    public void g() { System.out.println("Base.g()"); }
}

class Derived extends Base {
    @Override public void g() { System.out.println("Derived.g()"); }
}


public class Ex10_Overrides {

    public static void main(String[] args) {

        Base b = new Derived();
        b.f();
    }
}
