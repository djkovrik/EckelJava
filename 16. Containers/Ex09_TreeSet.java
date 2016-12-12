/**
 * Use RandomGenerator.String to fill a TreeSet, but use alphabetic ordering. Print the TreeSet to verify the sort order.
 */

import net.mindview.util.CollectionData;
import net.mindview.util.RandomGenerator;

import java.util.TreeSet;

public class Ex09_TreeSet {
    public static void main(String[] args) {
        TreeSet<String> tss = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        tss.addAll(CollectionData.list(new RandomGenerator.String(), 10));

        System.out.println(tss);
    }
}
