/**
 * Modify Shapes.java so that it can "highlight" (set a flag in) all shapes of a particular type. The toString( )
 * method for each derived Shape should indicate whether that Shape is "highlighted."
 */

import java.util.*;

abstract class Shape {
  private boolean highlighted = false;
  void setHighlightd() { highlighted = true; }
  void removeHighlight() { highlighted = false; }

  void draw() { System.out.println("Drawing: " + this); }
  public String toString() {
    return getClass().getName() + (highlighted ? " (highlighted)" :  " (normal)");
  }
}

class Circle extends Shape {}
class Square extends Shape {}
class Triangle extends Shape {}

public class Ex06_Shapes {
  public static void main(String[] args) {
    List<Shape> shapeList = new ArrayList<>();
    Circle c = new Circle();
    Square s = new Square();
    Triangle t = new Triangle();

    s.setHighlightd();

    shapeList.add(c);
    shapeList.add(s);
    shapeList.add(t);

    for(Shape shape : shapeList)
      shape.draw();
  }
}