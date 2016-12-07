/**
 * Create and fill an array of BerylliumSphere. Copy this array to a new array and show that it’s a shallow copy.
 */

import java.lang.reflect.*;
import java.util.Arrays;

class BerylliumSphere {
    private static long counter;
    private final long id = counter++;

    public String toString() {
        return "Sphere " + id;
    }
}

public class Ex18_SphereCopy {
    static void setID(BerylliumSphere bs, long value) {
        try {
            Field fld = BerylliumSphere.class.getDeclaredField("id");
            fld.setAccessible(true);
            fld.setLong(bs, value);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        BerylliumSphere[] bsa = new BerylliumSphere[5];
        BerylliumSphere[] bsb = new BerylliumSphere[5];

        Arrays.fill(bsa, new BerylliumSphere());

        System.arraycopy(bsa, 0, bsb, 0, bsb.length);

        System.out.println("a = " + Arrays.toString(bsa));
        System.out.println("b = " + Arrays.toString(bsb));

        setID(bsa[0], 10L);

        System.out.println("a = " + Arrays.toString(bsa));
        System.out.println("b = " + Arrays.toString(bsb));
    }
}
