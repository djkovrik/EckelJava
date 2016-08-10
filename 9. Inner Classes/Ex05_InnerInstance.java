/**
 * Create a class with an inner class. In a separate class, make an instance of the inner class.
 */

class Outer {
    private int x;

    Outer(int x) {
        System.out.println("Outer(" + x + ") created.");
        this.x = x;
    }

    class Inner {
        private int y;

        Inner(int y) {
            System.out.println("Inner(" + y + ") created.");
            this.y = y;
        }
    }
}

public class Ex05_InnerInstance {

    public static void main(String[] args) {

        Outer o = new Outer(123);
        Outer.Inner oi = o.new Inner(321);
    }
}
