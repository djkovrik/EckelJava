/**
 * Create an empty LinkedList<Integer>. Using a Listlterator, add Integers to the List by always
 * inserting them in the middle of the List.
 */

import java.util.LinkedList;
import java.util.ListIterator;

public class Ex14_EmptyList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i <= 10; i++) {
            int index = list.size() / 2;
            ListIterator<Integer> iter = list.listIterator(index);
            iter.add(i);
        }

        System.out.println(list);
    }
}
