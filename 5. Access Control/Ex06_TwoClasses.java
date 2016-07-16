/**
* Create a class with protected data. Create a second class in the same 
* file with a method that manipulates the protected data in the first class.
*/

import java.util.*;

class First {
protected String str = "text data";
}

class Second {
	public static void f() {
		First f = new First();
		System.out.println("String: " + f.str);
	}
}

public class Ex06_TwoClasses {
	
	public static void main(String[] args) {
		Second.f();
	}
}