/**
 * Using TextFile and a Map<Character,Integer>, create a program that counts the occurrence of all the different
 * characters in a file. (So if there are 12 occurrences of the letter ‘a’ in the file, the Integer associated
 * with the Character containing ‘a’ in the Map contains ‘12’).
 */

import net.mindview.util.TextFile;

import java.util.*;

public class Ex17_CharCounter {
    private static final String source = "src\\Ex17_CharCounter.java";

    public static void main(String[] args) {
        Map<Character, Integer> mci = new HashMap<>();

        for (String word : new TextFile(source, "\\W+")) {
            for (int i = 0; i < word.length(); i++) {
                Character ch = word.charAt(i);
                Integer freq = mci.get(ch);
                mci.put(ch, freq == null ? 1 : freq + 1);
            }
        }

        List<Character> keys = Arrays.asList(mci.keySet().toArray(new Character[0]));
        Collections.sort(keys);

        for (Character key : keys) {
            System.out.println(key + " - " + mci.get(key));
        }
    }
}

