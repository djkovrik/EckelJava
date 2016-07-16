/**
* Modify Exercise 2 so that your code is surrounded by an "infinite" 
* while loop. It will then run until you interrupt it from the keyboard 
* (typically by pressing Control-C).
*
* Exercise 2:
* Write a program that generates 25 random int values. For each value, 
* use an if-else statement to classify it as greater than, less than, 
* or equal to a second randomly generated value.
*/

import java.util.*;
import static net.mindview.util.Print.*;

public class Ex03_InfiniteLoop {
	public static void main(String[] args) {
	
		Random rand = new Random();
		
		int first = rand.nextInt(100);
		int second;
		
		while (true) {
			second = first;
			first = rand.nextInt(100);
			
			if (first < second)
				print(first + " is less than " + second);
			else if (first > second)
				print(first + " is greater than " + second);
			else
				print(first + " and " + second + " are equal");
		}

	}
}