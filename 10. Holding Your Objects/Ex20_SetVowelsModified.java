/**
 * Modify Exercise 16 so that you keep a count of the occurrence of each vowel.
 *
 * Exercise 16:
 * Create a Set of the vowels. Working from UniqueWords.Java, count and display the number of vowels in
 * each input word, and also display the total number of vowels in the input file.
 */

import net.mindview.util.TextFile;

import java.util.*;

import static net.mindview.util.Print.print;


public class Ex20_SetVowelsModified {
    public static void main(String[] args) {

        Set<Character> vowels = new HashSet<>(Arrays.asList('A', 'E', 'O', 'U', 'I', 'a', 'e', 'o', 'u', 'i'));
        HashSet<String> words = new HashSet<>();

        Map<Character, Integer> occurrences = new HashMap<>();

        for (Character ch : vowels) {
            occurrences.put(ch, 0);
        }

        int vowelsCommon = 0;
        int vowelsWord;

        for(String singleWord : new TextFile("src\\Ex20_SetVowelsModified.java", "\\W+")) {
            vowelsWord = 0;

            for(char letter : singleWord.toCharArray()) {
                if(vowels.contains(letter)) {
                    vowelsWord++;
                    int count = occurrences.get(letter);
                    occurrences.put(letter, ++count);
                }
            }

            vowelsCommon += vowelsWord;

            if (!words.contains(singleWord)) {
                print("Word " + singleWord + " has " + vowelsWord + " vowels");
                words.add(singleWord);
            }
        }
        print("File contains " + vowelsCommon + " vowels.");

        print("Vowel occurrence: ");
        print(occurrences);
    }
}
