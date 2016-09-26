/**
 * Using the documentation for java.util.regex.Pattern as a resource, write and test a regular expression that
 * checks a sentence to see that it begins with a capital letter and ends with a period.
 */

public class Ex07_Sentence {
    public static void main(String[] args) {
        String first = "This is a first sentence.";
        String second = "this is a second sentence";

        System.out.println(first.matches("\\p{javaUpperCase}.*\\."));
        System.out.println(second.matches("\\p{javaUpperCase}.*\\."));
    }
}
