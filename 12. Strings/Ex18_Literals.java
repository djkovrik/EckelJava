/**
 * Write a program that reads a Java source-code file (you provide the file name on the command line)
 * and displays all the string literals in the code.
 */

import net.mindview.util.TextFile;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex18_Literals {
    public static void main(String[] args) {
        if(args.length < 1) {
            System.out.println("Usage: java filename");
            System.exit(0);
        }

        String literal = "Some string literal here";
        String separated = " And another " +
                           "\"literal\" here!";

        String filename = args[0];
        String regex = "\"(?:\\\\\"|[^\"])*?\"";
        // Comment with a "string literal"
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher("");
        int index = 0;

        for (String line : new TextFile(filename)) {
            m.reset(line);
            while(m.find()) {
                System.out.println(index++ + ": " + m.group());
            }
        }

    }
}
