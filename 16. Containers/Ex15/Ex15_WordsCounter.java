/**
 * Repeat Exercise 13 using a SlowMap.
 */

import net.mindview.util.TextFile;
import java.util.List;

public class Ex15_WordsCounter {
    public static void main(String[] args) {

        List<String> words = new TextFile("src\\Ex15_WordsCounter.java", "\\W+");

        SlowMap<String,Integer> smsi = new SlowMap<>();

        for(String word : words) {
            Integer frequency = smsi.get(word);
            smsi.put(word, frequency == null ? 1 : frequency + 1);
        }

        System.out.println(smsi);
    }
}
