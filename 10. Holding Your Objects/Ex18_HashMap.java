/**
 * Fill a HashMap with key-value pairs. Print the results to show ordering by hash code. Extract the pairs,
 * sort by key, and place the result into a LinkedHashMap. Show that the insertion order is maintained.
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Ex18_HashMap {
    public static void main(String[] args) {

        Map<String, Integer> msi = new HashMap<>();
        msi.put("one", 1);
        msi.put("two", 2);
        msi.put("three",3);
        msi.put("four", 4);
        msi.put("five", 5);

        System.out.println(msi);

        String[] keysArray = msi.keySet().toArray(new String[0]);
        Arrays.sort(keysArray);

        Map<String, Integer> msil = new LinkedHashMap<>();

        for (String k : keysArray) {
            msil.put(k, msi.get(k) );
        }

        System.out.println(msil);
    }
}
