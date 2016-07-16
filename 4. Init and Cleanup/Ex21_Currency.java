/**
* Create an enum of the least-valuable six types of paper currency. Loop 
* through the values( ) and print each value and its ordinal( ).
*/

import java.util.*;

enum PaperCurrency { TEN, FIFTY, ONE_HUNDRED, FIVE_HUNDREDS, ONE_THOUSAND, FIVE_THOUSANDS }

public class Ex21_Currency {
		
	public static void main(String[] args) {
		
		for ( PaperCurrency c : PaperCurrency.values() )
			System.out.println( c + ", ordinal: " + c.ordinal() );
	}
}