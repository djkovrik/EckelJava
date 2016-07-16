/**
* Create a class containing a float and use it to demonstrate aliasing
* during method calls.
*/

import java.util.*;
import static net.mindview.util.Print.*;

class SomeFloat {
	float value;
}

public class Ex03_AliasingFloat {
	static void f(SomeFloat s) {
		s.value = 4.321f;
	}
	
	public static void main(String[] args) {
		SomeFloat obj = new SomeFloat();
		obj.value = 1.234f;
		print("obj.value = " + obj.value);
		f(obj);
		print("obj.value = " + obj.value);
	}
}