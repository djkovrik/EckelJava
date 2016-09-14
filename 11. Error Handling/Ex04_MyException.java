/**
 * Create your own exception class using the extends keyword. Write a constructor for this class that takes a
 * String argument and stores it inside the object with a String reference. Write a method that displays the
 * stored String. Create a try-catch clause to exercise your new exception.
 */

class MyException extends Exception {
    private String str;

    MyException(String str) { this.str = str; }
    String what() { return str; }
}

public class Ex04_MyException {
    public static void main(String[] args) {

        try {
            throw new MyException("Some description text here.");
        } catch (MyException me) {
            System.out.println("Exception: " + me.what());
        }
    }
}
