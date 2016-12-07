/**
 * Modify ArrayOfGenerics .Java to use containers instead of arrays. Show that you can eliminate the compile-time warnings.
 */

import java.util.*;


public class Ex10_ArrayOfGenerics {
  @SuppressWarnings("unchecked")
  public static void main(String[] args) {
    List<String>[] ls;
    List[] la = new List[10];
    ls = (List<String>[])la;
    ls[0] = new ArrayList<>();
    // Compile-time checking produces an error:
    //! ls[1] = new ArrayList<Integer>();

    ArrayList<List<String>> ls1 = new ArrayList<>();
    ls1.add(new ArrayList<>());
  }
}
