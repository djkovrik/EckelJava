/**
 * Repeat the previous exercise but define the inner class within a scope within a method.
 *
 * Create an interface with at least one method, and implement that interface by defining an inner class
 * within a method, which returns a reference to your interface.
 */

interface SomeInterface {
    void f();
}

public class Ex10_WithinAMethodScope {

    SomeInterface getInstance() {
        {
            class SomeClass implements SomeInterface {
                public void f() {
                    System.out.println("SomeClass.f()");
                }
            }
            return new SomeClass();
        }
    }

    public static void main(String[] args) {

        Ex10_WithinAMethodScope wm = new Ex10_WithinAMethodScope();
        wm.getInstance().f();
    }
}
