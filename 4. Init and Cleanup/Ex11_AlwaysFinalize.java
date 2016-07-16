/**
* Modify the previous exercise so that your finalize( ) will always be called.
*
* Create a class with a finalize( ) method that prints a message. 
* In main( ), create an object of your class. 
* Explain the behavior of your program.
*/

import java.util.*;

public class Ex11_AlwaysFinalize {
	protected void finalize() {
		System.out.println("finalize() is called.");
	}
	
	public static void main(String[] args) {
		
		new Ex11_AlwaysFinalize();
		
		System.gc();
	}
}