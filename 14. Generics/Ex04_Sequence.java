/**
 * "Generify" innerclasses/Sequence.java.
 */

interface Selector<T> {
  boolean end();
  T current();
  void next();
}	

public class Ex04_Sequence<T> {
  private Object[] items;
  private int next = 0;
  public Ex04_Sequence(int size) { items = new Object[size]; }
  public void add(T x) {
    if(next < items.length)
      items[next++] = x;
  }
  private class SequenceSelector implements Selector<T> {
    private int i = 0;
    public boolean end() { return i == items.length; }
    public T current() { return (T)items[i]; }
    public void next() { if(i < items.length) i++; }
  }
  public Selector<T> selector() {
    return new SequenceSelector();
  }	
  public static void main(String[] args) {
    Ex04_Sequence<String> sequence = new Ex04_Sequence<>(10);
    for(int i = 0; i < 10; i++)
      sequence.add(Integer.toString(i));
    Selector<String> selector = sequence.selector();
    while(!selector.end()) {
      System.out.print(selector.current() + " ");
      selector.next();
    }
  }
}
