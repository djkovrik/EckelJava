/**
 * Create a simple class. Inside a second class, define a reference to an
 * object of the first class. Use lazy initialization to instantiate this
 * object.
 */

class Simple {
    String s;

    public Simple(String str) {
        s = str;
        System.out.println(">>> Simple(" + s + ") has been created.");
    }

    public String toString() { return s; }
}

class Second {
    Simple simple;
    String s;

    public Second(String str) {
        s = str;
        System.out.println("Second(" + s + ") has been created.");
    }

    public String toString() {

        if (simple == null)
            simple = new Simple(s);

        return simple.toString();
    }

}

public class Ex01_LazyInit {

    public static void main(String[] args) {

        System.out.println("From main: creating Second()...");
        Second s = new Second("My text");
        System.out.println("From main: Second() created. Trying to print...");
        System.out.println("From main: text value: " + s);
    }

}
