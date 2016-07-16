/**
* Write a method that displays char values in binary form. 
* Demonstrate it using several different characters.
*/

import java.util.*;
import static net.mindview.util.Print.*;

public class Ex13_BinaryChar {
	
	static void toBinary(char c) {
		print(c + ": " + Integer.toBinaryString(c));
	}
	
	public static void main(String[] args) {
		toBinary('@');
		toBinary('Z');
		toBinary('2');
		toBinary('w');
		toBinary('%');
		toBinary('!');
	}
}