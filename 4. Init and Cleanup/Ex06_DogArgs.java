/**
* Modify the previous exercise so that two of the overloaded methods have 
* two arguments (of two different types), but in reversed order relative 
* to each other. Verify that this works.
*/

import java.util.*;

public class Ex06_DogArgs {
	
	void bark() {
		System.out.println("Default bark!");
	}
	
	void bark(int i, double d) {
		System.out.println("Howl!");
	}
	
	void bark(double d, int i) {
		System.out.println("Wuff!");
	}
	
	public static void main(String[] args) {
		
		Ex06_DogArgs d = new Ex06_DogArgs();
		
		d.bark();
		d.bark(1, 2.3);
		d.bark(2.3, 1);
	}
}