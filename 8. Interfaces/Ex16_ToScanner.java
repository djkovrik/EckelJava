/**
 * Create a class that produces a sequence of chars. Adapt this class so that it can be an input to a Scanner object.
 */

import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

public class Ex16_ToScanner implements Readable {
    private static Random rand = new Random(47);
    private static final char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    private int count;
    Ex16_ToScanner(int count) { this.count = count; }


    @Override
    public int read(CharBuffer cb) {

        if (count-- == 0)
            return -1;

        for (int i = 0; i < 10; i++) {
            cb.append(alphabet[ rand.nextInt(alphabet.length) ]);
        }
        cb.append(" ");
        return 10;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner( new Ex16_ToScanner(5) );
        while (s.hasNext())
            System.out.println(s.next());
    }
}
