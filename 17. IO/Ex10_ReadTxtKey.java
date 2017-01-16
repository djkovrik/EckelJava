/**
 * Modify Exercise to take additional command-line arguments of words to find in the file. Print all lines in which
 * any of the words match.
 *
 * Modify Exercise to force all the lines in the LinkedList to uppercase and send the results to System.out.
 *
 * Open a text file so that you can read the file one line at a time. Read each line as a String and place that
 * String object into a LinkedList. Print all of the lines in the LinkedList in reverse order.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Ex10_ReadTxtKey {
    public static List<String> makeList(String filename) throws IOException {
        BufferedReader in = new BufferedReader( new FileReader(filename));

        List<String> result = new LinkedList<>();

        String str;
        StringBuilder sb = new StringBuilder();

        while((str = in.readLine())!= null) {
            result.add(str);
        }

        in.close();
        return result;
    }

    public static void main(String[] args) throws IOException {
        List<String> list = makeList("src\\Ex10_ReadTxtKey.java");

        if (args.length == 0)
            return;

        String key = args[0];

        for (ListIterator<String> iter = list.listIterator(list.size()); iter.hasPrevious();) {
            String str = iter.previous();
            if (str.contains(key)) {
                System.out.println(str);
            }
        }
    }
}
