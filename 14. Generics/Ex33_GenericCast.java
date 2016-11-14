/**
 * Repair GenericCast.java using an ArrayList.
 */

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

class FullStackException extends RuntimeException {}

class FixedSizeStack<T> {
  private int index = 0;
  private final int size;
  private final List<T> storage;

  FixedSizeStack(int size) {
    storage = new ArrayList<>(size);
    this.size = size;
  }

   void push(T item) {

     if(index < size) {
       storage.add(item);
       index++;
     } else
       throw new FullStackException();
   }

   T pop() {

     if(index > 0) {
       return storage.get(--index);
     }

     throw new EmptyStackException();
   }
}	

public class Ex33_GenericCast {
  public static final int SIZE = 10;
  public static void main(String[] args) {
    FixedSizeStack<String> strings =
      new FixedSizeStack<String>(SIZE);
    for(String s : "A B C D E F G H I J".split(" "))
      strings.push(s);

    try {
      strings.push("Z");
    } catch (FullStackException e) {
      System.out.println("Stack is full!");
    }

    for(int i = 0; i < SIZE ; i++) {
        String s = strings.pop();
        System.out.print(s + " ");
      }
    System.out.println();

    try {
      String temp = strings.pop();
    } catch (EmptyStackException e) {
      System.out.println("Stack is empty!");
    }
  }
}