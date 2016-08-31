/**
 * Fill a LinkedHashMap with String keys and objects of your choice. Now extract the pairs, sort them
 * based on the keys, and reinsert them into the Map.
 */

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Ex24_ReInsert {

    public static void main(String[] args) {

        Map<String, String> mss = new LinkedHashMap<>();

        mss.put("one", "FIRST");
        mss.put("two", "SECOND");
        mss.put("three", "THIRD");
        mss.put("four", "FOURTH");
        mss.put("five", "FIFTH");

        System.out.println(mss);

        String[] keys = mss.keySet().toArray(new String[0]);
        Arrays.sort(keys);

        Map<String,String> mss2 = new LinkedHashMap<>();

        for(String key : keys) {
            mss2.put(key, mss.get(key));
        }

        System.out.println(mss2);
    }
}
