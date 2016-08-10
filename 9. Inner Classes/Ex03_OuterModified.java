/**
 * Modify Exercise 1 so that Outer has a private String field (initialized by the constructor), and Inner
 * has a toString( ) that displays this field. Create an object of type Inner and display it.
 *
 * Exercise 1:
 * Write a class named Outer that contains an inner class named Inner. Add a method to Outer that returns an
 * object of type Inner. In main( ), create and initialize a reference to an Inner.
 */

public class Ex03_OuterModified {
    private String field;

    Ex03_OuterModified(String str) { field = str; }

    class Inner {
        String str;
        Inner(String str) { this.str = str; }
        void print() { System.out.println(str); }
        public String toString() { return field; }
    }

    Inner getInner() {
        return new Inner("Inner string");
    }

    public static void main(String[] args) {
        Ex03_OuterModified o = new Ex03_OuterModified("Outer string");
        Inner i = o.getInner();
        i.print();
        System.out.println(i);
    }
}
