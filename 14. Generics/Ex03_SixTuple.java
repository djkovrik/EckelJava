/**
 * Create and test a SixTuple generic.
 */

import net.mindview.util.*;

public class Ex03_SixTuple<A, B, C, D, E, F> extends FiveTuple<A, B, C, D, E> {
    public final F sixth;

    public Ex03_SixTuple(A a, B b, C c, D d, E e, F f) {
        super(a, b, c, d, e);
        sixth = f;
    }

    @Override public String toString() {
        return "(" + first + ", " + second + ", " + third
                + ", " + fourth + ", " + fifth + ", " + sixth + ")";
    }

    public static void main(String[] args) {
        Ex03_SixTuple<Integer, String, Double, Boolean, Character, Integer> six =
                new Ex03_SixTuple<>(1, "two", 2.3, true, 'z', 5);

        System.out.println(six);
    }
}
