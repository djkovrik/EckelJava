/**
 * Create three new types of exceptions. Write a class with a method that throws all three. In main( ),
 * call the method but only use a single catch clause that will catch all three types of exceptions.
 */

class MyException1 extends Exception {}
class MyException2 extends Exception {}
class MyException3 extends Exception {}

class Storage {
    static void f() throws MyException1, MyException2, MyException3 {
        throw new MyException1();
    }
}

public class Ex09_ThreeExceptions {
    public static void main(String[] args) {
        try {
            Storage.f();
        } catch (Exception e) {
            System.out.println("Exception caught: " + e);
        }
    }
}
