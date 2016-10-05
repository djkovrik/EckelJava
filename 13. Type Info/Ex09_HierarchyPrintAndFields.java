/**
 * Modify the previous exercise so that it uses Class.getDeclaredFields( ) to also display information about the fields in a class.
 *
 * Exercise 8:
 * Write a method that takes an object and recursively prints all the classes in that object’s hierarchy.
 */

import java.lang.reflect.Field;

class A {
    private int x;
}

class B extends A {
    private double y;
}

class C extends B {
    private char z;
}

class D extends C {
    private float f;
    private String s;
}

public class Ex09_HierarchyPrintAndFields {
    public static void printClass(Class c) {

        if (c == null)
            return;

        System.out.println("Class: " + c.getSimpleName());

        for (Field f : c.getDeclaredFields()) {
            System.out.println("  field: " + f);
        }

        printClass(c.getSuperclass());
    }

    public static void main(String[] args) {
        D d = new D();
        printClass(d.getClass());
    }
}
