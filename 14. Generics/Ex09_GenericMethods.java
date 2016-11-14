/**
 * Modify GenericMethods.java so that f( ) accepts three arguments, all of which are of a different parameterized type.
 */

public class Ex09_GenericMethods {
  public <X, Y, Z> void f(X a, Y b, Z c) {
    System.out.println(a.getClass().getName() + " " + b.getClass().getName() + " " + c.getClass().getName());
  }
  public static void main(String[] args) {
    Ex09_GenericMethods gm = new Ex09_GenericMethods();
    gm.f("", 2, "Test");
    gm.f(1, true, 2.3);
    gm.f('c', 0, gm);
  }
}