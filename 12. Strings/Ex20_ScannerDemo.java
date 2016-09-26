/**
 * Create a class that contains int, long, float and double and String fields. Create a constructor for this class
 * that takes a single String argument, and scans that string into the various fields. Add a toString( ) method
 * and demonstrate that your class works correctly.
 */

import java.util.Locale;
import java.util.Scanner;

public class Ex20_ScannerDemo {
    private int a;
    private long b;
    private float c;
    private double d;
    private String str;

    @Override
    public String toString() {
        return "Ex20_ScannerDemo{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                ", str='" + str + '\'' +
                '}';
    }

    public Ex20_ScannerDemo(String arg) {
        Scanner input = new Scanner(arg);
        input.useLocale(Locale.US);

        a = input.nextInt();
        b = input.nextLong();
        c = input.nextFloat();
        d = input.nextDouble();
        str = input.nextLine();
    }

    public static void main(String[] args) {
        Ex20_ScannerDemo sd = new Ex20_ScannerDemo("2 20000000000000000 3.4 5e6 This is some text");
        System.out.println(sd);
    }
}
