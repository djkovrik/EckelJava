/**
 * Create two classes, A and B, with default constructors (empty argument lists)
 * that announce themselves. Inherit a new class called C from A, and create a
 * member of class B inside C. Do not create a constructor for C. Create an
 * object of class C and observe the results.
 */

class A {
    A() {
        System.out.println("A()");
    }
}

class B {
    B() {
        System.out.println("B()");
    }
}
// C
public class Ex05_ABC extends A {
    B b = new B();

    public static void main(String[] args) {
        new Ex05_ABC();
    }
}
