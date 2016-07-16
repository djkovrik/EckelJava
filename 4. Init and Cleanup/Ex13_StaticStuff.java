/**
* Verify the statements in the previous paragraph.
*/

import java.util.*;

class Noisy {
	Noisy(int id) {
		System.out.println("Noisy(" + id + ")");
	}
	
	void f(int id) {
		System.out.println("f(" + id + ")");
	}
}

class Storage {
	static Noisy n1;
	static Noisy n2;
	
	static {
		n1 = new Noisy(1);
		n2 = new Noisy(2);
	}
	
	Storage() {
		System.out.println("Storage()");
	}
}

public class Ex13_StaticStuff {
	public static void main(String[] args) {
		System.out.println("main()");
		
		//Storage.n1.f(123);
	}
	
	//static Storage s1 = new Storage();
	//static Storage s2 = new Storage();
}