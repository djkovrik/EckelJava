/**
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

class Voice {
    public Voice() { System.out.println("Voice()"); }
}

class Squeak extends Voice {
    public Squeak() { System.out.println("Squeak()"); }
}

class Rodent {
    private Voice v = new Voice();
    public Rodent() { System.out.println("Rodent()"); }
    void move() { System.out.println("Rodent moves"); }
    void eat() { System.out.println("Rodent eats"); }
    void sleep() { System.out.println("Rodent sleeps"); }
}

class Mouse extends Rodent {
    private Squeak s = new Squeak();
    public Mouse() { System.out.println("Mouse()"); }
    @Override void move() { System.out.println("Mouse moves"); }
    @Override void eat() { System.out.println("Mouse eats"); }
    @Override void sleep() { System.out.println("Mouse sleeps"); }
}

class Gerbil extends Rodent {
    public Gerbil() { System.out.println("Gerbil()"); }
    @Override void move() { System.out.println("Gerbil moves"); }
    @Override void eat() { System.out.println("Gerbil eats"); }
    @Override void sleep() { System.out.println("Gerbil sleeps"); }
}

class Hamster extends Rodent {
    private Squeak s = new Squeak();
    public Hamster() { System.out.println("Hamster()"); }
    @Override void move() { System.out.println("Hamster moves"); }
    @Override void eat() { System.out.println("Hamster eats"); }
    @Override void sleep() { System.out.println("Hamster sleeps"); }
}

public class Ex12_RodentModified {

    public static void main(String[] args) {

        Rodent[] animals = {
            new Mouse(),
            new Gerbil(),
            new Hamster()
        };
    }
}
