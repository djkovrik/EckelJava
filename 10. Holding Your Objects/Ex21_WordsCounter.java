/**
 * Using a Map<String,Integer>, follow the form of UniqueWords.java to create a program that counts the
 * occurrence of words in a file. Sort the results using Collections.sort( ) with a second argument of
 * String.CASE_INSENSITIVE_ORDER (to produce an alphabetic sort), and display the result.
 */

import net.mindview.util.TextFile;

import java.util.*;

import static net.mindview.util.Print.print;

public class Ex21_WordsCounter {
    public static void main(String[] args) {
        Map<String, Integer> msi = new HashMap<>();

        for(String singleWord : new TextFile("src\\Ex21_WordsCounter.java", "\\W+")) {
            Integer count = msi.get(singleWord);
            msi.put(singleWord, count == null ? 1 : count + 1);
        }

        List<String> keys = new ArrayList<>( msi.keySet() );
        Collections.sort(keys, String.CASE_INSENSITIVE_ORDER );

        for(String key : keys) {
            print(key + " = " + msi.get(key));
        }

        print(msi);
    }
}
