/**
 * Modify DirList.java (or one of its variants) so that it sums up the file sizes of the selected files.
 */

import java.util.regex.*;
import java.io.*;
import java.util.*;

public class Ex03_DirListSizes {
  public static void main(final String[] args) {
    File path = new File("src\\");
    String[] list;
    if(args.length == 0)
      list = path.list();
    else
      list = path.list(new FilenameFilter() {
        private Pattern pattern = Pattern.compile(args[0]);
        public boolean accept(File dir, String name) {
          return pattern.matcher(name).matches();
        }
      });
    Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);

    long sz;

    for(String dirItem : list) {
      sz = new File(path, dirItem).length();
      System.out.println("File: " + dirItem + ", size: " + sz);
    }
  }
}
