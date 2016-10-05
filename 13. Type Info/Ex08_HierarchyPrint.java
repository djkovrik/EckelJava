/**
 * Write a method that takes an object and recursively prints all the classes in that object’s hierarchy.
 */

class A {}
class B extends A {}
class C extends B {}
class D extends C {}

public class Ex08_HierarchyPrint {
    public static void printClass(Class c) {

        if (c == null)
            return;

        System.out.println("Class: " + c.getSimpleName());
        printClass(c.getSuperclass());
    }

    public static void main(String[] args) {
        D d = new D();
        printClass(d.getClass());
    }
}
