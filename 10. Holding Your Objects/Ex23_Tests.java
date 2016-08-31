/**
 * Starting with Statistics.java, create a program that runs the test repeatedly and looks to see
 * if any one number tends to appear more than the others in the results.
 */

import java.util.*;

public class Ex23_Tests {
    private Random rand = new Random(47);
    private static final int limit = 100;

    static void runTest() {
        Random rand = new Random();

        Map<Integer,Integer> mii = new HashMap<>();

        for(int i = 0; i < 1000000; i++) {
            int r = rand.nextInt(limit);
            Integer freq = mii.get(r);
            mii.put(r, freq == null ? 1 : freq + 1);
        }

        int maxValue = 0;
        int maxKey = 0;
        int temp;

        for (int i = 0; i < limit; i++ ) {
            temp = mii.get(i);

            if (temp >= maxValue) {
                maxValue = temp;
                maxKey = i;
            }
        }
        System.out.println("Value " + maxKey + " appears " + mii.get(maxKey) + " times." );
    }

    public static void main(String[] args) {
        runTest();
        runTest();
        runTest();
        runTest();
    }
}
