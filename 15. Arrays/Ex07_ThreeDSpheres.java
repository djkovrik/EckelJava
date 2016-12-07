/**
 * Write a method that takes two int arguments, indicating the two sizes of a 2-D array. The method should create
 * and fill a 2-D array of BerylliumSphere according to the size arguments.
 */

import java.util.Arrays;

class BerylliumSphere {
    private static long counter;
    private final long id = counter++;

    public String toString() {
        return "Sphere " + id;
    }
}

public class Ex07_ThreeDSpheres {
    static BerylliumSphere[][][] createArray(int x, int y, int z) {
        BerylliumSphere[][][] result = new BerylliumSphere[x][y][z];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < z; k++) {
                    result[i][j][k] = new BerylliumSphere();
                }
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(createArray(3, 2, 3)));
    }
}
