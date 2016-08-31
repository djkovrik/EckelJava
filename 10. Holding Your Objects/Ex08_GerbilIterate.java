/**
 * Modify Exercise l so it uses an Iterator to move through the List while calling hop( ).
 *
 * Exercise 1:
 * Create a new class called Gerbil with an int gerbilNumber that’s initialized in the constructor. Give it a
 * method called hop( ) that displays which gerbil number this is, and that it’s hopping. Create an ArrayList
 * and add Gerbil objects to the List. Now use the get( ) method to move through the List and call hop( )
 * for each Gerbil.
 */

import java.util.ArrayList;
import java.util.Iterator;

class Gerbil {
    private int gerbilNumber;
    Gerbil(int gn) { gerbilNumber = gn; }
    void hop() { System.out.printf("Gerbil #%d is hopping.%n", gerbilNumber); }
}

public class Ex08_GerbilIterate {
    public static void main(String[] args) {
        ArrayList<Gerbil> list = new ArrayList<>();

        list.add(new Gerbil(1));
        list.add(new Gerbil(2));
        list.add(new Gerbil(3));

        //for (Gerbil g : list)
        //    g.hop();
        Iterator<Gerbil> iter = list.iterator();
        while(iter.hasNext()) {
            Gerbil g = iter.next();
            g.hop();
        }
    }
}
