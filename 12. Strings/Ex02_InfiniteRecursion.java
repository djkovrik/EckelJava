/**
 * Repair InfiniteRecursion.java.
 */

import java.util.*;

public class Ex02_InfiniteRecursion {
  public String toString() {
    return " Ex02_InfiniteRecursion address: " + super.toString() + "\n";
  }
  public static void main(String[] args) {
    List<Ex02_InfiniteRecursion> v =
      new ArrayList<>();
    for(int i = 0; i < 10; i++)
      v.add(new Ex02_InfiniteRecursion());
    System.out.println(v);
  }
}
