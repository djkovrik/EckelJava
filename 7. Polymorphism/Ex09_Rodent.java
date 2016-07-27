/**
 * Create an inheritance hierarchy of Rodent: Mouse, Gerbil, Hamster, etc.
 * In the base class, provide methods that are common to all Rodents, and
 * override these in the derived classes to perform different behaviors
 * depending on the specific type of Rodent. Create an array of Rodent,
 * fill it with different specific types of Rodents, and call your base-class
 * methods to see what happens.
 */

class Rodent {
    void move() { System.out.println("Rodent moves"); }
    void eat() { System.out.println("Rodent eats"); }
    void sleep() { System.out.println("Rodent sleeps"); }
}

class Mouse extends Rodent {
    @Override void move() { System.out.println("Mouse moves"); }
    @Override void eat() { System.out.println("Mouse eats"); }
    @Override void sleep() { System.out.println("Mouse sleeps"); }
}

class Gerbil extends Rodent {
    @Override void move() { System.out.println("Gerbil moves"); }
    @Override void eat() { System.out.println("Gerbil eats"); }
    @Override void sleep() { System.out.println("Gerbil sleeps"); }
}

class Hamster extends Rodent {
    @Override void move() { System.out.println("Hamster moves"); }
    @Override void eat() { System.out.println("Hamster eats"); }
    @Override void sleep() { System.out.println("Hamster sleeps"); }
}

public class Ex09_Rodent {

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
