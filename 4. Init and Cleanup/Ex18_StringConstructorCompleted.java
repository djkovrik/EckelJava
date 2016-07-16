/**
* Complete the previous exercise by creating objects to attach to the array of references.
* 
* Create a class with a constructor that takes a String argument. During construction, 
* print the argument. Create an array of object references to this class, but don’t actually 
* create objects to assign into the array. When you run the program, notice whether the 
* initialization messages from the constructor calls are printed.
*/

import java.util.*;

class MyClass {
	MyClass(String str) {
		System.out.println("MyClass(" + str + ") called.");
	}
}

public class Ex18_StringConstructorCompleted {
	public static void main(String[] args) {
		
		MyClass[] array = new MyClass[3];
		
		array[0] = new MyClass("first");
		array[1] = new MyClass("second");
		array[2] = new MyClass("third");
	}
}