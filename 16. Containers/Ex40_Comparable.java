/**
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

public class Ex40_Comparable {
    public static void main(String[] args) {
        MyClass[] array = new MyClass[5];
        Generated.array(array, MyClass.generator());
        System.out.println("Initial array: " + Arrays.asList(array));
        Arrays.sort(array);
        System.out.println("Sorted by 1st string: " + Arrays.asList(array));
        Arrays.sort(array, new CompareSecond());
        System.out.println("Sorted by 2nd string: " + Arrays.asList(array));

        ArrayList<MyClass> list = new ArrayList<>(CollectionData.list(MyClass.generator(), 5));
        Comparator<MyClass> comparator = new CompareSecond();
        MyClass element = list.get(0);
        System.out.println("\nList, before sorting: " + list);
        System.out.println("[0] element: " + element);
        Collections.sort(list, comparator);
        System.out.println("List, after sorting: "+ list);
        int index = Collections.binarySearch(list, element, comparator);
        System.out.println("ex [0] element now has index " + index);
    }
}
