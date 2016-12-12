/**
 * Modify the class in the previous exercise so that it will work with HashSets and as a key in HashMaps.
 *
 * Previous exercise:
 * Create a class containing two String objects and make it Comparable so that the comparison only cares about
 * the first String. Fill an array and an ArrayList with objects of your class, using the RandomGenerator generator.
 * Demonstrate that sorting works properly. Now make a Comparator that only cares about the second String, and
 * demonstrate that sorting works properly. Also perform a binary search using your Comparator.
 */

import net.mindview.util.*;
import java.util.*;

class MyClass implements Comparable<MyClass> {
    String str1;
    String str2;

    public MyClass(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;
    }

    @Override
    public String toString() {
        return "[str1 = " + str1 + ", str2 = " + str2 + "]";
    }

    @Override
    public int compareTo(MyClass mc) {
        return str1.compareTo(mc.str1);
    }

    @Override
    public int hashCode() {
        return str1.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof MyClass &&
                ((MyClass)obj).str1.equals(str1);
    }

    private static RandomGenerator.String gen = new RandomGenerator.String();

    public static Generator<MyClass> generator() {
        return new Generator<MyClass>() {
            public MyClass next() {
                return new MyClass(gen.next(), gen.next());
            }
        };
    }
}

class CompareSecond implements Comparator<MyClass> {
    public int compare(MyClass s1, MyClass s2) {
        return s1.str2.compareTo(s2.str2);
    }
}

public class Ex41_ModifiedComparable {
    public static void main(String[] args) {
        HashSet<MyClass> hs = new HashSet<>();
        HashMap<MyClass,Integer> hm = new HashMap<>();
        Generator<MyClass> gen = MyClass.generator();
        hs.addAll(CollectionData.list(gen, 5));

        for(int i = 0; i < 5; i++)
            hm.put(gen.next(), i);
        
        System.out.println("hashset = " + hs);
        System.out.println("hashmap = " + hm);
    }
}
