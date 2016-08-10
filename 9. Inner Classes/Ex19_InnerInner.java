/**
 * Create a class containing an inner class that itself contains an inner class. Repeat this using nested
 * classes. Note the names of the .class files produced by the compiler.
 */

class Outer1 {
    class Inner1 {
        void f1() {}
    }
}

class Outer2 {
    static class Inner2 {
        void f2() {}
    }
}

public class Ex19_InnerInner {
    public static void main(String[] args) {
        Outer1 o1 = new Outer1();
        Outer2 o2 = new Outer2();
    }
}
