/**
 * Modify the hashCode( ) in CountedString.java by removing the combination with id, and demonstrate that CountedString
 * still works as a key. What is the problem with this approach?
 */

import java.util.*;
import static net.mindview.util.Print.*;

public class Ex27_ModifiedCountedString {
  private static List<String> created =
    new ArrayList<String>();
  private String s;
  private int id = 0;
  public Ex27_ModifiedCountedString(String str) {
    s = str;
    created.add(s);
    // id is the total number of instances
    // of this string in use by Ex27_ModifiedCountedString:
    for(String s2 : created)
      if(s2.equals(s))
        id++;
  }
  public String toString() {
    return "String: " + s + " id: " + id +
      " hashCode(): " + hashCode();
  }
  public int hashCode() {
    int result = 17;
    result = 37 * result + s.hashCode();
    //result = 37 * result + id;
    // With this we lose the hashing advantages because
    // now all objects have the same hash
    return result;
  }
  public boolean equals(Object o) {
    return o instanceof Ex27_ModifiedCountedString &&
      s.equals(((Ex27_ModifiedCountedString)o).s) &&
      id == ((Ex27_ModifiedCountedString)o).id;
  }
  public static void main(String[] args) {
    Map<Ex27_ModifiedCountedString,Integer> map =
      new HashMap<Ex27_ModifiedCountedString,Integer>();
    Ex27_ModifiedCountedString[] cs = new Ex27_ModifiedCountedString[5];
    for(int i = 0; i < cs.length; i++) {
      cs[i] = new Ex27_ModifiedCountedString("hi");
      map.put(cs[i], i);
    }
    print(map);
    for(Ex27_ModifiedCountedString cstring : cs) {
      print("Looking up " + cstring);
      print(map.get(cstring));
    }
  }
}
