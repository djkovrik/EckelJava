import static net.mindview.util.Print.*;

/** Main tree class. */
class Tree {
  /** Holds tree height in meters. */
  int height;
  /** Default constructor, resets tree height to zero. */
  Tree() {
    print("Planting a seedling");
    height = 0;
  }
  /** Default constructor, sets tree height to initialHeight value. */
  Tree(int initialHeight) {
    height = initialHeight;
    print("Creating new Tree that is " +
      height + " feet tall");
  }	
  /** Prints tree info. */
  void info() {
    print("Tree is " + height + " feet tall");
  }
  
  /** Prints tree info with string prefix.
   * @param s Your string line.
   */
  void info(String s) {
    print(s + ": Tree is " + height + " feet tall");
  }
}

/** Main application class. */
public class Overloading {
  public static void main(String[] args) {
    for(int i = 0; i < 5; i++) {
      Tree t = new Tree(i);
      t.info();
      t.info("overloaded method");
    }
    /** Overloaded constructor. */
    new Tree();
  }	
} /* Output:
Creating new Tree that is 0 feet tall
Tree is 0 feet tall
overloaded method: Tree is 0 feet tall
Creating new Tree that is 1 feet tall
Tree is 1 feet tall
overloaded method: Tree is 1 feet tall
Creating new Tree that is 2 feet tall
Tree is 2 feet tall
overloaded method: Tree is 2 feet tall
Creating new Tree that is 3 feet tall
Tree is 3 feet tall
overloaded method: Tree is 3 feet tall
Creating new Tree that is 4 feet tall
Tree is 4 feet tall
overloaded method: Tree is 4 feet tall
Planting a seedling
*///:~
