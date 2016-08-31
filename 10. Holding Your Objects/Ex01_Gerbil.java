/**
 * Create a new class called Gerbil with an int gerbilNumber that’s initialized in the constructor. Give it a
 * method called hop( ) that displays which gerbil number this is, and that it’s hopping. Create an ArrayList
 * and add Gerbil objects to the List. Now use the get( ) method to move through the List and call hop( )
 * for each Gerbil.
 */

import java.util.ArrayList;

class Gerbil {
    private int gerbilNumber;
    Gerbil(int gn) { gerbilNumber = gn; }
    void hop() { System.out.printf("Gerbil #%d is hopping.%n", gerbilNumber); }
}

public class Ex01_Gerbil {
    public static void main(String[] args) {
        ArrayList<Gerbil> list = new ArrayList<>();

        list.add(new Gerbil(1));
        list.add(new Gerbil(2));
        list.add(new Gerbil(3));

        for (Gerbil g : list)
            g.hop();
    }
}
