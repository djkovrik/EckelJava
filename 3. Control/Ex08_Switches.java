/**
* Create a switch statement that prints a message for each case, and put the 
* switch inside a for loop that tries each case. Put a break after each case 
* and test it, then remove the breaks and see what happens.
*/

import java.util.*;
import static net.mindview.util.Print.*;
import static net.mindview.util.Range.*;

public class Ex08_Switches {
	public static void main(String[] args) {
		
		for (int i : range(5)) {
			switch(i) {
				case 0: print("i = 0"); //break;
				case 1: print("i = 1"); //break;
				case 2: print("i = 2"); //break;
				case 3: print("i = 3"); //break;
				case 4: print("i = 4"); //break;
				default: print("This is default option.");
			}
		}
	}
}