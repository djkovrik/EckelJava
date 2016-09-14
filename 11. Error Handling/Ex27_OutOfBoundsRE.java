/**
 * Modify Exercise 3 to convert the exception to a RuntimeException.
 *
 * Exercise 3:
 * Write code to generate and catch an ArraylndexOutOfBoundsException.
 */

public class Ex27_OutOfBoundsRE {
    public static void main(String[] args) {
        int[] array = new int[10];

        try {
            array[11] = 123;
        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
