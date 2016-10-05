/**
 * A constructor is a kind of factory method. Modify RegisteredFactories.java so that instead of using an explicit
 * factory, the class object is stored in the List, and newlnstance( ) is used to create each object.
 */

import java.util.Arrays;
import java.util.List;
import java.util.Random;

class Part {
  public String toString() {
    return getClass().getSimpleName();
  }

  static List<Class<? extends Part>> partFactories =
          Arrays.asList(FuelFilter.class, AirFilter.class, CabinAirFilter.class,
          OilFilter.class, FanBelt.class, GeneratorBelt.class, PowerSteeringBelt.class);

  private static Random rand = new Random(47);
  public static Part createRandom() {
    int n = rand.nextInt(partFactories.size());
    try {
      return partFactories.get(n).newInstance();
    } catch (InstantiationException | IllegalAccessException e) {
      throw new RuntimeException(e);
    }
  }
}	

class Filter extends Part {}
class FuelFilter extends Filter {}
class AirFilter extends Filter {}
class CabinAirFilter extends Filter {}
class OilFilter extends Filter {}

class Belt extends Part {}
class FanBelt extends Belt {}
class GeneratorBelt extends Belt {}
class PowerSteeringBelt extends Belt {}

public class RegisteredFactories {
  public static void main(String[] args) {
    for(int i = 0; i < 10; i++)
      System.out.println(Part.createRandom());
  }
}
