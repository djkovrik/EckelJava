/**
 * Fill a PriorityQueue (using offer( )) with Double values created using java.util.Random,
 * then remove the elements using poll( ) and display them.
 */

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class Ex28_Doubles {
    static Random rand = new Random(47);

    public static void printQ(Queue queue) {
        while(queue.peek() != null)
            System.out.print(queue.remove() + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        PriorityQueue<Double> dpq = new PriorityQueue<>();

        for (int i = 0; i < 10; ++i) {
            dpq.offer( rand.nextDouble() );
        }
        printQ(dpq);
    }
}
