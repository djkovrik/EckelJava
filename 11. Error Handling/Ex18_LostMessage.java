/**
 * Add a second level of exception loss to LostMessage.java so that the HoHumException is itself replaced by a third exception.
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

class AnotherException extends Exception {
  public String toString() {
    return "Less important exception";
  }
}

public class Ex18_LostMessage {
  void f() throws VeryImportantException {
    throw new VeryImportantException();
  }
  void dispose() throws HoHumException {
    throw new HoHumException();
  }

  void foo() throws AnotherException {
    throw new AnotherException();
  }

  public static void main(String[] args) {
    try {
      Ex18_LostMessage lm = new Ex18_LostMessage();
      try {
        try {
          lm.f();
        } finally {
          lm.dispose();
        }
      } finally {
        lm.foo();
      }
    }
    catch(Exception e) {
      System.out.println(e);
    }
  }
}