/**
 * Modify Turtle.java so that it sends all output to System.err.
 */

import java.io.*;
import java.util.*;

public class Ex03_Turtle {
  private String name;
  private Formatter f;
  public Ex03_Turtle(String name, Formatter f) {
    this.name = name;
    this.f = f;
  }
  public void move(int x, int y) {
    f.format("%s The Ex03_Turtle is at (%d,%d)\n", name, x, y);
  }
  public static void main(String[] args) {
    PrintStream outAlias = System.err;
    Ex03_Turtle tommy = new Ex03_Turtle("Tommy",
      new Formatter(System.err));
    Ex03_Turtle terry = new Ex03_Turtle("Terry",
      new Formatter(outAlias));
    tommy.move(0,0);
    terry.move(4,8);
    tommy.move(3,4);
    terry.move(2,5);
    tommy.move(3,3);
    terry.move(3,3);
  }
}