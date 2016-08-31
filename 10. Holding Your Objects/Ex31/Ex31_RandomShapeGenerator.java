/**
 * Modify polymorphism/shape/RandomShapeGenerator.java to make it Iterable. You’ll need to add a constructor
 * that takes the number of elements that you want the iterator to produce before stopping. Verify that it works.
 */

//: polymorphism/shape/RandomShapeGenerator.java
// A "factory" that randomly creates shapes.

import java.util.*;

class RandomShapeGenerator implements Iterable<Shape> {
  private Random rand = new Random(47);
  private int quantity;
  RandomShapeGenerator(int quantity) {
    this.quantity = quantity;
  }

  @Override public Iterator<Shape> iterator() {
    return new Iterator<Shape>() {
      private int counter;

      public boolean hasNext() {
        return counter < quantity;
      }

      public Shape next() {
        counter++;
        return createShape();
      }
    };
  }

  public Shape createShape() {
    switch(rand.nextInt(3)) {
      default:
      case 0: return new Circle();
      case 1: return new Square();
      case 2: return new Triangle();
    }
  }
}

public class Ex31_RandomShapeGenerator {
  public static void main(String[] args) {
    RandomShapeGenerator gen = new RandomShapeGenerator(5);
    for(Shape s : gen) {
      System.out.println(s.getClass());
    }
  }
}