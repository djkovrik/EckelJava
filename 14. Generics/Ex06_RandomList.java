/**
 * Use RandomList with two more types in addition to the one shown in main( ).
 */

import java.util.*;

public class Ex06_RandomList<T> {
  private ArrayList<T> storage = new ArrayList<T>();
  private Random rand = new Random(47);
  public void add(T item) { storage.add(item); }
  public T select() {
    return storage.get(rand.nextInt(storage.size()));
  }
  public static void main(String[] args) {
    Ex06_RandomList<String> rs = new Ex06_RandomList<>();
    for(String s: ("The quick brown fox jumped over " +
        "the lazy brown dog").split(" "))
      rs.add(s);
    for(int i = 0; i < 11; i++)
      System.out.print(rs.select() + " ");
    System.out.println();

    // Integers
    Ex06_RandomList<Integer> ri = new Ex06_RandomList<>();
    Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7).forEach(ri::add);

    for(int i = 0; i < 11; i++)
      System.out.print(ri.select() + " ");
    System.out.println();

    //Chars
    Ex06_RandomList<Character> rc = new Ex06_RandomList<>();
    Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g').forEach(rc::add);
    for(int i = 0; i < 11; i++)
      System.out.print(rc.select() + " ");
  }
}