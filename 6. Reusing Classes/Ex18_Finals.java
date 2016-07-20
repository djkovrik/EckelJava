/**
 * Create a class with a static final field and a final field and demonstrate
 * the difference between the two.
 */

class Counter {
    private static int counter;
    private int id = counter++;
    public String toString() { return "[" + id + "]"; }
}

class Counts {
    final Counter c1 = new Counter();
    static final Counter c2 = new Counter();

    public String toString() { return "Normal counter: " + c1 + ", static counter: " + c2; }
}

public class Ex18_Finals {

    public static void main(String[] args) {
        System.out.println(new Counts());
        System.out.println(new Counts());
        System.out.println(new Counts());
    }


}
