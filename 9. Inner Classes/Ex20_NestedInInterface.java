/**
 * Create an interface containing a nested class. Implement this interface and create an instance of the nested class.
 */

interface SomeInterface {
    void f();
    static class Nested {
        public void f() {
            System.out.println("Nested.f()");
        }
    }
}

public class Ex20_NestedInInterface implements SomeInterface {
    @Override public void f() { System.out.println("Ex20_NestedInInterface.f()"); }

    public static void main(String[] args) {
        Ex20_NestedInInterface ni = new Ex20_NestedInInterface();
        ni.f();

        Nested n = new Nested();
        n.f();
    }
}
