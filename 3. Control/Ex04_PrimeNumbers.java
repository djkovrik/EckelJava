/**
* Write a program that uses two nested for loops and the modulus 
* operator (%) to detect and print prime numbers (integral numbers 
* that are not evenly divisible by any other numbers except for 
* themselves and 1).
*/

import java.util.*;
import static net.mindview.util.Print.*;

public class Ex04_PrimeNumbers {
	public static void main(String[] args) {
		
		print("Prime numbers from 1 to 100: ");
		
		int counter;
			
		for (int i = 1; i <= 100; i++) {
			
			counter = 0;
			
			for (int j = 1; j <= i; j++) {
				if ( i % j == 0)
					counter++;
			}
			
			if (counter <= 2)
				print(i);
		}
	}
}