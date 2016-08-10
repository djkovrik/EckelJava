/**
 * Repeat Exercise 7 using an anonymous inner class.
 *
 * Exercise 7:
 * Create a class with a private field and a private method. Create an inner class with a method that modifies
 * the outer-class field and calls the outer-class method. In a second outer-class method, create an object of
 * the inner class and call its method, then show the effect on the outer-class object.
 */

public class Ex12_InnerOuterAnon {
    private String field = "Initial string";
    private void print() { System.out.println("String = " + field); }

    private void secondMethod() {
        Ex12_InnerOuterAnon in = new Ex12_InnerOuterAnon() {
            {
                field = field + " modified";
                print();
            }
        };
    }


    public static void main(String[] args) {
        Ex12_InnerOuterAnon io = new Ex12_InnerOuterAnon();
        io.print();
        io.secondMethod();
    }
}