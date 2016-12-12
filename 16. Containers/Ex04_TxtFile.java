/**
 * Create a Collection initializer that opens a file and breaks it into words using TextFile, and then uses the
 * words as the source of data for the resulting Collection. Demonstrate that it works.
 */

import net.mindview.util.TextFile;
import java.util.Set;
import java.util.TreeSet;


public class Ex04_TxtFile {
    public static void main(String[] args) {
        Set<String> words = new TreeSet<String>(
                new TextFile("src\\Ex04_TxtFile.java", "\\W+"));
        System.out.println(words);
    }
}
