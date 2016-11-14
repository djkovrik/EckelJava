/**
 * Use composition instead of inheritance to adapt Fibonacci to make it Iterable.
 */

import java.util.Iterator;

public class FibonacciAndComposition implements Iterable<Integer> {
    private Fibonacci f = new Fibonacci();
    private int n;

    public FibonacciAndComposition(int n) {
        this.n = n;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return n > 0;
            }

            @Override
            public Integer next() {
                n--;
                return f.next();
            }
        };
    }

    public static void main(String[] args) {
        for (int i : new FibonacciAndComposition(15)) {
            System.out.print(i + " ");
        }
    }
}
