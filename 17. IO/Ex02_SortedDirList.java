/**
 * Create a class called SortedDirList with a constructor that takes a File object and builds a sorted directory
 * list from the files at that File. Add to this class two overloaded list( ) methods: the first produces the whole
 * list, and the second produces the subset of the list that matches its argument (which is a regular expression).
 */

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

public class Ex02_SortedDirList {
    private File path;

    public Ex02_SortedDirList() {
        this.path = new File("src\\"); // current dir
    }

    public Ex02_SortedDirList(File path) {
        this.path = path;
    }

    public String[] list() {
        String[] list = path.list();
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        return list;
    }

    public String[] list(String regex) {
        String[] list = path.list(new FilenameFilter() {
            Pattern pattern = Pattern.compile(regex);

            @Override
            public boolean accept(File dir, String name) {
                return pattern.matcher(name).matches();
            }
        });

        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        return list;
    }

    public static void main(String[] args) {
        Ex02_SortedDirList slist = new Ex02_SortedDirList();
        System.out.println(Arrays.asList(slist.list(".*\\.java")));
    }
}
