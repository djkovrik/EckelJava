/**
 * Instead of implementing an interface, make next( ) a static method. What are the benefits and drawbacks of this approach?
 */

import java.util.Random;

enum CartoonCharacter {
  SLAPPY, SPANKY, PUNCHY, SILLY, BOUNCY, NUTTY, BOB;
  private static Random rand = new Random(47);
  public static CartoonCharacter next() {
    return values()[rand.nextInt(values().length)];
  }
}

public class Ex02_EnumImplementation {
  public static void printNext() {
    System.out.print(CartoonCharacter.next() + ", ");
  }
  public static void main(String[] args) {
    // Choose any instance:
    CartoonCharacter cc = CartoonCharacter.BOB;
    for(int i = 0; i < 10; i++)
      printNext();
  }
}