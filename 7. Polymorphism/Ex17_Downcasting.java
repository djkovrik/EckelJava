/**
 * Using the Cycle hierarchy from Exercise 1, add a balance( ) method to Unicycle
 * and Bicycle, but not to Tricycle. Create instances of all three types and upcast
 * them to an array of Cycle. Try to call balance( ) on each element of the array
 * and observe the results. Downcast and call balance( ) and observe what happens.
 */

class Cycle {
    void move() { System.out.println("Cycle.ride()"); }
}

class Unicycle extends Cycle {
    void move() { System.out.println("Unicycle.ride()"); }
}

class Bicycle extends Cycle {
    void move() { System.out.println("Bicycle.ride()"); }
    void balance() { System.out.println("Bicycle.balance()"); }
}

class Tricycle extends Cycle {
    void move() { System.out.println("Tricycle.ride()"); }
    void balance() { System.out.println("Tricycle.balance()"); }
}

public class Ex17_Downcasting {

    public static void main(String[] args) {

        Cycle[] garage = {
            new Unicycle(),
            new Bicycle(),
            new Tricycle()
        };

        //!garage[0].balance();
        //!garage[1].balance();
        //!garage[2].balance();

        //!((Unicycle)garage[0]).balance();
        ((Bicycle)garage[1]).balance();
        ((Tricycle)garage[2]).balance();
    }
}
