/**
 * Write a method that takes an int argument and returns an array of that size, filled with BerylliumSphere objects.
 */

import java.util.Arrays;

class BerylliumSphere {
    private static long counter;
    private final long id = counter++;

    public String toString() {
        return "Sphere " + id;
    }
}

public class Ex02_SpheresArray {
    static BerylliumSphere[] createArray(int size) {
        BerylliumSphere[] result = new BerylliumSphere[size];

        for (int i = 0; i < size; i++) {
            result[i] = new BerylliumSphere();
        }

        return result;
    }

    public static void main(String[] args) {
        BerylliumSphere[] bsa = createArray(5);
        System.out.println(Arrays.toString(bsa));
    }
}
