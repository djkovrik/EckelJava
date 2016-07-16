/**
* Repeat Exercise 10 from the previous chapter, using the ternary 
* operator and a bitwise test to display the ones and zeroes, 
* instead of Integer.toBinaryString( ).
*
* Exercise 10:
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

public class Ex05_Bitwise2 {
	private static void toBinaryString(int num) {
		
		int mask = 0x2000;
		
		while (mask != 0) {
			printnb((num & mask) == 0 ? 0 : 1);
			mask = mask >> 1;
		}
	print();
	}
	
	public static void main(String[] args) {
		int x1 = 0x2AAA;
		int x2 = 0x3333;
		
		printnb("x1 = "); toBinaryString(x1);
		printnb("x2 = "); toBinaryString(x2);
		
		printnb("~x1 = "); toBinaryString(~x1);
		printnb("~x2 = "); toBinaryString(~x2);
		printnb("x1 & x1 = "); toBinaryString(x1 & x1);
		printnb("x1 | x1 = "); toBinaryString(x1 | x1);
		printnb("x1 ^ x1 = "); toBinaryString(x1 ^ x1);
		
	}
}