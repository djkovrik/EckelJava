/**
* Turn the Incrementable code fragments into a working program.
*/

import java.util.*;

class StaticTest {
	static int i = 47;
}

public class Ex07_Incrementable {
	
	static void increment() { 
		StaticTest.i++; 
	}
	
	public static void main(String[] args) {
		Ex07_Incrementable e = new Ex07_Incrementable();
		System.out.println("static int i = " + StaticTest.i);
		e.increment();
		System.out.println("static int i = " + StaticTest.i);
		Ex07_Incrementable.increment();
		System.out.println("static int i = " + StaticTest.i);
	}
}