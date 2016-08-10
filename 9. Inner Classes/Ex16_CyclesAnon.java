/**
 * Modify the solution to Exercise 18 from the Interfaces chapter to use anonymous inner classes.
 *
 * Exercise 18:
 * Create a Cycle interface, with implementations Unicycle, Bicycle and Tricycle. Create factories for
 * each type of Cycle, and code that uses these factories.
 */

interface Cycle {
    int wheels();
    void ride();
}

interface CycleFactory {
    Cycle getCycle();
}

class Unicycle implements Cycle {
    @Override public int wheels() { return 1; }
    @Override public void ride() { System.out.println("Unicycle.ride() on " + wheels() + " wheel(s)"); }

    public static CycleFactory factory =
            new CycleFactory() {
                public Cycle getCycle() {return new Unicycle(); }
            };
}

class Bicycle implements Cycle {
    @Override public int wheels() { return 2; }
    @Override public void ride() { System.out.println("Bicycle.ride() on " + wheels() + " wheel(s)"); }

    public static CycleFactory factory =
            new CycleFactory() {
                public Cycle getCycle() {return new Bicycle(); }
            };
}

class Tricycle implements Cycle {
    @Override public int wheels() { return 3; }
    @Override public void ride() { System.out.println("Tricycle.ride() on " + wheels() + " wheel(s)"); }

    public static CycleFactory factory =
            new CycleFactory() {
                public Cycle getCycle() {return new Tricycle(); }
            };
}

public class Ex16_CyclesAnon {
    static void testRide(CycleFactory f) {
        Cycle c = f.getCycle();
        c.ride();
    }

    public static void main(String[] args) {
        testRide(Unicycle.factory);
        testRide(Bicycle.factory);
        testRide(Tricycle.factory);
    }
}
