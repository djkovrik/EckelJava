/**
* Create a class with two methods. Within the first method, call the second 
* method twice: the first time without using this, and the second time using 
* this—just to see it working; you should not use this form in practice.
*/

import java.util.*;

public class Ex08_TwoMethods {
	void foo1() {
		System.out.println("foo1()");
		
		foo2();
		this.foo2();
	}
	
	void foo2() {
		System.out.println("foo2()");
	}
	
	public static void main(String[] args) {
	
		Ex08_TwoMethods tm = new Ex08_TwoMethods();
		
		tm.foo1();
	}
}