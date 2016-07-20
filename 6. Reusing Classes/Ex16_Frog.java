/**
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

public class Ex16_Frog extends Amphibian {

    public static void main(String[] args) {
        Ex16_Frog f = new Ex16_Frog();
        Amphibian.doAllActivities(f); // upcasting

        Amphibian a = new Ex16_Frog(); // upasting
        a.sleep();
    }
}
