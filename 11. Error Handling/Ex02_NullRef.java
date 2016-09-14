/**
 * Define an object reference and initialize it to null. Try to call a method through this reference.
 * Now wrap the code in a try-catch clause to catch the exception.
 */

public class Ex02_NullRef {
    public static void main(String[] args) {
        String str = null;
        //str.isEmpty();
        try {
            str.isEmpty();
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
