/**
* Write a method that takes two String arguments and uses all the 
* boolean comparisons to compare the two Strings and print the results. 
* For the == and !=, also perform the equals( ) test. In main( ), call 
* your method with some different String objects.
*/

import java.util.*;

public class Ex14_Comparison {
	static void print(String s, boolean b) {
		System.out.println(s + ": " + b);
	}
	
	static void compare(String first, String second) {
		System.out.println("first: " + first + " second: " + second);
		//! p("first < second: " + first < second);
		//! p("first > second: " + first > second);
		//! p("first <= second: " + first <= second);
		//! p("first >= second: " + first >= second);
		print("first == second", first == second);
		print("first != second", first != second);
		print("first.equals(second)", first.equals(second));
	}
	
	public static void main(String[] args) {
		compare("One", "One");
		compare("One", "Two");
		
		String str = new String ("Two");
		compare(str, "Two");
	}
}