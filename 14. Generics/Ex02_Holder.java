/**
 * Create a holder class that holds three objects of the same type, along with the methods to store and fetch
 * those objects and a constructor to initialize all three.
 */

class Holder<T> {
    private T a;
    private T b;
    private T c;

    public Holder(T a, T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(T a) { this.a = a; }
    public void setB(T b) { this.b = b; }
    public void setC(T c) { this.c = c; }

    public T getA() { return a; }
    public T getB() { return b; }
    public T getC() { return c; }

    public void printHolder() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("b = " + c);
    }
}

public class Ex02_Holder {
    public static void main(String[] args) {
        Holder<Integer> hi = new Holder<>(1, 2, 3);
        hi.printHolder();

        Holder<String> hs = new Holder<>("one", "two", "three");
        hs.printHolder();
    }
}
