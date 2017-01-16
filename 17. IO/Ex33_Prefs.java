/**
 * Write a program that displays the current value of a directory called "base directory" and prompts you for a new value.
 * Use the Preferences API to store the value.
 */

import java.util.Scanner;
import java.util.prefs.Preferences;

public class Ex33_Prefs {
    public static void main(String[] args) {
        Preferences prefs = Preferences.userNodeForPackage(Ex33_Prefs.class);
        String directory = prefs.get("base directory", "Not defined");

        System.out.println("Current directory: " + directory);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a new directory: ");
        directory = sc.nextLine();
        prefs.put("base directory", directory);
        System.out.println("New directory value: " + directory);
    }
}
