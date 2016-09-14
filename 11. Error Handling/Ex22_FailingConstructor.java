/**
 * Create a class called FailingConstructor with a constructor that might fail partway through the construction
 * process and throw an exception. In main( ), write code that properly guards against this failure.
 */

class ConstructException extends Exception {}

class MightFall {
    public MightFall(int x) throws ConstructException {
        if (x % 2 == 0) {
            throw new ConstructException();
        }
    }
}

public class Ex22_FailingConstructor {
    public static void main(String[] args) {
        for (int i = 1; i < 10; ++i) {
            try {
                MightFall fc = new MightFall(i);
                try {
                    System.out.println("Do some things...");
                } finally {
                    System.out.println("Cleaning...");
                }

            } catch (ConstructException e) {
                System.out.println("Construction failed: " + e);
                System.out.println("Object was not created.");
                break;
            }
        }
    }
}
