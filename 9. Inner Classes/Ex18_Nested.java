/**
 * Create a class containing a nested class. In main( ), create an instance of the nested class.
 */

public class Ex18_Nested {

    static class Nested {
        private int x;
        Nested(int x) {
            this.x = x;
            System.out.println("Nested(" + x + ")");
        }
    }

    public static void main(String[] args) {
        Nested n = new Nested(123);
    }
}
