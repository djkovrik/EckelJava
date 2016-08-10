/**
 * Create an interface that contains a nested class that has a static method that calls the methods of your
 * interface and displays the results. Implement your interface and pass an instance of your implementation
 * to the method.
 */

interface TestInterface {
    void f();
    void g();

    class Tester {
        static void test(TestInterface t) {
            t.f();
            t.g();
        }
    }
}

public class Ex21_StaticMethod implements TestInterface {
    @Override public void f() { System.out.println("Ex21_StaticMethod.f()"); }
    @Override public void g() { System.out.println("Ex21_StaticMethod.g()"); }

    public static void main(String[] args) {
        Ex21_StaticMethod sm = new Ex21_StaticMethod();
        Tester.test(sm);
    }
}
