/**
 * Apply the regular expression
    (?i)((^[aeiou])|(\s+[aeiou]))\w+?[aeiou]\b
 to
    "Arline ate eight apples and one orange while Anita hadn’t any"
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex11_RegEx {
    public static void main(String[] args) {
        String text = "Arline ate eight apples and one orange while Anita hadn’t any";
        String regEx = "(?i)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b";

        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(text);

        System.out.println("Text: " + text);
        System.out.println("Regular expression: " + regEx);

        while(m.find()) {
            System.out.println( "Match \"" + m.group() + "\" at positions " + m.start() + "-" + (m.end() - 1) );
        }
    }
}
