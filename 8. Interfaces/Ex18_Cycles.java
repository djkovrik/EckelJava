/**
 * Create a Cycle interface, with implementations Unicycle, Bicycle and Tricycle. Create factories for
 * each type of Cycle, and code that uses these factories.
 */

interface Cycle {
    int wheels();
    void ride();
}

class Unicycle implements Cycle {
    @Override public int wheels() { return 1; }
    @Override public void ride() { System.out.println("Unicycle.ride() on " + wheels() + " wheel(s)"); }
}

class Bicycle implements Cycle {
    @Override public int wheels() { return 2; }
    @Override public void ride() { System.out.println("Bicycle.ride() on " + wheels() + " wheel(s)"); }
}

class Tricycle implements Cycle {
    @Override public int wheels() { return 3; }
    @Override public void ride() { System.out.println("Tricycle.ride() on " + wheels() + " wheel(s)"); }
}

interface CycleFactory {
    Cycle getCycle();
}

class UnicycleFactory implements CycleFactory {
    @Override public Cycle getCycle() {return new Unicycle(); }
}

class BicycleFactory implements CycleFactory {
    @Override public Cycle getCycle() {return new Bicycle(); }
}

class TricycleFactory implements CycleFactory {
    @Override public Cycle getCycle() {return new Tricycle(); }
}


public class Ex18_Cycles {
    static void testRide(CycleFactory f) {
        Cycle c = f.getCycle();
        c.ride();
    }

    public static void main(String[] args) {
        testRide(new UnicycleFactory());
        testRide(new BicycleFactory());
        testRide(new TricycleFactory());
    }
}
