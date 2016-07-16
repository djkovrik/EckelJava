/**
* Create a class with two (overloaded) constructors. Using 
* this, call the second constructor inside the first one.
*/

import java.util.*;

public class Ex09_CtorCalls {
	int xxx;
	
	Ex09_CtorCalls(int x) {
		xxx = x;
		System.out.println("int ctor call: " + x);
	}
	
	Ex09_CtorCalls() {
		this(123);
		System.out.println("no arg ctor call");
	}
	

	
	public static void main(String[] args) {
	
		Ex09_CtorCalls сс = new Ex09_CtorCalls();
		
	}
}