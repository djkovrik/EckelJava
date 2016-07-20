/**
 * Create a class with a final method. Inherit from that class and attempt
 * to overwrite that method.
 */

class FinalMethod {
    public final void f() {}
}

class Derived extends FinalMethod {
    //!public void f() {}
    //!cannot override f(); overriden method is final
}


public class Ex21_FinalMethod {
}
