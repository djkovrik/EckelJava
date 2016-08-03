/**
 * Create a base class with an abstract print( ) method that is overridden in a derived class. The overridden
 * version of the method prints the value of an int variable defined in the derived class. At the point of
 * definition of this variable, give it a nonzero value. In the base-class constructor, call this method.
 * In main( ), create an object of the derived type, and then call its print( ) method. Explain the results.
 */

abstract class Base {
    Base() { print(); }
    abstract void print();
}

class Derived extends Base {
    private int x = 123;
    void print() { System.out.println("x = " + x); }
}

public class Ex03_AbstractPrint {

    public static void main(String[] args) {
        Derived d = new Derived();
        d.print();
    }
}
