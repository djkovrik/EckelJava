/**
* Write a program that simulates coin-flipping.
*/

import java.util.*;
import static net.mindview.util.Print.*;

public class Ex07_CoinFlipping {
	public static void main(String[] args) {
		Random rand = new Random();
		boolean b = rand.nextBoolean();
		
		if (b)
			print("It's heads!");
		else
			print("It's tails!");
	}
}