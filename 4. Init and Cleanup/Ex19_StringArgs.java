/**
* Write a method that takes a vararg String array. Verify that you can 
* pass either a comma-separated list of Strings or a String[] into this method.
*/

import java.util.*;

public class Ex19_StringArgs {
	
	static void printArgs(String... args) {
		for (String s : args)
			System.out.print(s + " ");
		
		System.out.println();
	}	
	
	public static void main(String[] args) {
		
		printArgs("one", "two", "three");
		printArgs(new String[] {"four", "five"} );
	}
}