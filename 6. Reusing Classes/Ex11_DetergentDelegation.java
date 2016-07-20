/**
 * Modify Detergent.java so that it uses delegation.
 */

import static net.mindview.util.Print.*;

class Cleanser {
    private String s = "Cleanser";
    public void append(String a) { s += a; }
    public void dilute() { append(" dilute()"); }
    public void apply() { append(" apply()"); }
    public void scrub() { append(" scrub()"); }
    public String toString() { return s; }
    public static void main(String[] args) {
        Cleanser x = new Cleanser();
        x.dilute(); x.apply(); x.scrub();
        print(x);
    }
}

public class Ex11_DetergentDelegation {

    private Cleanser cleanser = new Cleanser();

    // Delegated methods:
    public void append(String a) { cleanser.append(a); }
    public void dilute() { cleanser.dilute(); }
    public void apply() {cleanser.apply(); }
    public void scrub() { cleanser.scrub(); }
    public String toString() { return cleanser.toString(); }

    //New method:
    public void foam() { append(" foam()"); }

    public static void main(String[] args) {
        Ex11_DetergentDelegation dd = new Ex11_DetergentDelegation();
        dd.dilute();
        dd.apply();
        dd.scrub();
        dd.foam();
        print(dd);
        print("Testing base class:");
        Cleanser.main(args);
    }
}