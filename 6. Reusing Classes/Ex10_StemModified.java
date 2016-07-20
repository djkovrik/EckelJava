/**
 * Modify the previous exercise so that each class only has non-default constructors.
 *
 * Previous exercise:
 * Create a class called Root that contains an instance of each of the classes
 * (that you also create) named Component1, Component2, and Component3. Derive
 * a class Stem from Root that also contains an instance of each “component.”
 * All classes should have default constructors that print a message about that class.
 */

class Component1 {
    public Component1(int x) { System.out.println("Component1(" + x +")"); }
}

class Component2 {
    public Component2(int x) { System.out.println("Component2(" + x +")"); }
}

class Component3 {
    public Component3(int x) { System.out.println("Component3(" + x +")"); }
}

class Root {
    Component1 c1 = new Component1(123);
    Component2 c2 = new Component2(456);
    Component3 c3 = new Component3(789);

    public Root(int x) {
        System.out.println("Root(" + x + ")");
    }
}

public class Ex10_StemModified extends Root {
    Component1 c1 = new Component1(987);
    Component2 c2 = new Component2(654);
    Component3 c3 = new Component3(321);

    public Ex10_StemModified(int y) {
        super(y);
        System.out.println("Ex10_StemModified(" + y + ")");
    }

    public static void main(String[] args) {
        new Ex10_StemModified(1234);
    }
}
