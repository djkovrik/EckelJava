/**
* Show that hex and octal notations work with long values. 
* Use Long.toBinaryString( ) to display the results.
*/

import java.util.*;
import static net.mindview.util.Print.*;

public class Ex08_Long {
	public static void main(String[] args) {
		long x1 = 0x1de;
		print("x1: " + Long.toBinaryString(x1));
		long x2 = 0X1DE;
		print("x2: " + Long.toBinaryString(x2));
		long x3 = 0145;
		print("x3: " + Long.toBinaryString(x3));
	}
}