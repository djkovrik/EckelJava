/**
 * Modify Exercise 9 by adding a finally clause. Verify that your finally clause is executed,
 * even if a NullPointerException is thrown.
 *
 * Exercise 9:
 * Create three new types of exceptions. Write a class with a method that throws all three. In main( ),
 * call the method but only use a single catch clause that will catch all three types of exceptions.
 */

class MyException1 extends NullPointerException {}
class MyException2 extends Exception {}
class MyException3 extends Exception {}

class Storage {
    static void f() throws MyException1, MyException2, MyException3 {
        throw new MyException1();
    }
}

public class Ex13_ThreeExceptionsModified {
    public static void main(String[] args) {
        try {
            Storage.f();
        } catch (Exception e) {
            System.out.println("Exception caught: " + e);
        } finally {
            System.out.println("Finally block");
        }
    }
}
