/**
 * Write a class named Outer that contains an inner class named Inner. Add a method to Outer that returns an
 * object of type Inner. In main( ), create and initialize a reference to an Inner.
 */

public class Ex01_Outer {

    class Inner {
        String str;
        Inner(String str) { this.str = str; }
        void print() { System.out.println(str); }
    }

    Inner getInner() {
        return new Inner("test");
    }

    public static void main(String[] args) {
        Ex01_Outer o = new Ex01_Outer();
        Inner i = o.getInner();
        i.print();
    }
}
