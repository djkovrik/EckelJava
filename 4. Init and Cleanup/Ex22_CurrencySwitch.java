/**
* Write a switch statement for the enum in the previous example. 
* For each case, output a description of that particular currency.
* 
* Create an enum of the least-valuable six types of paper currency. Loop 
* through the values( ) and print each value and its ordinal( ).
*/

import java.util.*;

enum PaperCurrency { TEN, FIFTY, ONE_HUNDRED, FIVE_HUNDREDS, ONE_THOUSAND, FIVE_THOUSANDS }

public class Ex22_CurrencySwitch {
	
	static void describe(PaperCurrency pc) {
		switch(pc) {
			case TEN: 				System.out.println("The smallest currency."); break;
			case FIFTY: 			System.out.println("You can buy a cup of cofee."); break;
			case ONE_HUNDRED: 		System.out.println("Not bad."); break;
			case FIVE_HUNDREDS: 	System.out.println("You can go to Mc and buy some good meals."); break;
			case ONE_THOUSAND: 		System.out.println("The most popular one"); break;
			case FIVE_THOUSANDS: 	System.out.println("The most enjoyable one."); break;
		};
	}
	
	public static void main(String[] args) {
		
		for ( PaperCurrency c : PaperCurrency.values() )
			describe(c);
	}
}