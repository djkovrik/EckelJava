/**
* Create a class with a default constructor (one that takes no arguments) 
* that prints a message. Create an object of this class.
*/

import java.util.*;

public class Ex03_DefaultCtor {
	
	Ex03_DefaultCtor() {
		System.out.println("Default constructor called.");
	}
 	
	public static void main(String[] args) {
		Ex03_DefaultCtor d = new Ex03_DefaultCtor();
	}
}