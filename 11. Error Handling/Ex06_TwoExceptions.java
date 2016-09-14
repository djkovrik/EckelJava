/**
 * Create two exception classes, each of which performs its own logging automatically. Demonstrate that these work.
 */

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

class MyException1 extends Exception {
    private static Logger logger = Logger.getLogger("MyException1");
    public MyException1() {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}
class MyException2 extends Exception {
    private static Logger logger = Logger.getLogger("MyException2");
    public MyException2() {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}

public class Ex06_TwoExceptions {
    public static void main(String[] args) {
        try {
            throw new MyException1();
        } catch(MyException1 e) {
            System.err.println("Exception: " + e);
        }
        try {
            throw new MyException2();
        } catch(MyException2 e) {
            System.err.println("Exception: " + e);
        }
    }
}
