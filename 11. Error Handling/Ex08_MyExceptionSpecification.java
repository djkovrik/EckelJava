/**
 * Write a class with a method that throws an exception of the type created in Exercise 4. Try compiling
 * it without an exception specification to see what the compiler says. Add the appropriate exception
 * specification. Try out your class and its exception inside a try-catch clause.
 *
 * Exercise 4:
 * Create your own exception class using the extends keyword. Write a constructor for this class that takes a
 * String argument and stores it inside the object with a String reference. Write a method that displays the
 * stored String. Create a try-catch clause to exercise your new exception.
 */

class MyException extends Exception {
    private String str;

    MyException(String str) { this.str = str; }
    String what() { return str; }
}

class SomeClass {
    public static void f() throws MyException {
        throw new MyException("Test");
    }
}

public class Ex08_MyExceptionSpecification {
    public static void main(String[] args) {
        try {
            SomeClass.f();
        } catch (MyException e) {
            System.out.println("Exception: " + e.what());
        }
    }
}
