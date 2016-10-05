/**
 * n ToyTest.java, use reflection to create a Toy object using the non-default constructor.
 */

interface HasBatteries {}
interface Waterproof {}
interface Shoots {}

class Toy {
  Toy() {}
  Toy(int i) {}
}

class FancyToy extends Toy
implements HasBatteries, Waterproof, Shoots {
  FancyToy() { super(1); }

  @Override public String toString() { return "This is FancyToy"; }
}

public class Ex19_ToyTest {
  static Toy makeToy(String name) {
    try {
      Class<?> toyClass = Class.forName(name);
      return (Toy)toyClass.newInstance();
      
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  public static void main(String[] args) {
    System.out.println(makeToy("FancyToy"));
  }
}