/**
 * Modify innerclasses/Sequence.java so that it throws an appropriate exception if you try to put in too many elements.
 */

class TooManyElements extends RuntimeException {}

interface Selector {
  boolean end();
  Object current();
  void next();
}	

public class Ex12_Sequence {
  private Object[] items;
  private int next = 0;
  public Ex12_Sequence(int size) { items = new Object[size]; }
  public void add(Object x) {
    if(next < items.length)
      items[next++] = x;
    else
      throw new TooManyElements();
  }
  private class SequenceSelector implements Selector {
    private int i = 0;
    public boolean end() { return i == items.length; }
    public Object current() { return items[i]; }
    public void next() { if(i < items.length) i++; }
  }
  public Selector selector() {
    return new SequenceSelector();
  }	
  public static void main(String[] args) {
    Ex12_Sequence sequence = new Ex12_Sequence(10);
    for(int i = 0; i < 11; i++)
      sequence.add(Integer.toString(i));
    Selector selector = sequence.selector();
    while(!selector.end()) {
      System.out.print(selector.current() + " ");
      selector.next();
    }
  }
}