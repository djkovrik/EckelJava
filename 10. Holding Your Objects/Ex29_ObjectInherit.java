/**
 * Create a simple class that inherits from Object and contains no members, and show that you cannot
 * successfully add multiple elements of that class to a PriorityQueue. This issue will be fully
 * explained in the Containers in Depth chapter.
 */

import java.util.PriorityQueue;

class Test extends Object {}

public class Ex29_ObjectInherit {
    public static void main(String[] args) {
        PriorityQueue<Test> pq = new PriorityQueue<>();

        pq.add( new Test() );
        pq.add( new Test() );
    }
}
