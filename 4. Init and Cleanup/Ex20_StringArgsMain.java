/**
* Write a method that takes a vararg String array. Verify that you can 
* pass either a comma-separated list of Strings or a String[] into this method.
*/

import java.util.*;

public class Ex20_StringArgsMain {
	
	static void printArgs(String... args) {
		for (String s : args)
			System.out.print(s + " ");
		
		System.out.println();
	}	
	
	public static void main(String[] args) {
		printArgs(args);
	}
}