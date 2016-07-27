/**
 * Starting from Exercise 1, add a wheels( ) method in Cycle, which returns the
 * number of wheels. Modify ride( ) to call wheels( ) and verify that polymorphism works.
 */

class Cycle {
    void move() { System.out.print("Cycle.ride()"); }
    int wheels() { return -1; }
}

class Unicycle extends Cycle {
    void move() { System.out.print("Unicycle.ride()"); }
    int wheels() { return 1; }
}

class Bicycle extends Cycle {
    void move() { System.out.print("Bicycle.ride()"); }
    int wheels() { return 2; }
}

class Tricycle extends Cycle {
    void move() { System.out.print("Tricycle.ride()"); }
    int wheels() { return 3; }
}

public class Ex05_Wheels {

    public static void ride(Cycle c) {
        c.move();
        System.out.println(" on " + c.wheels() + " wheel(s).");
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
