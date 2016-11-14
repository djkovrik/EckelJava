/**
 * Verify this:
 * Notice that f( ) returns a parameterized TwoTuple object, while f2( ) returns an unparameterized TwoTuple object.
 * The compiler doesn’t warn about f2( ) in this case because the return value is not being used in a parameterized
 * fashion; in a sense, it is being "upcast" to an unparameterized TwoTuple. However, if you were to try to capture
 * the result of f2( ) into a parameterized TwoTuple, the compiler would issue a warning.
 */

import net.mindview.util.TwoTuple;
import static net.mindview.util.Tuple.tuple;


public class Ex15_Test {
    static TwoTuple<String,Integer> f() {
        return tuple("hi", 47);
    }
    static TwoTuple f2() { return tuple("hi", 48); }


    public static void main(String[] args) {
        TwoTuple<String,Integer> ttsi = f();
        System.out.println(ttsi);
        System.out.println(f2());
        TwoTuple<String, Integer> si = f2();
    }
}
