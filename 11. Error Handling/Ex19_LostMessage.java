/**
 * Repair the problem in LostMessage.java by guarding the call in the finally clause.
 */

class VeryImportantException extends Exception {
  public String toString() {
    return "A very important exception!";
  }
}

class HoHumException extends Exception {
  public String toString() {
    return "A trivial exception";
  }
}

public class Ex19_LostMessage {
  void f() throws VeryImportantException {
    throw new VeryImportantException();
  }
  void dispose() throws HoHumException {
    throw new HoHumException();
  }
  public static void main(String[] args) {
    try {
      Ex19_LostMessage lm = new Ex19_LostMessage();
      try {
        lm.f();
      } finally {
        try {
          lm.dispose();
        } catch (HoHumException e) {
          System.out.println(e);
        }
      }
    } catch(Exception e) {
      System.out.println(e);
    }
  }
}