/**
 * Add a new type of Shape to Shapes.java and verify in main( ) that
 * polymorphism works for your new type as it does in the old types.
 */

//: polymorphism/Shapes.java
// Polymorphism in Java.
import shape.*;

public class Shapes {
  private static RandomShapeGenerator gen =
    new RandomShapeGenerator();
  public static void main(String[] args) {
    Shape[] s = new Shape[12];
    // Fill up the array with shapes:
    for(int i = 0; i < s.length; i++)
      s[i] = gen.next();
    // Make polymorphic method calls:
    for(Shape shp : s)
      shp.draw();
  }
}