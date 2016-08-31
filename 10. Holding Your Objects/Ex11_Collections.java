/**
 * Write a method that uses an Iterator to step through a Collection and print the toString( ) of each object in
 * the container. Fill all the different types of Collections with objects and apply your method to each container.
 */

import java.util.*;

class TestClass
        implements Comparable<TestClass> { // for TreeSet filling
    private static int counter = 0;
    private int id = ++counter;
    public String toString() { return "TestClass#" + id; }

    @Override public int compareTo(TestClass t) {
        if (this.id < t.id)
            return -1;
        if(this.id > t.id)
            return 1;
        return 0;
    }
}

public class Ex11_Collections {
    public static void printToStrings(Collection<TestClass> collection) {
        Iterator<TestClass> it = collection.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        TestClass[] array = new TestClass[] {
            new TestClass(), new TestClass(), new TestClass(), new TestClass()
        };

        Collection<TestClass> cal = new ArrayList<>( Arrays.asList(array) );
        Collection<TestClass> cll = new LinkedList<>( Arrays.asList(array) );
        Collection<TestClass> chs = new HashSet<>( Arrays.asList(array) );
        Collection<TestClass> cts = new TreeSet<>( Arrays.asList(array) );

        printToStrings(cal);
        printToStrings(cll);
        printToStrings(chs);
        printToStrings(cts);
    }
}
