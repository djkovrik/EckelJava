/**
 * Modify FactoryConstraint.java so that create( ) takes an argument.
 */

interface FactoryI<T> {
  T create(int arg);
}

class Foo2<T> {
  private T x;
  public <F extends FactoryI<T>> Foo2(F factory) {
    x = factory.create(123);
  }
}

class IntegerFactory implements FactoryI<Integer> {
  public Integer create(int arg) {
    return new Integer(arg);
  }
}	

class Widget {
  private final int i;
  Widget(int i) { this.i = i; }
  @Override public String toString() { return "Widget{" + "i=" + i + '}';  }

  public static class Factory implements FactoryI<Widget> {
    public Widget create(int arg) {
      return new Widget(arg);
    }
  }
}

public class Ex23_FactoryConstraint {
  public static void main(String[] args) {
    new Foo2<>(new IntegerFactory());
    new Foo2<>(new Widget.Factory());
  }
}
