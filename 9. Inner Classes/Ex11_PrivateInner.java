/**
 * Create a private inner class that implements a public interface. Write a method that returns a reference to
 * an instance of the private inner class, upcast to the interface. Show that the inner class is completely
 * hidden by trying to downcast to it.
 */

public interface SomeInterface {
    void f();
}

public class Ex11_PrivateInner {

    private class Inner implements SomeInterface {
        @Override public void f() { System.out.println("Inner.f()"); }
    }

    SomeInterface getInner() {
        return new Inner();
    }

    public static void main(String[] args) {

        Ex11_PrivateInner pi = new Ex11_PrivateInner();
        SomeInterface si = pi.getInner();

        //Inner p1 = pi.getInner();
        //Inner p2 = (Inner) si;
    }
}
