/**
 * Following the form of BankTeller.java, create an example where BigFish eat LittleFish in the Ocean.
 */

import net.mindview.util.*;
import java.util.*;

class LittleFish {
    private static long counter = 1;
    private final long id = counter++;

    private LittleFish() {}

    @Override public String toString() {
        return "LittleFish{" + "id=" + id + '}';
    }

    public static Generator<LittleFish> generator() {
        return () -> new LittleFish();
    }
}

class BigFish {
    private static long counter = 1;
    private final long id = counter++;

    private BigFish() {}

    @Override public String toString() {
        return "BigFish{" + "id=" + id + '}';
    }

    public static Generator<BigFish> generator =
            () -> new BigFish();
}

public class Ex18_Ocean {
    public static void eat(BigFish bf, LittleFish lf) {
        System.out.println(bf + " eats " + lf);
    }

    public static void main(String[] args) {
        Random rand = new Random(47);
        Queue<LittleFish> horde = new LinkedList<>();
        Generators.fill(horde, LittleFish.generator(), 15);
        List<BigFish> predators = new ArrayList<>();
        Generators.fill(predators, BigFish.generator, 4);
        for(LittleFish lf : horde)
            eat(predators.get(rand.nextInt(predators.size())), lf);
    }
}
