/**
 * Implement a rotate(Shape) method in Shapes.java, such that it checks to see if it is rotating a Circle
 * (and, if so, doesn’t perform the operation).
 */

import java.util.*;

abstract class Shape {
  void draw() { System.out.println(this + ".draw()"); }
  abstract public String toString();

  void rotate(int angle) {
    System.out.println("Rotating " + this + " to " + angle);
  }
}

class Circle extends Shape {
  public String toString() { return "Circle"; }

  void rotate(int angle) {
    System.out.println("Can't rotate a circle!");
  }
}

class Square extends Shape {
  public String toString() { return "Square"; }
}

class Triangle extends Shape {
  public String toString() { return "Triangle"; }
}	

public class Ex05_RotateShapes {
  public static void main(String[] args) {
    List<Shape> shapeList = Arrays.asList(
      new Circle(), new Square(), new Triangle()
    );
    for(Shape shape : shapeList)
      shape.draw();

    for(Shape shape : shapeList) {
      if (!(shape instanceof Circle)) {
        shape.rotate(15);
      }
    }
  }
}