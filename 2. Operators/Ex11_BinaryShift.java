/**
* Start with a number that has a binary one in the most significant 
* position (hint: Use a hexadecimal constant). Using the signed right-shift 
* operator, right shift it all the way through all of its binary positions, 
* each time displaying the result using Integer.toBinaryString( ).
*/

import java.util.*;
import static net.mindview.util.Print.*;

public class Ex11_BinaryShift {
	public static void main(String[] args) {
		int x = 0x80000000;
		
		print(Integer.toBinaryString(x));
		x >>= 1;
		print(Integer.toBinaryString(x));
		x >>= 1;
		print(Integer.toBinaryString(x));
		x >>= 1;
		print(Integer.toBinaryString(x));
		x >>= 3;
		print(Integer.toBinaryString(x));
		x >>= 1;
		print(Integer.toBinaryString(x));
		x >>= 1;
		print(Integer.toBinaryString(x));
		x >>= 1;
		print(Integer.toBinaryString(x));
		x >>= 1;
		print(Integer.toBinaryString(x));
		x >>= 1;
		print(Integer.toBinaryString(x));
		x >>= 1;
		print(Integer.toBinaryString(x));
		x >>= 1;
		print(Integer.toBinaryString(x));
		x >>= 3;
		print(Integer.toBinaryString(x));
		x >>= 1;
		print(Integer.toBinaryString(x));
		x >>= 1;
		print(Integer.toBinaryString(x));
		x >>= 1;
		print(Integer.toBinaryString(x));
		x >>= 1;
		print(Integer.toBinaryString(x));
		x >>= 1;
		print(Integer.toBinaryString(x));
		x >>= 3;
		print(Integer.toBinaryString(x));
		x >>= 1;
		print(Integer.toBinaryString(x));
		x >>= 1;
		print(Integer.toBinaryString(x));
		x >>= 1;
		print(Integer.toBinaryString(x));
		x >>= 1;
		print(Integer.toBinaryString(x));
		x >>= 1;
		print(Integer.toBinaryString(x));
		x >>= 1;
		print(Integer.toBinaryString(x));
	}
}