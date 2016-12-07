/**
 * Demonstrate that multidimensional arrays of nonprimitive types are automatically initialized to null.
 */

import java.util.Arrays;

public class Ex05_Nulls {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(new Object[2][3]));
    }
}
