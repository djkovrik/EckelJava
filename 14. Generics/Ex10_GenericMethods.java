/**
 * Modify the previous exercise so that one of f( )’s arguments is non-parameterized.
 *
 * Modify GenericMethods.java so that f( ) accepts three arguments, all of which are of a different parameterized type.
 */

public class Ex10_GenericMethods {
  public <X, Y> void f(X a, Y b, String c) {
    System.out.println(a.getClass().getName() + " " + b.getClass().getName() + " " + c.getClass().getName());
  }
  public static void main(String[] args) {
    Ex10_GenericMethods gm = new Ex10_GenericMethods();
    gm.f("", 2, "Test");
    gm.f(1, true, "2.3");
    gm.f('c', 0, "gm");
  }
}