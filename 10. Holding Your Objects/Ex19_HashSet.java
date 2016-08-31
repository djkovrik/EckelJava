/**
 * Repeat the previous exercise with a HashSet and LinkedHashSet.
 *
 * Fill a HashMap with key-value pairs. Print the results to show ordering by hash code. Extract the pairs,
 * sort by key, and place the result into a LinkedHashMap. Show that the insertion order is maintained.
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Ex19_HashSet {
    public static void main(String[] args) {

        Set<String> msi = new HashSet<>();
        msi.add("one");
        msi.add("two");
        msi.add("three");
        msi.add("four");
        msi.add("five");

        System.out.println(msi);

        String[] keysArray = msi.toArray(new String[0]);
        Arrays.sort(keysArray);

        Set<String> msil = new LinkedHashSet<>();

        for (String k : keysArray) {
            msil.add(k);
        }

        System.out.println(msil);
    }
}
