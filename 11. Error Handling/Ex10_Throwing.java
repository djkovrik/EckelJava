/**
 * Create a class with two methods, f( ) and g( ). In g( ), throw an exception of a new type that you define.
 * In f( ), call g( ), catch its exception and, in the catch clause, throw a different exception (of a second
 * type that you define). Test your code in main( ).
 */

class FirstException extends Exception {
    public FirstException(String s) { super(s); }
}

class SecondException extends Exception {
    public SecondException(String s) { super(s); }
}

public class Ex10_Throwing {
    public static void g() throws FirstException {
        throw new FirstException("Exception #1");
    }

    public static void f() throws SecondException {
        try {
            g();
        } catch (FirstException e) {
            System.out.println("Caught in f(): " + e);
            throw new SecondException("Exception #2");
        }
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (SecondException e) {
            System.out.println("Caught in main(): " + e);
        }
    }
}
