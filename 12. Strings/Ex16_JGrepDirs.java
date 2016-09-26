/**
 * Modify JGrep.java to accept flags as arguments (e.g., Pattern.CASE_INSENSITIVE, Pattern.MULTILINE).
 */

// Cmd line params: src "\b[as]\w+"

import net.mindview.util.TextFile;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex16_JGrepDirs {
    static void checkFile(String filename, String regex) {

        System.out.println("File: " + filename);
        int index = 0;
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher("");

        for (String line : new TextFile(filename)) {
            m.reset(line);
            while(m.find()) {
                System.out.println(index++ + ": " + m.group() + ": " + m.start());
            }
        }
    }

    public static void main(String[] args) {

        if (args.length < 2) {
            System.out.println("Usage: java Ex16_JGrepDirs source regex");
            System.out.println("Source might be file or dir");
            System.exit(0);
        }

        String source = args[0];
        String regex = args[1];

        if (source.endsWith(".java")) {
            checkFile(source, regex);
        } else {
            File[] files = new File(source).listFiles();
            for (File file : files) {
                checkFile(file.getAbsolutePath(), regex);
            }
        }
    }
}
