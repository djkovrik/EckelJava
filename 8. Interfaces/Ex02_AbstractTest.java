/**
 * Create a class as abstract without including any abstract methods and verify that you cannot create any instances
 * of that class.
 */

abstract class Test {
    void f() {}
}

public class Ex02_AbstractTest {

    public static void main(String[] args) {
        //!Test t = new Test();
        //!Error: Test is abstract; cannot be instantiated
    }
}
