/**
 * Write a program that reads a Java source-code file (you provide the file name on the command line)
 * and displays all the comments.
 */

import net.mindview.util.TextFile;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex17_FileComments {
    //Some random comment here
    public static void main(String[] args) {
        if(args.length < 1) {
            System.out.println("Usage: java filename");
            System.exit(0);
        }

        String filename = args[0]; //// Source file name
        String regex = "(/\\*+.*\\*+/)|(/+.*)|(/?\\*.*)";

        Pattern p = Pattern.compile(regex); /* This is Pattern comment **/
        Matcher m = p.matcher(""); /** And this is Matcher comment */
        int index = 0;

        /* Parse the file */
        // Iterate through the lines
        for (String line : new TextFile(filename)) {
            m.reset(line);
            while(m.find()) {
                System.out.println(index++ + ": " + m.group());
            }
        }

    }
}
