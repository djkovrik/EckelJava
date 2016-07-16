/**
* Write a program that demonstrates that, no matter how many objects 
* you create of a particular class, there is only one instance of a 
* particular static field in that class.
*/

import java.util.*;

class ClassWithStaticField {
	static int x = 3;
}

public class Ex08_StaticField {
		public static void main(String[] args) {
			ClassWithStaticField c1 = new ClassWithStaticField();
			ClassWithStaticField c2 = new ClassWithStaticField();
			ClassWithStaticField c3 = new ClassWithStaticField();
			
			System.out.println("x in c1 = " + c1.x);
			System.out.println("x in c2 = " + c2.x);
			System.out.println("x in c3 = " + c3.x);
			c1.x = 4;
			System.out.println("x was changed in c1, so now all objects share the same value:");
			System.out.println("x in c1 = " + c1.x);
			System.out.println("x in c2 = " + c2.x);
			System.out.println("x in c3 = " + c3.x);
			
			
	}
}