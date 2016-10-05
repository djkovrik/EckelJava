/**
 * Use TypeCounter with the RegisteredFactories.java example in this chapter.
 */

import net.mindview.util.TypeCounter;

public class Ex13_TypeCounter {
    public static void main(String[] args) {
        TypeCounter counter = new TypeCounter(Part.class);
        Part p;
        for(int i = 0; i < 10; i++) {
            p = Part.createRandom();
            System.out.print(p.getClass().getSimpleName() + " ");
            counter.count(p);
        }
        System.out.println();
        System.out.println(counter);
    }
}
