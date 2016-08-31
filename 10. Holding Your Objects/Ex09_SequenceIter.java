/**
 * Modify innerclasses/Sequence.java so that Sequence works with an Iterator instead of a Selector.
 */

//: innerclasses/Sequence.java
// Holds a sequence of Objects.

import java.util.Iterator;

public class Ex09_SequenceIter {
  private Object[] items;
  private int next = 0;
  public Ex09_SequenceIter(int size) { items = new Object[size]; }
  public void add(Object x) {
    if(next < items.length)
      items[next++] = x;
  }
  private class SequenceIterator implements Iterator<Object> {
    private int i = 0;

    public boolean hasNext() { return i < items.length; }

    public Object next() {
      if (hasNext())
        return items[i++];
      return new Object();
    }
  }

  Iterator<Object> iterator() { return new SequenceIterator(); }

  public static void main(String[] args) {
    Ex09_SequenceIter sequence = new Ex09_SequenceIter(10);

    for(int i = 0; i < 10; i++)
      sequence.add(Integer.toString(i));

    Iterator<Object> iter = sequence.iterator();

    while(iter.hasNext()) {
      System.out.print(iter.next() + " ");
    }
  }
}