/**
* Write a program that includes and calls the storage( ) method 
* defined as a code fragment in this chapter.
*/

import java.util.*;

public class Ex06_Storage {
	String str = "Test string";
	
	int storage(String s) {
		return s.length() * 2;
	}
	
	void print() {
		System.out.println("storage(str) = " + storage(str));
	}
	
	public static void main(String[] args) {
		Ex06_Storage x = new Ex06_Storage();
		x.print();
	}
}