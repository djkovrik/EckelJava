/**
 * Create a class with a private field and a private method. Create an inner class with a method that modifies
 * the outer-class field and calls the outer-class method. In a second outer-class method, create an object of
 * the inner class and call its method, then show the effect on the outer-class object.
 */

public class Ex07_InnerOuter {
    private String field = "Initial string";
    private void print() { System.out.println("String = " + field); }

    private void secondMethod() {
        new Inner().modify();
    }

    class Inner {
        void modify() { field = field + " modified"; print(); }
    }

    public static void main(String[] args) {
        Ex07_InnerOuter io = new Ex07_InnerOuter();
        io.print();
        io.secondMethod();
    }
}
