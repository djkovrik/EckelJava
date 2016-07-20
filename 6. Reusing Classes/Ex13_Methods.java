/**
 * Create a class with a method that is overloaded three times. Inherit
 * a new class, add a new overloading of the method, and show that all
 * four methods are available in the derived class.
 */

class Base {
    public void f(int i) { System.out.println("f(int)"); }
    public void f(char c) { System.out.println("f(char)"); }
    public void f(double d) { System.out.println("f(double)"); }
}

public class Ex13_Methods extends Base {
    public void f(boolean b) { System.out.println("f(boolean)"); }

    public static void main(String[] args) {
        Ex13_Methods m = new  Ex13_Methods();
        m.f(1);
        m.f('z');
        m.f(2.3);
        m.f(true);
    }
}
