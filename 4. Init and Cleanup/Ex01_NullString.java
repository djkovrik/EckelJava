/**
* Create a class containing an uninitialized String reference. 
* Demonstrate that this reference is initialized by Java to null.
*/

import java.util.*;

public class Ex01_NullString {
	String str;
	
	public static void main(String[] args) {
		
		Ex01_NullString s = new Ex01_NullString();
		
		System.out.println("s.str = " + s.str);
		
	}
}