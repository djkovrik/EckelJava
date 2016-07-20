/**
 * Add a proper hierarchy of dispose( ) methods to all the classes in Exercise 9.
 *
 * Exercise 9:
 * Create a class called Root that contains an instance of each of the classes
 * (that you also create) named Component1, Component2, and Component3. Derive
 * a class Stem from Root that also contains an instance of each “component.”
 * All classes should have default constructors that print a message about that class.
 */

class Component1 {
    public Component1() { System.out.println("Component1()"); }
    void dispose() { System.out.println("Component1 dispose"); }
}

class Component2 {
    public Component2() { System.out.println("Component2()"); }
    void dispose() { System.out.println("Component2 dispose"); }
}

class Component3 {
    public Component3() { System.out.println("Component3()"); }
    void dispose() { System.out.println("Component3 dispose"); }
}

class Root {
    Component1 c1 = new Component1();
    Component2 c2 = new Component2();
    Component3 c3 = new Component3();

    public Root() { System.out.println("Root()"); }

    void dispose() {
        System.out.println("Root dispose");
        c3.dispose();
        c2.dispose();
        c1.dispose();
    }
}

public class Ex12_Dispose extends Root {
    Component1 c1 = new Component1();
    Component2 c2 = new Component2();
    Component3 c3 = new Component3();

    public Ex12_Dispose() { System.out.println("Ex12_Dispose()"); }

    void dispose() {
        System.out.println("Ex12_Dispose dispose");
        c3.dispose();
        c2.dispose();
        c1.dispose();
        super.dispose();
    }

    public static void main(String[] args) {
        new Ex12_Dispose().dispose();
    }
}
