/**
 * Create an initialized array of double using CountingGenerator. Print the results.
 */

import net.mindview.util.CountingGenerator;
import net.mindview.util.Generated;

import java.util.Arrays;

public class Ex12_DoubleGen {
    public static void main(String[] args) {

        Double[] d = Generated.array(Double.class, new CountingGenerator.Double(), 10);

        double[] result = new double[d.length];

        for(int i = 0; i < d.length; i++)
            result[i] = d[i];

        System.out.println(Arrays.toString(result));
    }
}
