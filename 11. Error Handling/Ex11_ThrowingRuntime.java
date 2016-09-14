/**
 * Repeat the previous exercise, but inside the catch clause, wrap g( )’s exception in a RuntimeException.
 *
 * Create a class with two methods, f( ) and g( ). In g( ), throw an exception of a new type that you define.
 * In f( ), call g( ), catch its exception and, in the catch clause, throw a different exception (of a second
 * type that you define). Test your code in main( ).
 */

class FirstException extends Exception {
    public FirstException(String s) { super(s); }
}

public class Ex11_ThrowingRuntime {
    public static void g() throws FirstException {
        throw new FirstException("Exception #1");
    }

    public static void f() {
        try {
            g();
        } catch (FirstException e) {
            System.out.println("Caught in f(): " + e);
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        f();
    }
}
