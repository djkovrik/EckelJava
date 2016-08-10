/**
 * Modify the solution to Exercise 19 from the Interfaces chapter to use anonymous inner classes.
 *
 * Exercise 19:
 * Create a framework using Factory Methods that performs both coin tossing and dice tossing.
 */

import java.util.Random;

interface Tossing { void toss(); }
interface TossFactory { Tossing getTossType(); }

class Coin implements Tossing {
    private static Random rand = new Random(47);

    @Override
    public void toss() {
        System.out.print("Coin tossing: ");

        if (rand.nextBoolean())
            System.out.println("Heads!");
        else
            System.out.println("Tails!");
    }

    public static TossFactory factory =
            new TossFactory() {
                public Tossing getTossType() { return new Coin(); }
            };
}

class Dice implements Tossing {
    private static Random rand = new Random(47);

    @Override
    public void toss() {
        System.out.print("Dice tossing: ");
        System.out.println( rand.nextInt(6) + 1);
    }

    public static TossFactory factory =
            new TossFactory() {
                public Tossing getTossType() { return new Dice(); }
            };
}

public class Ex17_FrameworkAnon {

    public static void play(TossFactory f) {
        Tossing t = f.getTossType();
        t.toss();
    }

    public static void main(String[] args) {
        play(Coin.factory);
        play(Dice.factory);
    }
}
