/**
 * Create an interface, and inherit two new interfaces from that interface. Multiply inherit a third
 * interface from the second two.
 */

interface Top {
    void f();
}

interface Left extends Top {
    void f();
}

interface Right extends Top {
    void f();
}

interface Bottom extends Left, Right {
    void f();
}

class AllInOne implements Bottom {
    public void f() { System.out.println("AllInOne.f()"); }
}

public class Ex13_Diamond {

    public static void main(String[] args) {
        AllInOne a = new AllInOne();
        a.f();
    }
}
