/**
 * Modify control/Ex05_VowelsAndConsonants.java so that it uses three enum types: VOWEL, SOMETIMES_A_VOWEL, and CONSONANT.
 * The enum constructor should take the various letters that describe that particular category. Hint: Use varargs,
 * and remember that varargs automatically creates an array for you.
 */

import java.util.*;

import static net.mindview.util.Print.*;

enum CharacterCategory {
    VOWEL('a', 'e', 'i', 'o', 'u') {
        public String toString() {
            return "vowel";
        }
    },
    SOMETIMES_A_VOWEL('y', 'w') {
        public String toString() {
            return "sometimes a vowel";
        }
    },
    CONSONANT {
        public String toString() {
            return "consonant";
        }
    };
    private HashSet<Character> chars = new HashSet<>();

    private CharacterCategory(Character... chars) {
        if (chars != null)
            this.chars.addAll(Arrays.asList(chars));
    }

    public static CharacterCategory getCategory(Character c) {
        if (VOWEL.chars.contains(c))
            return VOWEL;
        if (SOMETIMES_A_VOWEL.chars.contains(c))
            return SOMETIMES_A_VOWEL;
        return CONSONANT;
    }
}

public class Ex05_VowelsAndConsonants {
    public static void main(String[] args) {
        Random rand = new Random(47);
        for (int i = 0; i < 20; i++) {
            int c = rand.nextInt(26) + 'a';
            printnb((char) c + ", " + c + ": ");
            print(CharacterCategory.getCategory((char) c).toString());
        }
    }
}