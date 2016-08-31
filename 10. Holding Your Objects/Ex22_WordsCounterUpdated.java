/**
 * Modify the previous exercise so that it uses a class containing a String and a count field to store each
 * different word, and a Set of these objects to maintain the list of words.
 *
 * Exercise 20:
 * Using a Map<String,Integer>, follow the form of UniqueWords.java to create a program that counts the
 * occurrence of words in a file. Sort the results using Collections.sort( ) with a second argument of
 * String.CASE_INSENSITIVE_ORDER (to produce an alphabetic sort), and display the result.
 */

import net.mindview.util.TextFile;

import java.util.*;

import static net.mindview.util.Print.print;

class WordsCounter {
    static Comparator<WordsCounter> CASE_INSENSITIVE_ORDER
            = (c1, c2) -> c1.getWord().compareToIgnoreCase(c2.getWord());

    private String word;
    private int count;

    WordsCounter(String word) {
        this.word = word;
        count = 1;
    }

    void increaseCount() { ++count; }
    String getWord() { return word; }
    int getCount() { return count; }

    public String toString() { return this.getWord() + " - " + this.getCount(); }
    public int hashCode() { return word.hashCode(); }

    public boolean equals(Object o) {
        return word.equals(((WordsCounter)o).word);
    }
}


public class Ex22_WordsCounterUpdated {

    static void updateStats(Iterator<WordsCounter> iter, WordsCounter wc) {
        while(iter.hasNext()) {
            WordsCounter w = iter.next();
            if(w.equals(wc)) {
                w.increaseCount();
            }
        }
    }

    public static void main(String[] args) {
        Set<WordsCounter> stats = new HashSet<>();

        for(String singleWord : new TextFile("src\\Ex22_WordsCounterUpdated.java", "\\W+")) {
            WordsCounter wc = new WordsCounter(singleWord);

            if (stats.contains(wc)) {
                updateStats(stats.iterator(), wc);
            } else {
                stats.add(wc);
            }
        }

        List<WordsCounter> lwc = new ArrayList<>(stats);
        Collections.sort(lwc, WordsCounter.CASE_INSENSITIVE_ORDER);
        print(lwc);
    }
}
