/**
* Create a class with public, private, protected, and package-access fields 
* and method members. Create an object of this class and see what kind of 
* compiler messages you get when you try to access all the class members. 
* Be aware that classes in the same directory are part of the "default" package.
*/

import java.util.*;
import my.*;

public class Ex05_AccessTries {
	
	public static void main(String[] args) {
		
		Ex05_Data d = new Ex05_Data();
		
		System.out.println(d.a);
		//System.out.println(d.b); //!error: b has protected access in Ex05_Data
		//System.out.println(d.c); //!error: c has private access in Ex05_Data
		//System.out.println(d.d); //!error: d is not public in Ex05_Data; cannot be accessed from outside package

	}
}