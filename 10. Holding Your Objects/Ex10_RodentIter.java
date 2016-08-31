/**
 * Change Exercise 9 in the Polymorphism chapter to use an ArrayList to hold the Rodents and an Iterator to
 * move through the sequence of Rodents.
 *
 * Exercise 9:
 * Create an inheritance hierarchy of Rodent: Mouse, Gerbil, Hamster, etc.
 * In the base class, provide methods that are common to all Rodents, and
 * override these in the derived classes to perform different behaviors
 * depending on the specific type of Rodent. Create an array of Rodent,
 * fill it with different specific types of Rodents, and call your base-class
 * methods to see what happens.
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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

public class Ex10_RodentIter {

    public static void main(String[] args) {
        List<Rodent> list = new ArrayList<>();

        list.add(new Mouse());
        list.add(new Gerbil());
        list.add(new Hamster());

        Iterator<Rodent> iter = list.iterator();

        while (iter.hasNext()) {
            Rodent r = iter.next();
            r.move();
            r.eat();
            r.sleep();
        }
    }
}
