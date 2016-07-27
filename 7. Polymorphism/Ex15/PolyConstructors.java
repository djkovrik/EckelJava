/**
 * Add a RectangularGlyph to PolyConstructors.java and demonstrate the problem
 * described in this section.
 */

//: polymorphism/PolyConstructors.java
// Constructors and polymorphism
// don't produce what you might expect.
import static net.mindview.util.Print.*;

class Glyph {
  void draw() { print("Glyph.draw()"); }
  Glyph() {
    print("Glyph() before draw()");
    draw();
    print("Glyph() after draw()");
  }
}	

class RoundGlyph extends Glyph {
  private int radius = 1;
  RoundGlyph(int r) {
    radius = r;
    print("RoundGlyph.RoundGlyph(), radius = " + radius);
  }
  void draw() {
    print("RoundGlyph.draw(), radius = " + radius);
  }
}

class RectangularGlyph extends Glyph {
  private int h = 2;
  private int w = 3;

  RectangularGlyph(int width, int height) {
    this.w = width;
    this.h = height;
    print("RectangularGlyph.RectangularGlyph(), width = " + w + ", height = " + h);
  }

  void draw() {
    print("RectangularGlyph.draw(), width = " + w + ", height = " + h);
  }
}

public class PolyConstructors {
  public static void main(String[] args) {
    new RoundGlyph(5);
    new RectangularGlyph(6,7);
  }
}