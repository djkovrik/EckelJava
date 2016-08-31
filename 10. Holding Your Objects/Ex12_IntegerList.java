/**
 * Create and populate a List<Integer>. Create a second List<Integer> of the same size as the first, and use
 * ListIterators to read elements from the first List and insert them into the second in reverse order.
 * (You may want to explore a number of different ways to solve this problem.)
 */

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Ex12_IntegerList {
    public static void main(String[] args) {

        List<Integer> list1 = new LinkedList<>( Arrays.asList( 1, 2, 3, 4, 5, 6, 7, 8, 9, 10) );
        System.out.print("List 1: ");
        System.out.println(list1);
        List<Integer> list2 = new LinkedList<>(list1);

        ListIterator<Integer> backIter = list1.listIterator( list1.size() );
        int currentIndex = 0;

        while (backIter.hasPrevious()) {
            list2.set(currentIndex++, backIter.previous());
        }

        System.out.print("List 2: ");
        System.out.println(list2);
    }
}
