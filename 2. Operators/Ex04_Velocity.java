/**
* Write a program that calculates velocity using a constant 
* distance and a constant time.
*/

import java.util.*;
import static net.mindview.util.Print.*;

public class Ex04_Velocity {
	public static void main(String[] args) {
		if(args.length < 2) {
			System.err.println("Use command: java Ex04_Velocity distance time");
			System.exit(1);
		}
		float d = Float.parseFloat(args[0]);
		float t = Float.parseFloat(args[1]);
		
		print("Velocity = " + d / t + " km/h");
	}
}