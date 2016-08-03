/**
 * Create a framework using Factory Methods that performs both coin tossing and dice tossing.
 */

import java.util.Random;

interface Tossing { void toss(); }

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
}

class Dice implements Tossing {
    private static Random rand = new Random(47);

    @Override
    public void toss() {
        System.out.print("Dice tossing: ");
        System.out.println( rand.nextInt(6) + 1);
    }
}

interface TossFactory { Tossing getTossType(); }

class CoinFactory implements TossFactory {
    @Override public Tossing getTossType() { return new Coin(); }
}

class DiceFactory implements TossFactory {
    @Override public Tossing getTossType() { return new Dice(); }
}

public class Ex19_Framework {

    public static void play(TossFactory f) {
        Tossing t = f.getTossType();
        t.toss();
    }

    public static void main(String[] args) {

        play(new CoinFactory());
        play(new DiceFactory());
    }
}
