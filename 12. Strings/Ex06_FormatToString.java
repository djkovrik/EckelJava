/**
 * Create a class that contains int, long, float and double fields. Create a toString( ) method for this
 * class that uses String.format( ), and demonstrate that your class works correctly.
 */

public class Ex06_FormatToString {
    private int i;
    private long l;
    private float f;
    private double d;

    public Ex06_FormatToString(int i, long l, float f, double d) {
        this.i = i;
        this.l = l;
        this.f = f;
        this.d = d;
    }

    @Override
    public String toString() {
        return String.format("int: %d, long: %d float: %e, double: %f", i, l, f, d);
    }

    public static void main(String[] args) {
        Ex06_FormatToString fts = new Ex06_FormatToString(123, 1L, 123.456f, 654.321);
        System.out.println(fts);
    }
}
