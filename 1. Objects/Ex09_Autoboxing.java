/**
* Write a program that demonstrates that autoboxing works for all 
* the primitive types and their wrappers.
*/

import java.util.*;

public class Ex09_Autoboxing {
		public static void main(String[] args) {
			Byte bt = 1;
			byte bte = bt;
			Boolean b = true;
			boolean be = b;
			Character ch = 'z';
			char c = ch;
			Short s = 2;
			short st = s;
			Integer i = 100;
			int ii = i;
			Long li = 10000000L;
			long lg = li;
			Float f = 1.2f;
			float ft = f;
			Double d = 12345.67890d;
			double dd = d;
			
			System.out.println("byte bte = " + bte);
			System.out.println("boolean be = " + be);
			System.out.println("char c = " + c);
			System.out.println("short st = " + st);
			System.out.println("int ii = " + ii);
			System.out.println("long lg = " + lg);
			System.out.println("gloat ft = " + ft);
			System.out.println("double dd = " + dd);
	}
}