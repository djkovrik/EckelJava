/**
 * Modify Exercise 3 so that the catch clause logs the results.
 *
 * Exercise 3:
 * Write code to generate and catch an ArraylndexOutOfBoundsException.
 */

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class Ex07_OutOfBoundsLog {
    private static Logger logger = Logger.getLogger("Ex07_OutOfBoundsLog");
    static void logException(Exception e) {
        StringWriter trace = new StringWriter();
        e.printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }

    public static void main(String[] args) {
        int[] array = new int[10];

        try {
            array[11] = 123;
        } catch (Exception e){
            logException(e);
        }
    }
}
