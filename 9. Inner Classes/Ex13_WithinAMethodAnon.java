/**
 * Repeat Exercise 9 using an anonymous inner class.
 *
 * Exercise 9:
 * Create an interface with at least one method, and implement that interface by defining an inner class
 * within a method, which returns a reference to your interface.
 */

interface SomeInterface {
    void f();
}

public class Ex13_WithinAMethodAnon {

    SomeInterface getInstance() {
        return new SomeInterface() {
            public void f() { System.out.println("Anonymous.f()"); }
        };
    }

    public static void main(String[] args) {

        Ex13_WithinAMethodAnon wm = new Ex13_WithinAMethodAnon();
        wm.getInstance().f();
    }
}
