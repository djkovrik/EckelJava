/**
 * Prove that class loading takes place only once. Prove that loading may be
 * caused by either the creation of the first instance of that class or by
 * the access of a static member.
 */

class Loader {

    static {
        System.out.println("Loading...");
    }

    static void f() {}
}

public class Ex23_Loading {

    public static void main(String[] args) {
        System.out.println("Static method calling...");
        Loader.f();
        System.out.println("Object creation...");
        new Loader();
    }
}
