/**
 * In Beetle.java, inherit a specific type of beetle from class Beetle, following
 * the same format as the existing classes. Trace and explain the output.
 */

import static net.mindview.util.Print.*;

class Insect {
    private int i = 9;
    protected int j;
    Insect() {
        print("i = " + i + ", j = " + j);
        j = 39;
    }
    private static int x1 =
            printInit("static Insect.x1 initialized");
    static int printInit(String s) {
        print(s);
        return 47;
    }
}

class Beetle extends Insect {
    private int k = printInit("Beetle.k initialized");
    public Beetle() {
        print("k = " + k);
        print("j = " + j);
    }
    private static int x2 =
            printInit("static Beetle.x2 initialized");
    public static void main(String[] args) {
        print("Beetle constructor");
        Beetle b = new Beetle();
    }
}

public class Ex24_AnotherBeetle extends Beetle {
    private int k = printInit("Ex24_AnotherBeetle.k initialized");
    public Ex24_AnotherBeetle() {
        print("k = " + k);
        print("j = " + j);
    }
    private static int x3 =
            printInit("static Ex24_AnotherBeetle.x3 initialized");

    public static void main(String[] args) {
        print("Ex24_AnotherBeetle constructor");
        Ex24_AnotherBeetle b = new Ex24_AnotherBeetle();
    }
}
