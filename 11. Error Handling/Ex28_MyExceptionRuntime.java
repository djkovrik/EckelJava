/**
 * Modify Exercise 4 so that the custom exception class inherits from RuntimeException, and show that the
 * compiler allows you to leave out the try block.
 *
 * Exercise 4:
 * Create your own exception class using the extends keyword. Write a constructor for this class that takes a
 * String argument and stores it inside the object with a String reference. Write a method that displays the
 * stored String. Create a try-catch clause to exercise your new exception.
 */

class MyException extends RuntimeException {
    private String str;

    MyException(String str) { this.str = str; }
    String what() { return str; }
}

public class Ex28_MyExceptionRuntime {
    public static void main(String[] args) {
        throw new MyException("Some description text here.");
    }
}
