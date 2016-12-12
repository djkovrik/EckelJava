/**
 * Create both an ArrayList and a LinkedList, and fill each using the Countries.names( ) generator. Print each
 * list using an ordinary Iterator, then insert one list into the other by using a Listlterator, inserting at
 * every other location. Now perform the insertion starting at the end of the first list and moving backward.
 */

import net.mindview.util.Countries;

import java.util.*;

public class Ex07_Lists {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>(Countries.names(10));
        LinkedList<String> ll = new LinkedList<>(Countries.names(10));

        System.out.println("ArrayList: ");
        for(Iterator<String> iter = al.iterator(); iter.hasNext();) {
            System.out.print(iter.next() + " ");
        }

        System.out.println("\nLinkedListt: ");
        for(Iterator<String> iter = ll.iterator(); iter.hasNext();) {
            System.out.print(iter.next() + " ");
        }

        int index = 0;
        for(ListIterator<String> iter2 = ll.listIterator(); iter2.hasNext();) {
            al.add(index, iter2.next());
            index += 2;
        }

        System.out.println("\nModified ArrayList: ");
        for(Iterator<String> iter = al.iterator(); iter.hasNext();) {
            System.out.print(iter.next() + " ");
        }

        index = 0;
        for(ListIterator<String> iter2 = ll.listIterator(ll.size()); iter2.hasPrevious();) {
            al.add(index, iter2.previous());
            index += 2;
        }

        System.out.println("\nModified ArrayList #2: ");
        for(Iterator<String> iter = al.iterator(); iter.hasNext();) {
            System.out.print(iter.next() + " ");
        }
    }
}
