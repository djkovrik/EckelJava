/**
 * Modify Exercise 5 so that A and B have constructors with arguments instead of
 * default constructors. Write a constructor for C and perform all initialization
 * within C’s constructor.
 *
 * Create two classes, A and B, with default constructors (empty argument lists)
 * that announce themselves. Inherit a new class called C from A, and create a
 * member of class B inside C. Do not create a constructor for C. Create an
 * object of class C and observe the results.
 */

class A {
    int x;
    A(int xxx) {
        int x = xxx;
        System.out.println("A(" + x + ")");
    }
}

class B {
    int y;
    B(int yyy) {
        y = yyy;
        System.out.println("B(" + y + ")");
    }
}
// C
public class Ex07_ABC_Args extends A {
    B b;
    Ex07_ABC_Args(int z) {
        super(z);
        b = new B(z);
    }

    public static void main(String[] args) {
        new Ex07_ABC_Args(123);
    }
}
