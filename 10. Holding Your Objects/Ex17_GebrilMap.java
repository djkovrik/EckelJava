/**
 * Take the Gerbil class in Exercise 1 and put it into a Map instead, associating each Gerbil’s name
 * (e.g. "Fuzzy" or "Spot") as a String (the key) for each Gerbil (the value) you put in the table.
 * Get an Iterator for the keySet( ) and use it to move through the Map, looking up the Gerbil for
 * each key and printing out the key and telling the Gerbil to hop( ).
 */

import java.util.HashMap;
import java.util.Map;

import static net.mindview.util.Print.print;

class Gerbil {
    private int gerbilNumber;
    Gerbil(int gn) { gerbilNumber = gn; }
    void hop() { System.out.printf("Gerbil #%d is hopping.%n", gerbilNumber); }
}

public class Ex17_GebrilMap {
    public static void main(String[] args) {
        Map<String, Gerbil> gm = new HashMap<>();

        gm.put("Fuzzy", new Gerbil(1));
        gm.put("Spot", new Gerbil(2));
        gm.put("Fluffy", new Gerbil(3));

        for (String key : gm.keySet()) {
            print(key);
            gm.get(key).hop();
        }
    }
}
