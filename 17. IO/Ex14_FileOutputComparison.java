/**
 * Starting with BasicFileOutput.java, write a program that compares the performance of writing to a file when
 * using buffered and unbuffered I/O.
 */

import net.mindview.util.TextFile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class Ex14_FileOutputComparison {
    static String file = "src\\Ex14_FileOutputComparison.out";

    public static void main(String[] args) throws IOException {
        List<String> list = new TextFile("src\\Ex14_FileOutputComparison.java", "\\W+");
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file)));

        long time1 = System.currentTimeMillis();

        for (String s : list) {
            for (int i = 0; i < 100000; i++) {
                out.println(s);
            }
        }
        long time2 = System.currentTimeMillis();
        out.close();
        System.out.println("Buffered writing: " + (time2 - time1));

        out = new PrintWriter(new FileWriter(file));
        time1 = System.currentTimeMillis();

        for (String s : list) {
            for (int i = 0; i < 100000; i++) {
                out.println(s);
            }
        }
        time2 = System.currentTimeMillis();
        out.close();
        System.out.println("Unbuffered writing: " + (time2 - time1));
    }
}
