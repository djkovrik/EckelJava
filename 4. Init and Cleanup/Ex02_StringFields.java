/**
* Create a class with a String field that is initialized at the point 
* of definition, and another one that is initialized by the constructor. 
* What is the difference between the two approaches?
*/

import java.util.*;

public class Ex02_StringFields {
	String str1 = "Some string";
	String str2;
	
	Ex02_StringFields(String s) {
		str2 = s;
	}
	
	public static void main(String[] args) {
		
		Ex02_StringFields s = new Ex02_StringFields("TEST");
		
		System.out.println("str1 = " + s.str1);
		System.out.println("str2 = " + s.str2);
		
	}
}