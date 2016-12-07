/**
 * Create the classes necessary for the Peel<Banana> example and show that the compiler doesn’t accept it.
 * Fix the problem using an ArrayList.
 */

import java.util.ArrayList;

class Banana {
    private final int id;
    Banana(int id) { this.id = id; }
    @Override public String toString() {
        return "Banana{" + "id=" + id + '}';
    }
}

class Peel<T> {
    T fruit;
    Peel(T fruit) { this.fruit = fruit; }
    void peel() { System.out.println("Peel " + fruit); }
}

public class Ex09_PeelBanana {
    public static void main(String[] args) {
        //Peel<Banana>[] peels = new Peel<Banana> [10];
        ArrayList<Peel<Banana>> apb = new ArrayList<>();

        for (int i = 1; i <= 5; i++)
            apb.add(new Peel<>(new Banana(i)));

        for (Peel<Banana> p : apb)
            p.peel();
    }
}
