/**
 * Create a generator class that produces character names (as String objects) from your favorite movie
 * (you can use Snow White or Star Wars as a fallback) each time you call next( ), and loops around to
 * the beginning of the character list when it runs out of names. Use this generator to fill an array,
 * an ArrayList, a LinkedList, a HashSet, a LinkedHashSet, and a TreeSet, then print each container.
 */

import java.util.*;
import static net.mindview.util.Print.print;

class NamesGenerator {
    String[] characters = {
        "Jon", "Sansa", "Arya", "Tyrion", "Jaime", "Bronn", "Brienne", "Ramsay"
    };
    int next;

    public String next() {
        if (next == characters.length) {
            next = 0;
        }
        return characters[next++];
    }
}

public class Ex04_Characters {
    private static NamesGenerator gen = new NamesGenerator();

    static Collection<String> fill(Collection<String> collection, int count) {
        for (int i = 0; i < count; i++) {
            collection.add(gen.next());
        }
        return collection;
    }

    static String[] fill(String[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = gen.next();
        }
        return array;
    }


    public static void main(String[] args) {
        int size = 10;

        print( Arrays.toString( fill(new String[size]) ) );
        print( fill(new ArrayList<>(), size) );
        print( fill(new LinkedList<>(), size) );
        print( fill(new HashSet<>(), size) );
        print( fill(new LinkedHashSet<>(), size) );
        print( fill(new TreeSet<>(), size) );
    }
}
