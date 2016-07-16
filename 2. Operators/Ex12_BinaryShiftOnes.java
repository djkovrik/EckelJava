/**
* Start with a number that is all binary ones. Left shift it, then 
* use the unsigned right-shift operator to right shift through all of 
* its binary positions, each time displaying the result using 
* Integer.toBinaryString( ).
*/

import java.util.*;
import static net.mindview.util.Print.*;

public class Ex12_BinaryShiftOnes {
	public static void main(String[] args) {
		int x = 0xFFFFFFF;
		
		x <<= 1;
		print(Integer.toBinaryString(x));
		x >>>= 1;
		print(Integer.toBinaryString(x));
		x >>>= 1;
		print(Integer.toBinaryString(x));
		x >>>= 1;
		print(Integer.toBinaryString(x));
		x >>>= 1;
		print(Integer.toBinaryString(x));
		x >>>= 1;
		print(Integer.toBinaryString(x));
		x >>>= 1;
		print(Integer.toBinaryString(x));
		x >>>= 1;
		print(Integer.toBinaryString(x));
		x >>>= 1;
		print(Integer.toBinaryString(x));
		x >>>= 1;
		print(Integer.toBinaryString(x));
		x >>>= 1;
		print(Integer.toBinaryString(x));
		x >>>= 1;
		print(Integer.toBinaryString(x));
		x >>>= 1;
		print(Integer.toBinaryString(x));
		x >>>= 1;
		print(Integer.toBinaryString(x));
		x >>>= 1;
		print(Integer.toBinaryString(x));
		x >>>= 1;
		print(Integer.toBinaryString(x));
		x >>>= 1;
		print(Integer.toBinaryString(x));
		x >>>= 1;
		print(Integer.toBinaryString(x));
		x >>>= 1;
		print(Integer.toBinaryString(x));
		x >>>= 1;
		print(Integer.toBinaryString(x));
		x >>>= 1;
		print(Integer.toBinaryString(x));
		x >>>= 1;
		print(Integer.toBinaryString(x));
		x >>>= 1;
		print(Integer.toBinaryString(x));
		x >>>= 1;
		print(Integer.toBinaryString(x));
		x >>>= 1;
		print(Integer.toBinaryString(x));
		x >>>= 1;
		print(Integer.toBinaryString(x));
		x >>>= 1;
		print(Integer.toBinaryString(x));
		x >>>= 1;
		print(Integer.toBinaryString(x));
		x >>>= 1;
		print(Integer.toBinaryString(x));
		
	}
}