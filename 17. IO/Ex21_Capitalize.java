/**
 * Write a program that takes standard input and capitalizes all characters, then puts the results on standard output.
 * Redirect the contents of a file into this program (the process of redirection will vary depending on your operating
 * system).
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex21_Capitalize {
    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        while((str = stdin.readLine()) != null && str.length()!= 0) {
            System.out.println(str.toUpperCase());
        }
    }
}
