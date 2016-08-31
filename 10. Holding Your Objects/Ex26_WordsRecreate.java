/**
 * Take the resulting Map from the previous exercise and re-create the order of the words as they appeared
 * in the original file.
 *
 * Create a Map<String,ArrayList<Integer>>. Use net.mindview.TextFile to open a text file and read it in a word
 * at a time (use "\\W+" as the second argument to the TextFile constructor). Count the words as you read them in,
 * and for each word in the file, record in the ArrayList<Integer> the word count associated with that word—this is,
 * in effect, the location in the file where that word was found.
 */

import net.mindview.util.TextFile;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Ex26_WordsRecreate {

    public static void main(String[] args) {

        Map<String, ArrayList<Integer>> stats = new HashMap<>();

        int counter = 0;

        for(String word : new TextFile("src\\Ex26_WordsRecreate.java", "\\W+")) {

            ArrayList<Integer> location = stats.get(word);

            if (location == null) {
                location = new ArrayList<>();
                stats.put(word, location);
            }
            location.add(++counter);
        }
        System.out.println(stats);

        // Recreating words order

        Map<Integer, String> wordsList = new TreeMap<>();

        for ( Map.Entry<String, ArrayList<Integer>> entry : stats.entrySet() ) {

            for(int index : entry.getValue()) {
                wordsList.put(index, entry.getKey());
            }
        }
        System.out.println(wordsList);
    }
}
