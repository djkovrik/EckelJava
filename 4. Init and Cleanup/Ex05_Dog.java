/**
* Create a class called Dog with an overloaded bark( ) method. This method 
* should be overloaded based on various primitive data types, and print different 
* types of barking, howling, etc., depending on which overloaded version is called. 
* Write a main( ) that calls all the different versions.
*/

import java.util.*;

public class Ex05_Dog {
	
	void bark() {
		System.out.println("Default bark!");
	}
	
	void bark(int i) {
		System.out.println("Howl!");
	}
	
	void bark(double d) {
		System.out.println("Wuff!");
	}
	
	public static void main(String[] args) {
		
		Ex05_Dog d = new Ex05_Dog();
		
		d.bark();
		d.bark(1);
		d.bark(2.3);
	}
}