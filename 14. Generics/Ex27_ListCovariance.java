/**
 * Show that covariance doesn’t work with Lists, using Numbers and Integers, then introduce wildcards.
 */

import java.util.ArrayList;
import java.util.List;

public class Ex27_ListCovariance {
    public static void main(String[] args) {
        //!Error: incompatible types
        //List<Number> ln = new ArrayList<Integer>();

        // No errors here
        List<? extends Number> ln = new ArrayList<Integer>();

        // Can't add this
        //ln.add( new Integer(1) );
        //ln.add(2.3);
        
        ln.add(null);
    }
}
