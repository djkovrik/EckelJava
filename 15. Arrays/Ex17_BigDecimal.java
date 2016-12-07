/**
 * Create and test a Generator for BigDecimal, and ensure that it works with the Generated methods.
 */

import net.mindview.util.Generated;
import net.mindview.util.Generator;
import java.math.BigDecimal;
import java.util.Arrays;

class BigDecimalGenerator implements Generator<BigDecimal> {
    private BigDecimal step;
    private BigDecimal value = new BigDecimal(0);

    public BigDecimalGenerator(BigDecimal step) {
        this.step = step;
    }

    public BigDecimal next() {
        BigDecimal old = value;
        value = value.add(step);
        return old;
    }
}

public class Ex17_BigDecimal {
    public static void main(String[] args) {
        BigDecimal[] bda = {new BigDecimal(4), new BigDecimal(5), new BigDecimal(6)};
        System.out.println(Arrays.toString(bda));

        bda = Generated.array(bda, new BigDecimalGenerator(new BigDecimal("0.33")));
        System.out.println(Arrays.toString(bda));
    }
}
