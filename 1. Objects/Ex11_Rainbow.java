/**
* Turn the AllTheColorsOfTheRainbow example into a program that compiles and runs.
*/

import java.util.*;

public class Ex11_Rainbow {
	int anIntegerRepresentingColors;
	void changeTheHueOfTheColor(int newHue) {
		anIntegerRepresentingColors = newHue;
	}
	public static void main(String args[]) {
		Ex11_Rainbow r = new Ex11_Rainbow();
		r.changeTheHueOfTheColor(2);
	}
}