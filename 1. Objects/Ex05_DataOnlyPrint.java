/**
* Modify the previous exercise so that the values of the data in 
* DataOnly are assigned to and printed in main( ).
*/

import java.util.*;

public class Ex05_DataOnlyPrint {
	int i;
	double d;
	boolean b;
	public static void main(String[] args) {
		Ex05_DataOnlyPrint data = new Ex05_DataOnlyPrint();
		data.i = 47;
		data.d = 1.1;
		data.b = false;
		System.out.println("data.i = " + data.i);
		System.out.println("data.d = " + data.d);
		System.out.println("data.b = " + data.b);
	}
}