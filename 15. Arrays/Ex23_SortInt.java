/**
 * Create an array of Integer, fill it with random int values (using autoboxing), and sort it into reverse
 * order using a Comparator.
 */

import net.mindview.util.Generated;
import net.mindview.util.Generator;
import net.mindview.util.RandomGenerator;

import java.util.Arrays;
import java.util.Collections;


public class Ex23_SortInt {
    public static void main(String[] args) {

        Generator<Integer> gen = new RandomGenerator.Integer(100);

        Integer[] a = Generated.array(new Integer[10], gen);
        System.out.println("Unsorted array: " + Arrays.toString(a));

        Arrays.sort(a, Collections.reverseOrder());
        System.out.println("Sorted array: " + Arrays.toString(a));
    }
}
