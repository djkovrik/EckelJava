/**
 * Repeat Exercise 13 using a SimpleHashMap.
 */

import net.mindview.util.TextFile;
import java.util.List;

public class Ex19_WordsCounter {
    public static void main(String[] args) {
        List<String> words = new TextFile("src\\Ex19_WordsCounter.java", "\\W+");

        SimpleHashMap<String,Integer> shms = new SimpleHashMap<>();

        for(String word : words) {
            Integer frequency = shms.get(word);
            shms.put(word, frequency == null ? 1 : frequency + 1);
        }

        System.out.println(shms);
    }
}
