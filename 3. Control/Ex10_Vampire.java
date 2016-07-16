/**
* A vampire number has an even number of digits and is formed by multiplying a 
* pair of numbers containing half the number of digits of the result. The digits 
* are taken from the original number in any order. Pairs of trailing zeroes are 
* not allowed. Examples include:
* 1260 = 21 * 60
* 1827 = 21 * 87
* 2187 = 27 * 81
* Write a program that finds all the 4-digit vampire numbers. 
* (Suggested by Dan Forhan.)
*/

import java.util.*;
import static net.mindview.util.Print.*;

public class Ex10_Vampire {
	public static void main(String[] args) {
		
		int[] initialDigits = new int[4];
		int[] resultDigits = new int[4];
		
			for(int number1 = 10; number1 <= 99; number1++)
				for(int number2 = number1; number2 <= 99; number2++) {
				// Vampire number:
				// x·y == x+y (mod 9)
				if((number1 * number2) % 9 != (number1 + number2) % 9)
					continue;
				
				int result = number1 * number2;
				
				initialDigits[0] = number1 / 10;
				initialDigits[1] = number1 % 10;
				initialDigits[2] = number2 / 10;
				initialDigits[3] = number2 % 10;
				
				resultDigits[0] = result / 1000;
				resultDigits[1] = (result % 1000) / 100;
				resultDigits[2] = result % 1000 % 100 / 10;
				resultDigits[3] = result % 1000 % 100 % 10;
				
				int counter = 0;
				for(int x = 0; x < 4; x++)
					for(int y = 0; y < 4; y++) {
						if(initialDigits[x] == resultDigits[y]) {
							counter++;
							initialDigits[x] = -1;
							resultDigits[y] = -2;
							
							if(counter == 4)
								print(result + " = " + number1 + " * " + number2);
						}
					}
				}
	}
}