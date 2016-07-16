/**
* Write a program with two constant values, one with alternating 
* binary ones and zeroes, with a zero in the least-significant digit, 
* and the second, also alternating, with a one in the least-significant 
* digit (hint: It’s easiest to use hexadecimal constants for this). 
* Take these two values and combine them in all possible ways using 
* the bitwise operators, and display the results using 
* Integer.toBinaryString( ).
*/

import java.util.*;
import static net.mindview.util.Print.*;

public class Ex10_Bitwise {
	public static void main(String[] args) {
		int x1 = 0x2AAA;
		int x2 = 0x3333;
		
		print("x1 = " + Integer.toBinaryString(x1));
		print("x2 = " + Integer.toBinaryString(x2));
		
		print("~x1 = " + Integer.toBinaryString(~x1));
		print("~x2 = " + Integer.toBinaryString(~x2));
		print("x1 & x1 = " + Integer.toBinaryString(x1 & x1));
		print("x1 | x1 = " + Integer.toBinaryString(x1 | x1));
		print("x1 ^ x1 = " + Integer.toBinaryString(x1 ^ x1));
		
	}
}