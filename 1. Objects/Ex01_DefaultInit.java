/**
* Create a class containing an int and a char that are not initialized, 
* and print their values to verify that Java performs default initialization.
*/

import java.util.*;

public class Ex01_DefaultInit {
	int x;
	char c;
	public Ex01_DefaultInit() {
		System.out.println(x);
		System.out.println(c);
	}
	public static void main(String[] args) {
		new Ex01_DefaultInit();
	}
}