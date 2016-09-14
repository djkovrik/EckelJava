/**
 * Modify reusing/CADSystem.java to demonstrate that returning from the middle of a try-finally will still
 * perform proper cleanup.
 */

import static net.mindview.util.Print.*;

class Shape {
  Shape(int i) { print("Shape constructor"); }
  void dispose() { print("Shape dispose"); }
}

class Circle extends Shape {
  Circle(int i) {
    super(i);
    print("Drawing Circle");
  }
  void dispose() {
    print("Erasing Circle");
    super.dispose();
  }
}

class Triangle extends Shape {
  Triangle(int i) {
    super(i);
    print("Drawing Triangle");
  }
  void dispose() {
    print("Erasing Triangle");
    super.dispose();
  }
}

class Line extends Shape {
  private int start, end;
  Line(int start, int end) {
    super(start);
    this.start = start;
    this.end = end;
    print("Drawing Line: " + start + ", " + end);
  }
  void dispose() {
    print("Erasing Line: " + start + ", " + end);
    super.dispose();
  }
}

public class Ex16_CADSystem extends Shape {
  private Circle c;
  private Triangle t;
  private Line[] lines = new Line[3];
  public Ex16_CADSystem(int i) {
    super(i + 1);
    for(int j = 0; j < lines.length; j++)
      lines[j] = new Line(j, j*j);
    c = new Circle(1);
    t = new Triangle(1);
    print("Combined constructor");
  }
  public void dispose() {
    print("Ex16_CADSystem.dispose()");
    // The order of cleanup is the reverse
    // of the order of initialization:
    t.dispose();
    c.dispose();
    for(int i = lines.length - 1; i >= 0; i--)
      lines[i].dispose();
    super.dispose();
  }
  public static void main(String[] args) {
    Ex16_CADSystem x = new Ex16_CADSystem(47);
    try {
      return;
    } finally {
      x.dispose();
    }
  }
}