/**
 * In polymorphism.Sandwich.java, create an interface called FastFood (with appropriate methods) and change
 * Sandwich so that it also implements FastFood.
 */

import static net.mindview.util.Print.*;

interface FastFood {
    void sandwichIsDone();
}

class Meal {
    Meal() { print("Meal()"); }
}

class Bread {
    Bread() { print("Bread()"); }
}

class Cheese {
    Cheese() { print("Cheese()"); }
}

class Lettuce {
    Lettuce() { print("Lettuce()"); }
}

class Lunch extends Meal {
    Lunch() { print("Lunch()"); }
}

class PortableLunch extends Lunch {
    PortableLunch() { print("PortableLunch()");}
}


public class Ex08_Sandwich extends PortableLunch implements FastFood {
    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lettuce l = new Lettuce();

    public Ex08_Sandwich() { print("Sandwich()"); }

    public void sandwichIsDone() { print("Your sandwich is ready!"); }

    public static void main(String[] args) {

        Ex08_Sandwich sandwich = new Ex08_Sandwich();
        sandwich.sandwichIsDone();

    }
}
