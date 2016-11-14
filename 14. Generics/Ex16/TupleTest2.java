/**
 * Add a SixTuple to Tuple2.java, and test it in TupleTest2 .j ava
 */


public class TupleTest2 {

  static SixTuple<Boolean,Float,String,Integer,Double,Integer> f() {
    return Tuple2.tuple(true, 2.0f, "hi", 47, 11.1, 321);
  }

  public static void main(String[] args) {
    SixTuple<Boolean,Float,String,Integer,Double,Integer> sixt = f();
    System.out.println(sixt);
  }
}
