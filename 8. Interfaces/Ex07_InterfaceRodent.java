/**
 * Create an inheritance hierarchy of Rodent: Mouse, Gerbil, Hamster, etc.
 * In the base class, provide methods that are common to all Rodents, and
 * override these in the derived classes to perform different behaviors
 * depending on the specific type of Rodent. Create an array of Rodent,
 * fill it with different specific types of Rodents, and call your base-class
 * methods to see what happens.
 */

interface Rodent {
    void move();
    void eat();
    void sleep();
}

class Mouse implements Rodent {
    @Override public void move() { System.out.println("Mouse moves"); }
    @Override public void eat() { System.out.println("Mouse eats"); }
    @Override public void sleep() { System.out.println("Mouse sleeps"); }
}

class Gerbil implements Rodent {
    @Override public void move() { System.out.println("Gerbil moves"); }
    @Override public void eat() { System.out.println("Gerbil eats"); }
    @Override public void sleep() { System.out.println("Gerbil sleeps"); }
}

class Hamster implements Rodent {
    @Override public void move() { System.out.println("Hamster moves"); }
    @Override public void eat() { System.out.println("Hamster eats"); }
    @Override public void sleep() { System.out.println("Hamster sleeps"); }
}

public class Ex07_InterfaceRodent {

    public static void main(String[] args) {

        Rodent[] animals = {
            new Mouse(),
            new Gerbil(),
            new Hamster()
        };

        for (Rodent r : animals) {
            r.move();
            r.eat();
            r.sleep();
        }
    }
}
