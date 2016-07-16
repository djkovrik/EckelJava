/**
* A Fibonacci sequence is the sequence of numbers 1, 1, 2, 3, 5, 8, 13, 21, 34, 
* and so on, where each number (from the third on) is the sum of the previous two. 
* Create a method that takes an integer as an argument and displays that many 
* Fibonacci numbers starting from the beginning, e.g., If you run java Fibonacci 5 
* (where Fibonacci is the name of the class) the output will be: 1, 1, 2, 3, 5.
*/

import java.util.*;
import static net.mindview.util.Print.*;

public class Ex09_Fibonacci {
	
	static int fibonacci(int n) {
		if (n <= 2)
			return 1;
		
		return fibonacci(n-1) + fibonacci(n-2);
	}
	
	public static void main(String[] args) {
		
		if(args.length != 1) {
			System.err.println("Use command: java Ex09_Fibonacci n");
			System.exit(1);
		}
		
		int n = Integer.parseInt(args[0]);
		
		for ( int i = 1; i <=n; i++ )
			printnb(fibonacci(i) + " ");
	}
}