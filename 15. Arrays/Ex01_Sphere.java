/**
 * Create a method that takes an array of BerylliumSphere as an argument. Call the method, creating the argument
 * dynamically. Demonstrate that ordinary aggregate array initialization doesn’t work in this case. Discover the
 * only situations where ordinary aggregate array initialization works, and where dynamic aggregate initialization
 * is redundant.
 */

class BerylliumSphere {
    private static long counter;
    private final long id = counter++;

    public String toString() {
        return "Sphere " + id;
    }
}

public class Ex01_Sphere {
    static void f(BerylliumSphere[] arg) {
        System.out.println("f() called, array length: " + arg.length);
    }

    public static void main(String[] args) {
        f(new BerylliumSphere[]{new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere()});

        //!Aggregate array initialization - does not work
        //f({new BerylliumSphere(), new BerylliumSphere()});

        // Aggregate array initialization - works
        BerylliumSphere[] bsa = {new BerylliumSphere(), new BerylliumSphere()};
        f(bsa);

        // Dynamic aggregate initialization is redundant
        BerylliumSphere[] b = new BerylliumSphere[]{new BerylliumSphere(), new BerylliumSphere()};
        f(b);
    }
}
