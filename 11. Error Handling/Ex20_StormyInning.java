/**
 * Modify StormyInning.java by adding an UmpireArgument exception type and methods that throw this exception.
 * Test the modified hierarchy.
 */

class BaseballException extends Exception {}
class Foul extends BaseballException {}
class Strike extends BaseballException {}
class UmpireArgument extends BaseballException {}

abstract class Inning {
  public Inning() throws BaseballException {}
  public void event() throws BaseballException {}
  public abstract void atBat() throws Strike, Foul, UmpireArgument;
  public void walk() {}
}

class StormException extends Exception {}
class RainedOut extends StormException {}
class PopFoul extends Foul {}

interface Storm {
  public void event() throws RainedOut;
  public void rainHard() throws RainedOut;
}

public class Ex20_StormyInning extends Inning implements Storm {
  public Ex20_StormyInning()
    throws RainedOut, BaseballException {}
  public Ex20_StormyInning(String s)
    throws Foul, BaseballException {}

  public void rainHard() throws RainedOut {}
  public void event() {}
  public void atBat() throws PopFoul, UmpireArgument { newMethod(); }

  public void newMethod() throws UmpireArgument {
    throw new UmpireArgument();
  }

  public static void main(String[] args) {
    try {
      Ex20_StormyInning si = new Ex20_StormyInning();
      si.atBat();
    } catch (UmpireArgument e) {
      System.out.println("Umpire Argument");
    } catch(PopFoul e) {
      System.out.println("Pop foul");
    } catch(RainedOut e) {
      System.out.println("Rained out");
    } catch(BaseballException e) {
      System.out.println("Generic baseball exception");
    }
  }
}
