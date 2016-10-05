/**
 * Add Rhomboid to Shapes.java. Create a Rhomboid, upcast it to a Shape, then downcast it back to a Rhomboid.
 * Try downcasting to a Circle and see what happens.
 */

import java.util.*;

abstract class Shape {
  void draw() { System.out.println(this + ".draw()"); }
  abstract public String toString();
}

class Circle extends Shape {
  public String toString() { return "Circle"; }
}

class Square extends Shape {
  public String toString() { return "Square"; }
}

class Triangle extends Shape {
  public String toString() { return "Triangle"; }
}

class Rhomboid extends Shape {
  public String toString() { return "Rhomboid"; }
}


public class Ex04_ShapesModified {
  public static void main(String[] args) {
    List<Shape> shapeList = Arrays.asList(
      new Circle(), new Square(), new Triangle(), new Rhomboid()
    );
    for(Shape shape : shapeList)
      shape.draw();

    Shape sp = new Rhomboid();  // upcast
    Rhomboid rm = (Rhomboid)sp; // downcast

    Circle cr = null;

    if (sp instanceof Circle)
      cr = (Circle)sp;
    else
      System.out.println("Shape is not an instance of Circle class");
  }
}