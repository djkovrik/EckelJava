/**
 * Create a class with a non-default constructor (one with arguments) and no default constructor
 * (no "no-arg" constructor). Create a second class that has a method that returns a reference to
 * an object of the first class. Create the object that you return by making an anonymous inner class
 * that inherits from the first class.
 */

class First {
    First(int x) { System.out.println("First(" + x + ")"); }
}

class Second {
    First f(int i) {
        return new First(i) {};
    }
}

public class Ex15_TwoClasses {

    public static void main(String[] args) {
        First f = new Second().f(321);
    }
}
