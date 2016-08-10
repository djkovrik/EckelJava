/**
 * Determine whether an outer class has access to the private elements of its inner class.
 */

class Outer {
    class Inner {
        private int x = 123;
        private void print() { System.out.println("x = " + x); }
    }

    void testAccess() {
        Inner i = new Inner();
        i.x = 321;
        i.print();
    }
}

public class Ex08_PrivateAccess {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.testAccess();
    }
}
