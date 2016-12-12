/**
 * Produce a Map and a Set containing all the countries that begin with ‘A’.
 */

import java.util.HashSet;
import java.util.List;
import static net.mindview.util.Countries.names;

public class Ex02_CountriesA {
    public static void main(String[] args) {
        List<String> namesA = names();
        HashSet<String> setA = new HashSet<>();

        for (String s : namesA) {
            if (s.startsWith("A")) {
                setA.add(s);
            }
        }

        System.out.println(setA);
    }
}
