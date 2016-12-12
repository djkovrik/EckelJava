/**
 * Look up the HashMap class in the JDK documentation. Create a HashMap, fill it with elements, and determine the
 * load factor. Test the lookup speed with this map, then attempt to increase the speed by making a new HashMap with
 * a larger initial capacity and copying the old map into the new one, then run your lookup speed test again on the new map.
 */

import net.mindview.util.Countries;

import java.util.HashMap;
import java.util.Map;

public class Ex38_LookupTests {
    public static void testMap(Map<String,String> map) {
        for(int tries = 0; tries < 1000000; tries++) {
            for(int i = 0; i < Countries.DATA.length; i++) {
                String key = Countries.DATA[i][0];
                map.get(key);
            }
        }
    }

    public static void main(String[] args) {
        HashMap<String, String> map1 = new HashMap<>(25);
        map1.putAll(Countries.capitals(20));

        HashMap<String, String> map2 = new HashMap<>(100);
        map2.putAll(map1);

        //Tests:
        long t1 = System.currentTimeMillis();
        testMap(map1);
        long t2 = System.currentTimeMillis();
        System.out.println("map1: " + (t2 - t1));
        t1 = System.currentTimeMillis();
        testMap(map2);
        t2 = System.currentTimeMillis();
        System.out.println("map2: " + (t2 - t1));
    }
}
