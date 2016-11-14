/**
 * Create two interfaces and a class that implements both. Create two generic methods, one whose argument
 * parameter is bounded by the first interface and one whose argument parameter is bounded by the second
 * interface. Create an instance of the class that implements both interfaces, and show that it can be used
 * with both generic methods.
 */

interface Iface1 {
    void a();
}

interface Iface2 {
    void b();
}

class Impl implements Iface1, Iface2 {
    @Override public void a() { System.out.println("Impl.a()"); }
    @Override public void b() { System.out.println("Impl.b()"); }
}

public class Ex25_TwoInterfaces {
    static <T extends Iface1> void foo1(T obj) {
        obj.a();
    }

    static <T extends Iface2> void foo2(T obj) {
        obj.b();
    }

    public static void main(String[] args) {
        Impl im = new Impl();

        foo1(im);
        foo2(im);
    }
}
