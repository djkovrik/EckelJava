/**
* Create a class with a String that is initialized using 
* instance initialization.
*/

import java.util.*;

class Strings {
	String str1;
	String str2;
	
	{
		str1 = "Instance init";
		str2 = "Another instance init";
		System.out.println("Strings initialized.");
	}
	
	void printStrings() {
		System.out.println(str1);
		System.out.println(str2);
	}
}


public class Ex15_InstanceString {
	public static void main(String[] args) {
		Strings s = new Strings();
		s.printStrings();
	}
}