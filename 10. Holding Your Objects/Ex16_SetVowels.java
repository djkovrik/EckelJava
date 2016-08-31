/**
 * Create a Set of the vowels. Working from UniqueWords.Java, count and display the number of vowels in
 * each input word, and also display the total number of vowels in the input file.
 */

import net.mindview.util.TextFile;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static net.mindview.util.Print.print;


public class Ex16_SetVowels {
    public static void main(String[] args) {

        Set<Character> vowels = new HashSet<>(Arrays.asList('A', 'E', 'O', 'U', 'I', 'a', 'e', 'o', 'u', 'i'));
        HashSet<String> words = new HashSet<>();

        int vowelsCommon = 0;
        int vowelsWord;

        for(String singleWord : new TextFile("src\\Ex16_SetVowels.java", "\\W+")) {
            vowelsWord = 0;

            for(char letter : singleWord.toCharArray()) {
                if(vowels.contains(letter)) {
                    vowelsWord++;
                }
            }

            vowelsCommon += vowelsWord;

            if (!words.contains(singleWord)) {
                print("Word " + singleWord + " has " + vowelsWord + " vowels");
                words.add(singleWord);
            }
        }
        print("File contains " + vowelsCommon + " vowels.");
    }
}
