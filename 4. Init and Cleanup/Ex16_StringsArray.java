/**
* Create an array of String objects and assign a String 
* to each element. Print the array by using a for loop.
*/

import java.util.*;

public class Ex16_StringsArray {
	public static void main(String[] args) {
		
		String[] strings = new String[4];
		
		strings[0] = "This";
		strings[1] = "is";
		strings[2] = "an";
		strings[3] = "array";
		
		for(String s : strings)
			System.out.println(s);

	}
}