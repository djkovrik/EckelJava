/**
* Create a class called Tank that can be filled and emptied, and 
* has a termination condition that it must be empty when the object 
* is cleaned up. Write a finalize( ) that verifies this termination 
* condition. In main( ), test the possible scenarios that can occur 
* when your Tank is used.
*/

import java.util.*;

class Tank {
	Boolean is_filled;
	Tank(Boolean f) { is_filled = f; }
	void empty() { is_filled = false; }
	
	protected void finalize() {
		if (is_filled)
			System.out.println("Tank is not empty!");
	}
	
}

public class Ex12_TerminatedTank {
	public static void main(String[] args) {
		
		Tank t1 = new Tank(true);
		t1.empty();
		
		new Tank(true);
		
		System.gc();
	}
}