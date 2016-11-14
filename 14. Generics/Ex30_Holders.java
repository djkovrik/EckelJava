/**
 * Create a Holder for each of the primitive wrapper types, and show that autoboxing and autounboxing
 * works for the set( ) and get( ) methods of each instance.
 */

class Holder<T> {
    private T value;
    Holder() {}
    Holder(T val) { value = val; }
    void set(T val) { value = val; }
    T get() { return value; }
}

public class Ex30_Holders {
    public static void main(String[] args) {

        Holder<Integer> hi = new Holder<>();
        hi.set(123);
        int i = hi.get();
        System.out.println("Integer: i = " + i);

        Holder<Short> hs = new Holder<>();
        hs.set((short)321);
        short s = hs.get();
        System.out.println("Short: s = " + s);

        Holder<Long> hl = new Holder<>();
        hl.set(1000000L);
        long l = hl.get();
        System.out.println("Long: l = " + l);

        Holder<Byte> hbt = new Holder<>();
        hbt.set((byte)1);
        int bt = hbt.get();
        System.out.println("Byte: b = " + bt);

        Holder<Float> hf = new Holder<>();
        hf.set(1.23f);
        float f = hf.get();
        System.out.println("Float: f = " + f);

        Holder<Double> hd = new Holder<>();
        hd.set(3.21);
        double d = hd.get();
        System.out.println("Double: d = " + d);

        Holder<Boolean> hb = new Holder<>();
        hb.set(false);
        boolean b = hb.get();
        System.out.println("Boolean: b = " + b);
    }
}
