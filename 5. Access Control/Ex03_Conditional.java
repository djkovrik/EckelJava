/**
* Create two packages: debug and debugoff, containing an identical class 
* with a debug( ) method. The first version displays its String argument 
* to the console, the second does nothing. Use a static import line to 
* import the class into a test program, and demonstrate the conditional 
* compilation effect.
*/

import java.util.*;
import static my.lib.debug.DebugClass.*;
//import static my.lib.debugoff.DebugClass.*;

public class Ex03_Conditional {
	
	public static void main(String[] args) {
		debug("Test");
	}
}