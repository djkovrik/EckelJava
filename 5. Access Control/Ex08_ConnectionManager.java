/**
* Following the form of the example Lunch.java, create a class called 
* ConnectionManager that manages a fixed array of Connection objects. 
* The client programmer must not be able to explicitly create Connection 
* objects, but can only get them via a static method in ConnectionManager. 
* When the ConnectionManager runs out of objects, it returns a null reference. 
* Test the classes in main( ).
*/

import java.util.*;
import my.lib.connection.*;

public class Ex08_ConnectionManager {
	
	public static void main(String[] args) {
		
		Connection c = ConnectionManager.getConnection();
		
		while(c != null) {
			c.activity();
			c = ConnectionManager.getConnection();
		}
	}
}