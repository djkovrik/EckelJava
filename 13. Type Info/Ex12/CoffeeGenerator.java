/**
 * Use TypeCounter with the CoffeeGenerator.java class in the Generics chapter.
 */

import net.mindview.util.Generator;
import net.mindview.util.TypeCounter;

import java.util.Iterator;
import java.util.Random;

public class CoffeeGenerator
implements Generator<Coffee>, Iterable<Coffee> {
  private Class[] types = { Latte.class, Mocha.class,
    Cappuccino.class, Americano.class, Breve.class, };
  private static Random rand = new Random(47);
  public CoffeeGenerator() {}
  // For iteration:
  private int size = 0;
  public CoffeeGenerator(int sz) { size = sz; }
  public Coffee next() {
    try {
      return (Coffee)
        types[rand.nextInt(types.length)].newInstance();

    } catch(Exception e) {
      throw new RuntimeException(e);
    }
  }
  class CoffeeIterator implements Iterator<Coffee> {
    int count = size;
    public boolean hasNext() { return count > 0; }
    public Coffee next() {
      count--;
      return CoffeeGenerator.this.next();
    }
    public void remove() { // Not implemented
      throw new UnsupportedOperationException();
    }
  };	
  public Iterator<Coffee> iterator() {
    return new CoffeeIterator();
  }
  public static void main(String[] args) {

    TypeCounter counter = new TypeCounter(Coffee.class);

    CoffeeGenerator gen = new CoffeeGenerator();
    for(int i = 0; i < 10; i++) {
      Coffee c = gen.next();
      counter.count(c);
      System.out.print(c.getClass().getSimpleName() + " ");
    }
    System.out.println();
    System.out.println(counter);
  }
}