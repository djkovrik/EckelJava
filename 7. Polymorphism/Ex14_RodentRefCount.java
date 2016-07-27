/**
 * Modify Exercise 12 so that one of the member objects is a shared object with
 * reference counting, and demonstrate that it works properly.
 *
 * Exercise 12:
 * Modify Exercise 9 so that it demonstrates the order of initialization of
 * the base classes and derived classes. Now add member objects to both the
 * base and derived classes and show the order in which their initialization
 * occurs during construction.
 *
 * Exercise 9:
 * Create an inheritance hierarchy of Rodent: Mouse, Gerbil, Hamster, etc.
 * In the base class, provide methods that are common to all Rodents, and
 * override these in the derived classes to perform different behaviors
 * depending on the specific type of Rodent. Create an array of Rodent,
 * fill it with different specific types of Rodents, and call your base-class
 * methods to see what happens.
 */

class Shared {
    private int refCount;

    public Shared() { System.out.println("Shared()"); }
    public void addRef() { System.out.println("References: " + ++refCount ); }
    public String toString() { return "Shared"; }

    protected void dispose() {
        if(--refCount == 0)
            System.out.println("Disposing: " + this);
    }
}

class Voice {
    public Voice() { System.out.println("Voice()"); }
}

class Squeak extends Voice {
    public Squeak() { System.out.println("Squeak()"); }
}

class Rodent {
    private Voice v = new Voice();
    private Shared s;

    public Rodent(Shared sh) {
        System.out.println("Rodent()");
        s = sh;
        s.addRef();
    }

    void move() { System.out.println("Rodent moves"); }
    void eat() { System.out.println("Rodent eats"); }
    void sleep() { System.out.println("Rodent sleeps"); }

    protected void dispose() {
        System.out.println("Disposing: " + this);
        s.dispose();
    }

    public String toString() { return "Rodent"; }
}

class Mouse extends Rodent {
    private Squeak s = new Squeak();

    public Mouse(Shared s) {
        super(s);
        System.out.println("Mouse()");
    }

    @Override void move() { System.out.println("Mouse moves"); }
    @Override void eat() { System.out.println("Mouse eats"); }
    @Override void sleep() { System.out.println("Mouse sleeps"); }
    public String toString() { return "Mouse"; }
}

class Gerbil extends Rodent {
    public Gerbil(Shared s) {
        super(s);
        System.out.println("Gerbil()");
    }

    @Override void move() { System.out.println("Gerbil moves"); }
    @Override void eat() { System.out.println("Gerbil eats"); }
    @Override void sleep() { System.out.println("Gerbil sleeps"); }
    public String toString() { return "Gerbil"; }
}

class Hamster extends Rodent {
    private Squeak s = new Squeak();

    public Hamster(Shared s) {
        super(s);
        System.out.println("Hamster()");
    }

    @Override void move() { System.out.println("Hamster moves"); }
    @Override void eat() { System.out.println("Hamster eats"); }
    @Override void sleep() { System.out.println("Hamster sleeps"); }
    public String toString() { return "Hamster"; }
}

public class Ex14_RodentRefCount {

    public static void main(String[] args) {

        Shared sm = new Shared();

        Rodent[] animals = {
            new Mouse(sm),
            new Gerbil(sm),
            new Hamster(sm)
        };

        for (Rodent r : animals)
            r.dispose();
    }
}
