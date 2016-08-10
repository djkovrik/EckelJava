/**
 * Create an interface U with three methods. Create a class A with a method that produces a reference to
 * a U by building an anonymous inner class. Create a second class B that contains an array of U.
 * B should have one method that accepts and stores a reference to a U in the array, a second method that sets
 * a reference in the array (specified by the method argument) to null, and a third method that moves through
 * the array and calls the methods in U. In main( ), create a group of A objects and a single B. Fill the B
 * with U references produced by the A objects. Use the B to call back into all the A objects. Remove some of
 * the U references from the B.
 */

interface U {
    void a();
    void b();
    void c();
}

class A {
    U makeU() {
        return new U() {
            @Override public void a() {System.out.println("A.a()");}
            @Override public void b() {System.out.println("A.b()");}
            @Override public void c() {System.out.println("A.c()");}
        };
    }
}

class B {
    private U[] array;
    public B(int size) { array = new U[size]; }

    public boolean insert(U element) {
        for(int i = 0; i < array.length; i++)
            if (array[i] == null) {
                array[i] = element;
                return true;
            }
        return false;
    }

    public boolean setToNull(int index) {
        if (index < 0 || index > array.length)
            return false;

        array[index] = null;
        return true;
    }

    public void callMethods() {
        for (int i = 0; i < array.length; i++)
            if (array[i] != null) {
                array[i].a();
                array[i].b();
                array[i].c();
            }
        System.out.println("All methods has been called.");
    }
}


public class Ex23_ThreeMethods {
    public static void main(String[] args) {
        A[] aa = {new A(), new A(), new A()};
        B b = new B(3);

        for (int i = 0; i < aa.length; i++)
            b.insert( aa[i].makeU() );

        b.callMethods();
        b.setToNull(0);
        b.setToNull(1);
        b.callMethods();
    }
}
