/**
* Following Exercise 5, create a new Dog reference and assign it to 
* spot’s object. Test for comparison using == and equals( ) for all 
* references.
* 
* Create a class called Dog containing two Strings: name and says. 
* In main( ), create two dog objects with names "spot" (who says, "Ruff!") 
* and "scruffy" (who says, "Wurf!"). Then display their names and what they say.
*/

import java.util.*;
import static net.mindview.util.Print.*;

class Dog {
	String name;
	String says;
}

public class Ex06_ThreeDogs {
	public static void main(String[] args) {
		Dog dog1 = new Dog();
		Dog dog2 = new Dog();
		
		dog1.name = "spot"; dog2.name = "scruffy";
		dog1.says = "ruff!"; dog2.says = "wurf!";
		
		print("I am " + dog1.name + " and I'm saying " + dog1.says);
		print("I am " + dog2.name + " and I'm saying " + dog2.says);
		
		Dog dog22 = dog2;
		
		print("dog1 == dog2: " + (dog1 == dog2));
		print("dog1 != dog2: " + (dog1 != dog2));
		print("dog1.equals(dog2): " + (dog1.equals(dog2)));
		
		print("dog22 == dog2: " + (dog22 == dog2));
		print("dog22 != dog2: " + (dog22 != dog2));
		print("dog22.equals(dog2): " + (dog22.equals(dog2)));

	}
}