/**
 * Create a class with a blank final reference to an object. Perform the initialization
 * of the blank final inside all constructors. Demonstrate the guarantee that the final
 * must be initialized before use, and that it cannot be changed once initialized.
 */

class SomeClass {
    private final int i;

    public SomeClass() {
        this.i = 123;
    }

    public SomeClass(int i) {
        this.i = i;
    }

    int getValue() { return i; }

    //void setValue(int i) {
    //    this.i = i;
    //}
    //!Cannot assign a value to final variable
}

public class Ex19_FinalInit {

    public static void main(String[] args) {
        SomeClass s = new SomeClass(123);
        System.out.println(s.getValue());
    }
}
