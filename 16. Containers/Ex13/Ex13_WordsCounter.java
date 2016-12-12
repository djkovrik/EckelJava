/**
 * Use AssociativeArray.java to create a word-occurrence counter, mapping String to Integer.
 * Using the net.mindview.util.TextFile utility in this book, open a text file and break up the
 * words in that file using whitespace and punctuation, and count the occurrence of the words in that file.
 */

import net.mindview.util.TextFile;

import java.util.List;

public class Ex13_WordsCounter {
    public static void main(String[] args) {
        List<String> words = new TextFile("src\\Ex13_WordsCounter.java", "\\W+");

        AssociativeArray<String, Integer> aasi = new AssociativeArray<>(words.size());

        for (String word : words) {
            Integer frequency = aasi.get(word);
            aasi.put(word, frequency == null ? 1 : frequency + 1);
        }

        System.out.println(aasi);
    }
}
