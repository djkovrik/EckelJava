/**
 * Create a List (try both ArrayList and LinkedList) and fill it using Countries. Sort the list and print it,
 * then apply Collections.shuffle( ) to the list repeatedly, printing it each time so that you can see how the
 * shuffle( ) method randomizes the list differently each time.
 */

import java.util.*;

import static net.mindview.util.Countries.*;

public class Ex01_Countries {
    static final Random rnd = new Random(47);

    public static void main(String[] args) {
        List<String> lst = new ArrayList<>(names(10));
        //List<String> lst = new LinkedList<>(names(10));
        Collections.sort(lst);
        System.out.println("Sorted list: " + lst);

        for (int i = 1; i <= 5; i++) {
            Collections.shuffle(lst);
            System.out.println(String.format("Shuffled #%d: ", i) + lst);
        }
    }
}
