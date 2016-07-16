/**
* Modify Exercise 1 so that the program exits by using the break keyword 
* at value 99. Try using return instead
* 
* Exercise 1:
* Write a program that prints values from 1 to 100.
*/

import java.util.*;
import static net.mindview.util.Print.*;

public class Ex07_Break {
	public static void main(String[] args) {
		
		for (int i = 1; i <= 100; i++) {
			if (i == 99) 
				break;
				//return;
			
			print(i);
		}
			
	}
}