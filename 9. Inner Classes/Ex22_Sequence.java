/**
 * Implement reverseSelector( ) in Sequence.java
 */

//: innerclasses/Sequence.java
// Holds a sequence of Objects.

interface Selector {
  boolean end();
  Object current();
  void next();
}	

public class Ex22_Sequence {
  private Object[] items;
  private int next = 0;
  public Ex22_Sequence(int size) { items = new Object[size]; }
  public void add(Object x) {
    if(next < items.length)
      items[next++] = x;
  }

  private class SequenceSelector implements Selector {
    private int i = 0;
    public boolean end() { return i == items.length; }
    public Object current() { return items[i]; }
    public void next() { if(i < items.length) i++; }
  }

  private class reverseSelector implements Selector {
      private int i = items.length - 1;

      public boolean end() { return i < 0; }
      public Object current() { return items[i]; }
      public void next() { if(i >= 0) i--; }
  }

  public Selector selector() {
    return new SequenceSelector();
  }

  public Selector rselector() {
        return new reverseSelector();
    }

  public static void main(String[] args) {
    Ex22_Sequence sequence = new Ex22_Sequence(10);

    for(int i = 0; i < 10; i++)
      sequence.add(Integer.toString(i));

    Selector selector1 = sequence.selector();
    while(!selector1.end()) {
      System.out.print(selector1.current() + " ");
      selector1.next();
    }

    System.out.println();

    Selector selector2 = sequence.rselector();
      while(!selector2.end()) {
          System.out.print(selector2.current() + " ");
          selector2.next();
      }
  }
}