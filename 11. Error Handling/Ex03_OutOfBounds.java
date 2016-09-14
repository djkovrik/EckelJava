/**
 * Write code to generate and catch an ArraylndexOutOfBoundsException.
 */

public class Ex03_OutOfBounds {
    public static void main(String[] args) {
        int[] array = new int[10];

        try {
            array[11] = 123;
        } catch (Exception e){
            System.out.println("Exception: " + e);
        }
    }
}
