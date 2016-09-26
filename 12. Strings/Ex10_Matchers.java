/**
 * For the phrase "Java now has regular expressions" evaluate whether the following expressions will find a match:
     ^Java
     \Breg.*
     n.w\s+h(a|i)s
     s?
     s*
     s+
     s{4}
     S{1}.
     s{0,3}
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex10_Matchers {
    public static void main(String[] args) {
        String text = "Java now has regular expressions";
        String[] regExes = {"^Java", "\\Breg.*", "n.w\\s+h(a|i)s", "s?", "s*", "s+", "s{4}", "S{1}.", "s{0,3}"};

        System.out.println("Phrase: " + text);

        for (String regEx : regExes) {
            System.out.println("Regular expression: " + regEx);
            Pattern p = Pattern.compile(regEx);
            Matcher m = p.matcher(text);

            while(m.find()) {
                System.out.println( "Match \"" + m.group() + "\" at positions " +
                        m.start() + "-" + (m.end() - 1) );
            }
        }
    }
}
