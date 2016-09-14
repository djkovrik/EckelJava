/**
 * Modify all the exception types in Stormylnning.java so that they extend RuntimeException, and show that
 * no exception specifications or try blocks are necessary. Remove the ‘//!’ comments and show how the methods
 * can be compiled without specifications.
 */

class BaseballException extends RuntimeException {}
class Foul extends BaseballException {}
class Strike extends BaseballException {}

abstract class Inning {
  public Inning() throws BaseballException {}
  public void event() throws BaseballException {}
  public abstract void atBat() throws Strike, Foul;
  public void walk() {}
}

class StormException extends RuntimeException {}
class RainedOut extends StormException {}
class PopFoul extends Foul {}

interface Storm {
  public void event() throws RainedOut;
  public void rainHard() throws RainedOut;
}

public class Ex29_StormyInning extends Inning implements Storm {
  public Ex29_StormyInning() throws RainedOut, BaseballException {}
  public Ex29_StormyInning(String s) throws Foul, BaseballException {}

  public void rainHard() throws RainedOut {}
  public void event() {}
  public void atBat() throws PopFoul {}

  public static void main(String[] args) {
      Ex29_StormyInning si = new Ex29_StormyInning();
      si.atBat();
  }
}
