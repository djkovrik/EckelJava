/**
 * For each of the basic conversion types in the above table, write the most complex formatting expression possible.
 * That is, use all the possible format specifiers available for that conversion type.
 */

import java.util.Formatter;

public class Ex05_Conversions {
    public static void main(String[] args) {
        Formatter f = new Formatter(System.out);

        char u = 'z';
        System.out.println("char u = 'z'");
        f.format("b: %1$-10b\n", u);
        f.format("h: %1$-10h\n", u);
        f.format("s: %1$-10s\n", u);
        f.format("c: %1$-10c\n", u);

        int i = 123;
        System.out.println("\ni = 123");
        f.format("b: %1$-10.10b\n", i);
        f.format("h: %1$-10.10h\n", i);
        f.format("s: %1$-10.10s\n", i);
        f.format("d: %1$-+10d\n", i);
        f.format("o: %1$#o\n", i);
        f.format("x: %x\n", i);

        double d = 123.456;
        System.out.println("\nd = 123.456");
        f.format("b: %-10.10b\n", d);
        f.format("h: %-10.10h\n", d);
        f.format("s: %-10.10s\n", d);
        f.format("e: %-+#10.10e\n", d);
        f.format("f: %-+,#10.10f\n", d);
        f.format("g: %-+,10.10g\n", d);
        f.format("a: %-+#10.10a\n", d);

    }
}
