/**
 * Create a class inside a package. Your class should contain a protected method. 
 * Outside of the package, try to call the protected method and explain the results. 
 * Now inherit from your class and call the protected method from inside a method of
 * your derived class.
 */

import inner.*;

class Derived extends Ex15_SomeClass {
	public void foo() {
		f();
	}
}

public class Ex15_ProtectedTest {

    public static void main(String[] args) {
		
		new Derived().foo();
		//!new Ex15_SomeClass().f();
		//!error: f() has protected access in Ex15_SomeClass

    }
}
