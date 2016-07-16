/**
* Create a class containing a float and use it to demonstrate aliasing.
*/

import java.util.*;
import static net.mindview.util.Print.*;

class DataPack {
	float value;
}

public class Ex02_Aliasing {
	public static void main(String[] args) {
		DataPack d1 = new DataPack();
		DataPack d2 = new DataPack();
		
		d1.value = 1.234f;
		d2.value = 4.321f;
		
		print("d1 = " + d1.value + ", d2 = " + d2.value);
		print("d2 = d1");
		d2 = d1;
		print("d1 = " + d1.value + ", d2 = " + d2.value);
		print("d1.value = 4.567f");
		d1.value = 4.567f;
		print("d1 = " + d1.value + ", d2 = " + d2.value);
	}
}