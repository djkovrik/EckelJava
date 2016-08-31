/**
 * Modify Ex30_CollectionSequence.java so that it does not inherit from AbstractCollection, but instead implements Collection.
 */

//: holding/Ex30_CollectionSequence.java
import pets.*;
import java.util.*;

class CollectionSequence implements Collection<Pet> {
  private Pet[] pets = Pets.createArray(8);

  static void display(Iterator<Pet> it) {
    while(it.hasNext()) {
      Pet p = it.next();
      System.out.print(p.id() + ":" + p + " ");
    }
    System.out.println();
  }

  static void display(Collection<Pet> pets) {
    for(Pet p : pets)
      System.out.print(p.id() + ":" + p + " ");
    System.out.println();
  }

  public int size() { return pets.length; }

  public Iterator<Pet> iterator() {
    return new Iterator<Pet>() {
      private int index = 0;
      public boolean hasNext() {
        return index < pets.length;
      }
      public Pet next() { return pets[index++]; }
      public void remove() {
        throw new UnsupportedOperationException();
      }
    };
  }

  @Override public Object[] toArray() {
    Object[] result = new Object[pets.length];
    System.arraycopy(pets, 0, result, 0, pets.length);
    return result;
  }

  @Override public boolean contains(Object o) {
    if(o == null) {
      return false;
    }
    for(int i = 0; i < pets.length; i++)
      if(o.equals(pets[i])) {
        return true;
      }
    return false;
  }

  @Override
  public boolean isEmpty() {
    return pets.length == 0;
  }

  @Override public int hashCode() { throw new UnsupportedOperationException(); }
  @Override public void clear() { throw new UnsupportedOperationException(); }
  @Override public <T> T[] toArray(T[] a) { throw new UnsupportedOperationException(); }
  @Override public boolean add(Pet pet) { throw new UnsupportedOperationException(); }
  @Override public boolean remove(Object ot) { throw new UnsupportedOperationException(); }
  @Override public boolean removeAll(Collection<?> c) { throw new UnsupportedOperationException(); }
  @Override public boolean retainAll(Collection<?> c) { throw new UnsupportedOperationException(); }
  @Override public boolean containsAll(Collection<?> c) { throw new UnsupportedOperationException(); }
  @Override public boolean equals(Object o) { throw new UnsupportedOperationException(); }
  @Override public boolean addAll(Collection<? extends Pet> c) { throw new UnsupportedOperationException(); }
}


class Ex30_CollectionSequence {

  public static void main(String[] args) {
    CollectionSequence c = new CollectionSequence();
    InterfaceVsIterator.display(c);
    InterfaceVsIterator.display(c.iterator());
  }
}