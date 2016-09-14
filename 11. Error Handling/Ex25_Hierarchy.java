/**
 * Create a three-level hierarchy of exceptions. Now create a base-class A with a method that throws an
 * exception at the base of your hierarchy. Inherit B from A and override the method so it throws an
 * exception at level two of your hierarchy. Repeat by inheriting class C from B. In main( ), create a
 * C and upcast it to A, then call the method.
 */

class First extends Exception {}
class Second extends First {}
class Third extends Second {}

class A {
    public void f() throws First { throw new First(); }
}

class B extends A {
    @Override public void f() throws Second { throw new Second(); }
}

class C extends B {
    @Override public void f() throws Third { throw new Third(); }
}

public class Ex25_Hierarchy {
    public static void main(String[] args) {
        A a = new C();

        try {
            a.f();
        } catch (First f) {
            System.out.println("Exception: " + f);
        }
    }
}
