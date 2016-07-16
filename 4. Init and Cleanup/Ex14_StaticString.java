/**
* Create a class with a static String field that is initialized at the point of definition, 
* and another one that is initialized by the static block. Add a static method that prints 
* both fields and demonstrates that they are both initialized before they are used.
*/

import java.util.*;

class Strings {
	static String str1 = "point of definition string";
	static String str2;
	
	static {
		str2 = "static block string";
	}
	
	static void printStrings() {
		System.out.println(str1);
		System.out.println(str2);
	}
}


public class Ex14_StaticString {
	public static void main(String[] args) {
		Strings.printStrings();
	}
}