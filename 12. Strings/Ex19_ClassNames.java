/**
 * Building on the previous two exercises, write a program that examines Java source code and produces all
 * the class names used in a particular program.
 */

import net.mindview.util.TextFile;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class MyException extends Exception{}

interface SomeInterface {}
class Impl implements SomeInterface {}

public class Ex19_ClassNames {
    private static final String Identifier = "\\b([A-Za-z_][A-Za-z0-9_]*)";
    public static void main(String[] args) {
        if(args.length < 1) {
            System.out.println("Usage: java filename");
            System.exit(0);
        }

        String filename = args[0];
        String regex = "(class\\s+|new\\s++)" + Identifier + "(\\s+(extends|implements|\\{))?";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher("");
        int index = 0;

        for (String line : new TextFile(filename)) {
            m.reset(line);
            while(m.find()) {
                System.out.println(index++ + ": " + m.group(2));
            }
        }
    }
}
