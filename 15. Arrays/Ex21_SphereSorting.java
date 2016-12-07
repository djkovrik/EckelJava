/**
 * Try to sort an array of the objects in Exercise 18. Implement Comparable to fix the problem. Now create a
 * Comparator to sort the objects into reverse order.
 */

import java.util.Arrays;
import java.util.Comparator;

class BerylliumSphere implements Comparable<BerylliumSphere> {
    static long counter;
    final long id = counter++;

    public String toString() {
        return "Sphere " + id;
    }

    @Override
    public int compareTo(BerylliumSphere right) {
        return (id < right.id ? -1 : (id == right.id ? 0 : 1));
    }
}

class SphereTypeComparator implements Comparator<BerylliumSphere> {
    public int compare(BerylliumSphere o1, BerylliumSphere o2) {
        return (o1.id > o2.id ? -1 : (o1.id == o2.id ? 0 : 1));
    }
}

public class Ex21_SphereSorting {
    public static void main(String[] args) {

        BerylliumSphere[] bsa = {new BerylliumSphere(), new BerylliumSphere(),
                                 new BerylliumSphere(), new BerylliumSphere()};

        System.out.println(Arrays.toString(bsa));
        Arrays.sort(bsa);
        System.out.println(Arrays.toString(bsa));
        Arrays.sort(bsa, new SphereTypeComparator());
        System.out.println(Arrays.toString(bsa));
    }
}
