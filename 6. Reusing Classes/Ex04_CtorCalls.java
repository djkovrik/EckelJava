/**
 * Prove that the base-class constructors are (a) always called and
 * (b) called before derived-class constructors.
 */

class Base {
    Base() {
        System.out.println("Base()");
    }
}

class Derived extends Base {
    Derived() {
        System.out.println("Derived()");
    }
}

public class Ex04_CtorCalls extends Derived {
    Ex04_CtorCalls() {
        System.out.println("Ex04_CtorCalls()");
    }

    public static void main(String[] args) {
        new Ex04_CtorCalls();
    }
}
