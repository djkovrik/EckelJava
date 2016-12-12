/**
 * Using Countries, fill a Set multiple times with the same data and verify that the Set ends up with only one of
 * each instance. Try this with HashSet, LinkedHashSet, and TreeSet.
 */

import java.util.*;
import static net.mindview.util.Countries.names;

public class Ex03_SetsTest {
    public static void main(String[] args) {
        Set<String> testSet = new HashSet<>();
        //Set<String> testSet = new LinkedHashSet<>();
        //Set<String> testSet = new TreeSet<>();

        for (int i = 0; i < 3; i++) {
            testSet.addAll(names(10));
        }

        System.out.println(testSet);
    }
}
