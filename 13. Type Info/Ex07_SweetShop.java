/**
 * Modify SweetShop.java so that each type of object creation is controlled by a command-line argument.
 * That is, if your command line is "Java Sweetshop Candy," then only the Candy object is created.
 * Notice how you can control which Class objects are loaded via the commandline argument.
 */

import static net.mindview.util.Print.*;

class Candy {
  static { print("Loading Candy"); }
}

class Gum {
  static { print("Loading Gum"); }
}

class Cookie {
  static { print("Loading Cookie"); }
}

public class Ex07_SweetShop {
  public static void main(String[] args) {

    try {
      for (String arg : args) {
        Class.forName(arg);
      }
    } catch (ClassNotFoundException e) {
      print("Couldn't find the class");
    }
  }
}