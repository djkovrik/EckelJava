/**
 * Modify ListFeatures.java so that it uses Strings instead of Pets, and explain any difference in results.
 */

//: holding/ListFeatures.java
import java.util.*;
import static net.mindview.util.Print.*;

public class Ex06_ListFeaturesStrings {
  public static void main(String[] args) {
    Random rand = new Random(47);
    List<String> words = new ArrayList<>(Arrays.asList("zero", "one", "two", "three"));
    print("1: " + words);
    String h = new String("four");
    words.add(h); // Automatically resizes
    print("2: " + words);
    print("3: " + words.contains(h));
    words.remove(h); // Remove by object
    String p = words.get(2);
    print("4: " +  p + " " + words.indexOf(p));
    String cymric = new String("five");
    print("5: " + words.indexOf(cymric));
    print("6: " + words.remove(cymric));
    // Must be the exact object:
    print("7: " + words.remove(p));
    print("8: " + words);
    words.add(3, new String("six")); // Insert at an index
    print("9: " + words);
    List<String> sub = words.subList(1, 3);
    print("subList: " + sub);
    print("10: " + words.containsAll(sub));
    Collections.sort(sub); // In-place sort
    print("sorted subList: " + sub);
    // Order is not important in containsAll():
    print("11: " + words.containsAll(sub));
    Collections.shuffle(sub, rand); // Mix it up
    print("shuffled subList: " + sub);
    print("12: " + words.containsAll(sub));
    List<String> copy = new ArrayList<>(words);
    sub = Arrays.asList(words.get(1), words.get(2));
    print("sub: " + sub);
    copy.retainAll(sub);
    print("13: " + copy);
    copy = new ArrayList<String>(words); // Get a fresh copy
    copy.remove(2); // Remove by index
    print("14: " + copy);
    copy.removeAll(sub); // Only removes exact objects
    print("15: " + copy);
    copy.set(1, new String("seven")); // Replace an element
    print("16: " + copy);
    copy.addAll(2, sub); // Insert a list in the middle
    print("17: " + copy);
    print("18: " + words.isEmpty());
    words.clear(); // Remove all elements
    print("19: " + words);
    print("20: " + words.isEmpty());
    words.addAll(Arrays.asList("eight", "nine", "ten"));
    print("21: " + words);
    Object[] o = words.toArray();
    print("22: " + o[1]);
    String[] pa = words.toArray(new String[0]);
    print("23: " + pa[1]);
  }
}