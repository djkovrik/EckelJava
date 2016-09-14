/**
 * Create your own resumption-like behavior using a while loop that repeats until an exception is no longer thrown.
 */

class MyException extends Exception {}

class MyClass {
    static int counter = 0;
    static void f() throws MyException {
        if (counter++ < 5) {
            throw new MyException();
        }
    }
}

public class Ex05_Resumption {
    public static void main(String[] args) {

        while (true) {
            try {
                MyClass.f();
            } catch (Exception e) {
                System.out.println("Exception: " + e);
                continue;
            }
            break;
        }
        System.out.println("Program completed.");
    }
}
