/**
 * Create an interface with at least one method, and implement that interface by defining an inner class
 * within a method, which returns a reference to your interface.
 */

interface SomeInterface {
    void f();
}

public class Ex09_WithinAMethod {

    SomeInterface getInstance() {
        class SomeClass implements SomeInterface {
            public void f() { System.out.println("SomeClass.f()"); }
        }
        return new SomeClass();
    }

    public static void main(String[] args) {

        Ex09_WithinAMethod wm = new Ex09_WithinAMethod();
        wm.getInstance().f();
    }
}
