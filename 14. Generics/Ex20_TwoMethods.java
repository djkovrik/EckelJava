/**
 * Create an interface with two methods, and a class that implements that interface and adds another method.
 * In another class, create a generic method with an argument type that is bounded by the interface, and show
 * that the methods in the interface are callable inside this generic method. In main( ), pass an instance of
 * the implementing class to the generic method.
 */

interface MyInterface {
    void a();
    void b();
}

class Impl implements MyInterface {
    @Override public void a() { System.out.println("MyInterface.a()");}
    @Override public void b() { System.out.println("MyInterface.b()");}
    public void c() { System.out.println("Impl.c()");}
}


public class Ex20_TwoMethods {
    static <T extends MyInterface> void foo(T obj) {
        obj.a();
        obj.b();
        //obj.c();
    }

    public static void main(String[] args) {
        foo(new Impl());
    }
}
