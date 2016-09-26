/**
 * Modify JGrep.java to accept flags as arguments (e.g., Pattern.CASE_INSENSITIVE, Pattern.MULTILINE).
 */

// Cmd line params: src\Ex15_JGrepFlags.java "\b[s]\w+" CASE_INSENSITIVE

import net.mindview.util.TextFile;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex15_JGrepFlags {
    public static void main(String[] args) {

        if (args.length < 3) {
            System.out.println("Usage: java Ex15_JGrepFlags file regex flags");
            System.out.println("Possible flags: ");
            System.out.println("CANON_EQ, CASE_INSENSITIVE, COMMENTS, DOTALL, LITERAL" +
                               "MULTILINE, UNICODE_CASE, UNICODE_CHARACTER_CLASS, UNIX_LINES");
            System.exit(0);
        }

        int flag = 0;

        if(args[2].equalsIgnoreCase("CANON_EQ")) {
            flag = Pattern.CANON_EQ;
        } else
        if(args[2].equalsIgnoreCase("CASE_INSENSITIVE")) {
            flag = Pattern.CASE_INSENSITIVE;
        } else if(args[2].equalsIgnoreCase("COMMENTS")) {
            flag = Pattern.COMMENTS;
        } else if(args[2].equalsIgnoreCase("DOTALL")) {
            flag = Pattern.DOTALL;
        } else if(args[2].equalsIgnoreCase("LITERAL")) {
            flag = Pattern.LITERAL;
        } else if(args[2].equalsIgnoreCase("MULTILINE")) {
            flag = Pattern.MULTILINE;
        } else if(args[2].equalsIgnoreCase("UNICODE_CASE")) {
            flag = Pattern.UNICODE_CASE;
        } else if(args[2].equalsIgnoreCase("UNICODE_CHARACTER_CLASS")) {
            flag = Pattern.UNICODE_CHARACTER_CLASS;
        } else if(args[2].equalsIgnoreCase("UNIX_LINES")) {
            flag = Pattern.UNIX_LINES;
        }

        int index = 0;
        Pattern p = Pattern.compile(args[1], flag);
        Matcher m = p.matcher("");

        for (String line : new TextFile(args[0])) {
            m.reset(line);
            while(m.find()) {
                System.out.println(index++ + ": " + m.group() + ": " + m.start());
            }
        }
    }
}
