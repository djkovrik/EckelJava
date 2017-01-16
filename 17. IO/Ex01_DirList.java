/**
 * Modify DirList.java (or one of its variants) so that the FilenameFilter opens and reads each file
 * (using the net.mindview.util.TextFile utility) and accepts the file based on whether any of the
 * trailing arguments on the command line exist in that file.
 */

import net.mindview.util.TextFile;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ex01_DirList {
  public static void main(final String[] args) {
    File path = new File("src\\");
    String[] list;
    if(args.length == 0)
      list = path.list();
    else
      list = path.list(new FilenameFilter() {
        @Override
        public boolean accept(File dir, String name) {
          Set<String> words = new HashSet<>(
                  new TextFile(new File(dir, name).getAbsolutePath(), "\\W+"));

          for(int i = 1; i < args.length; i++) {
            if (words.contains(args[i]))
              return true;
          }
          return false;
        }
      });

    Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
    for(String dirItem : list)
      System.out.println(dirItem);
  }
}

