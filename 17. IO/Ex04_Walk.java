import net.mindview.util.Directory;

import java.io.File;

/**
 * Use Directory.walk( ) to sum the sizes of all files in a directory tree whose names match a particular regular expression.
 */

public class Ex04_Walk {
    public static void main(String[] args) {
        Directory.TreeInfo dti = Directory.walk("D:\\_My\\Yandex\\sources\\eckel_java\\17. IO");
        long total = 0;
        for (File file : dti) {
            total += file.length();
        }
        System.out.println("Files: " + dti.files.size() + ", size: " + total + " byte(s)");
    }
}
