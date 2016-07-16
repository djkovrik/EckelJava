/**
* Modify the two test( ) methods in the previous two programs so 
* that they take two extra arguments, begin and end, and so that 
* testval is tested to see if it is within the range between 
* (and including) begin and end.
*/

import static net.mindview.util.Print.*;

public class Ex06_Test {
	static boolean test(int testval, int begin, int end) {
		boolean result = false;
		
		if( testval >= begin && testval <= end )
			result = true;
			
		return result;
	}
	
	public static void main(String[] args) {
		print(test(10, 5, 20));
		print(test(5, 10, 20));
		print(test(5, 5, 5));
  }
}
