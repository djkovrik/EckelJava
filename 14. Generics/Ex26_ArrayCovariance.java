/**
 * Demonstrate array covariance using Numbers and Integers.
 */

public class Ex26_ArrayCovariance {

    public static void main(String[] args) {

        Number[] numbers = new Integer[10];
        numbers[0] = 123;

        try {
            numbers[1] = 1.23;
        } catch(Exception e) { System.out.println(e); }

        try {
            numbers[2] = 3.21f;
        } catch(Exception e) { System.out.println(e); }
    }
}
