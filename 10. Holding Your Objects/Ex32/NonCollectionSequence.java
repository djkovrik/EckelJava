/**
 * Following the example of MultilterableClass, add reversed( ) and randomized( ) methods to NonCollectionSequence.java,
 * as well as making NonCollectionSequence implement Iterable, and show that all the approaches work in foreach statements.
 */

//: holding/NonCollectionSequence.java
import pets.*;
import java.util.*;

class PetSequence {
  protected Pet[] pets = Pets.createArray(8);
}

public class NonCollectionSequence extends PetSequence implements Iterable<Pet> {
  public Iterable<Pet> reversed() {
      return () -> new Iterator<Pet>() {
      int current = pets.length - 1;
      @Override public Pet next() { return pets[current--]; }
      @Override public boolean hasNext() { return current > -1; }
      @Override public void remove() { throw new UnsupportedOperationException(); }
    };
  }

  public Iterable<Pet> randomized() {
      return () -> {
      List<Pet> sh = new ArrayList<>(Arrays.asList(pets));
      Collections.shuffle(sh, new Random(47));
      return sh.iterator();
    };
  }

  @Override public Iterator<Pet> iterator() {
    return new Iterator<Pet>() {
      private int index = 0;
      @Override public boolean hasNext() { return index < pets.length; }
      @Override public Pet next() { return pets[index++]; }
      @Override public void remove() { throw new UnsupportedOperationException(); }
    };
  }

  public static void main(String[] args) {
    NonCollectionSequence c = new NonCollectionSequence ();
    for(Pet pet : c.reversed()) {
      System.out.print(pet + " ");
    }
    System.out.println();

    for(Pet pet : c.randomized()) {
      System.out.print(pet + " ");
    }
    System.out.println();

    for(Pet pet : c) {
      System.out.print(pet + " ");
    }
  }
}
