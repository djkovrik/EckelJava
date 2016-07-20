/**
 * Prove the previous sentence.
 *
 * Even if you don’t create a constructor for a class, the compiler will
 * synthesize a default constructor for you that calls the base class constructor.
 */

class A {
    A() { System.out.println("A constructor"); }
}

class B extends A {
    B() { System.out.println("B constructor"); }
}

public class Ex03_SyntCtor extends B {

    //public Ex03_SyntCtor() { System.out.println("Ex03_SyntCtor constructor"); }

    public static void main(String[] args) {
        Ex03_SyntCtor s = new Ex03_SyntCtor();
    }
}