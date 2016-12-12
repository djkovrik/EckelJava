/**
 * Add a char field to CountedString that is also initialized in the constructor, and modify the hashCode( ) and
 * equals( ) methods to include the value of this char.
 */

import java.util.*;
import static net.mindview.util.Print.*;

public class Ex26_CountedString {
  private static List<String> created =
    new ArrayList<String>();
  private String s;
  private char ch;
  private int id = 0;
  public Ex26_CountedString(String str, char ch) {
    s = str;
    this.ch = ch;
    created.add(s);

    for(String s2 : created)
      if(s2.equals(s))
        id++;
  }
  public String toString() {
    return "String: " + s + " id: " + id + " char: " + ch +
      " hashCode(): " + hashCode();
  }
  public int hashCode() {
    int result = 17;
    result = 37 * result + s.hashCode();
    result = 37 * result + id;
    result = 37 * result + (int) ch;
    return result;
  }
  public boolean equals(Object o) {
    return o instanceof Ex26_CountedString &&
      s.equals(((Ex26_CountedString)o).s) &&
      id == ((Ex26_CountedString)o).id &&
      ch == ((Ex26_CountedString)o).ch;
  }

  public static void main(String[] args) {
    Map<Ex26_CountedString,Integer> map =
      new HashMap<Ex26_CountedString,Integer>();
    Ex26_CountedString[] cs = new Ex26_CountedString[5];
    for(int i = 0; i < cs.length; i++) {
      cs[i] = new Ex26_CountedString("hi", 'y');
      map.put(cs[i], i);
    }
    print(map);
    for(Ex26_CountedString cstring : cs) {
      print("Looking up " + cstring);
      print(map.get(cstring));
    }
  }
}