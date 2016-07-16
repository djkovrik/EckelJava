/**
* Add an overloaded constructor to the previous exercise that takes a String 
* argument and prints it along with your message.
*
* Previous exercise:
* Create a class with a default constructor (one that takes no arguments) 
* that prints a message. Create an object of this class.
*/

import java.util.*;

public class Ex04_DefaultCtorOverload {
	
	Ex04_DefaultCtorOverload() {
		System.out.println("Default constructor called.");
	}
	
	Ex04_DefaultCtorOverload(String msg) {
		System.out.println("Overloaded constructor message: " + msg);
	}
 	
	public static void main(String[] args) {
		Ex04_DefaultCtorOverload d = new Ex04_DefaultCtorOverload("THIS IS A TEST");
	}
}