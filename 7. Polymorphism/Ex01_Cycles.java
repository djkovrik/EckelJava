/**
 * Create a Cycle class, with subclasses Unicycle, Bicycle and Tricycle.
 * Demonstrate that an instance of each type can be upcast to Cycle via
 * a ride( ) method.
 */

class Cycle {
    void move() { System.out.println("Cycle.ride()"); }
}

class Unicycle extends Cycle {
    void move() { System.out.println("Unicycle.ride()"); }
}

class Bicycle extends Cycle {
    void move() { System.out.println("Bicycle.ride()"); }
}

class Tricycle extends Cycle {
    void move() { System.out.println("Tricycle.ride()"); }
}

public class Ex01_Cycles {

    public static void ride(Cycle c) {
        c.move();
    }

    public static void main(String[] args) {
        Unicycle u = new Unicycle();
        Bicycle b = new Bicycle();
        Tricycle t = new Tricycle();

        ride(u);
        ride(b);
        ride(t);
    }
}
