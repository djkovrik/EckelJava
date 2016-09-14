/**
 * Add a class with a dispose( ) method to the previous exercise. Modify FailingConstructor so that the
 * constructor creates one of these disposable objects as a member object, after which the constructor
 * might throw an exception, after which it creates a second disposable member object. Write code to
 * properly guard against failure, and in main( ) verify that all possible failure situations are covered.
 *
 * Create a class called FailingConstructor with a constructor that might fail partway through the construction
 * process and throw an exception. In main( ), write code that properly guards against this failure.
 */

class ConstructException extends Exception {}

class Disposer {
    void dispose() {
        System.out.println("dispose()");
    }
}

class MightFall {
    private Disposer d1, d2;

    public MightFall(int x) throws ConstructException {
        d1 = new Disposer();

        try {
            if (x % 2 == 0) {
                throw new ConstructException();
            }
        } catch (ConstructException e) {
            d1.dispose();
            throw e;
        }

        d2 = new Disposer();
    }

    void dispose() {
        d2.dispose();
        d1.dispose();
    }
}

public class Ex24_FailingCtorWithDispose {
    public static void main(String[] args) {
        for (int i = 1; i < 10; ++i) {
            try {
                MightFall fc = new MightFall(i);
                try {
                    System.out.println("Do some things...");
                } finally {
                    System.out.println("Cleaning...");
                    fc.dispose();
                }

            } catch (ConstructException e) {
                System.out.println("Construction failed: " + e);
                System.out.println("Object was not created.");
                break;
            }
        }
    }
}
