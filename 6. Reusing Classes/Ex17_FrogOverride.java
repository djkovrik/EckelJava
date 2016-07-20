/**
 * Modify Exercise 16 so that Frog overrides the method definitions from the base
 * class (provides new definitions using the same method signatures).
 * Note what happens in main( ).
 *
 * Exercise 16:
 * Create a class called Amphibian. From this, inherit a class called Frog. Put
 * appropriate methods in the base class. In main( ), create a Frog and upcast
 * it to Amphibian and demonstrate that all the methods still work.
 */

class Amphibian {
    void move() { System.out.println("Amphibian.move()"); }
    void eat() { System.out.println("Amphibian.eat()"); }
    void sleep() { System.out.println("Amphibian.sleep()"); }

    static void doAllActivities(Amphibian a) {
        a.move();
        a.eat();
        a.sleep();
    }
}

public class Ex17_FrogOverride extends Amphibian {

    @Override void move() { System.out.println("Frog.move()"); }
    @Override void eat() { System.out.println("Frog.move()"); }
    @Override void sleep() { System.out.println("Frog.move()"); }

    public static void main(String[] args) {
        Ex17_FrogOverride f = new Ex17_FrogOverride();
        Amphibian.doAllActivities(f); // upcasting
    }
}
