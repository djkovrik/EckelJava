/**
 * Demonstrate that a derived-class constructor cannot catch exceptions thrown by its base-class constructor.
 */

class MyException extends Exception {
    public MyException(String msg) { super(msg); }
}

class Base {
    public Base() throws MyException {
        throw new MyException("Exception from Base");
    }
}

public class Ex21_DerivedCtor extends Base {
    public Ex21_DerivedCtor() {
        try {
            super();
        } catch (MyException e) {
            System.out.println(e);
        }
    }

    //!
    //! Error: call to super must be first statement in constructor

    public static void main(String[] args) {

    }
}
