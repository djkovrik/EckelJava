/**
 * Following the form of the Coffee example, create a hierarchy of StoryCharacters from your favorite movie, dividing
 * them into GoodGuys and BadGuys. Create a generator for StoryCharacters, following the form of CoffeeGenerator.
 */

import net.mindview.util.Generator;
import java.util.Iterator;
import java.util.Random;

class StoryCharacter {
    private static long counter = 0;
    private final long id = counter++;

    @Override public String toString() {
        return getClass().getSimpleName() + " " + id;
    }
}

class GoodGuy extends StoryCharacter {
    @Override public String toString() {
        return super.toString() + " is a good guy.";
    }
}

class BadGuy extends StoryCharacter {
    @Override public String toString() {
        return super.toString() + " is a bad guy.";
    }
}

class GreatEagle extends GoodGuy {}
class Mearas extends GoodGuy {}
class Oliphaunt extends GoodGuy {}
class Nazgul extends BadGuy {}
class Warg extends BadGuy {}
class Orc extends BadGuy {}

public class Ex08_CharacterGenerator implements Generator<StoryCharacter>, Iterable<StoryCharacter> {
    private Class[] types = { GreatEagle.class, Mearas.class, Oliphaunt.class,Nazgul.class, Warg.class, Orc.class };
    private static Random rand = new Random(47);

    Ex08_CharacterGenerator() {}

    // For Iteration
    private int size = 0;
    Ex08_CharacterGenerator(int size) { this.size = size; }

    public StoryCharacter next() {
        try {
            return (StoryCharacter)
                    types[rand.nextInt(types.length)].newInstance();

        } catch(Exception e) {
            throw new RuntimeException(e);
        }
    }

    class CharacterIterator implements Iterator<StoryCharacter> {
        int count = size;

        public boolean hasNext() { return count > 0; }

        public StoryCharacter next() {
            count--;
            return Ex08_CharacterGenerator.this.next();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public Iterator<StoryCharacter> iterator() {
        return new CharacterIterator();
    }

    public static void main(String[] args) {
        Ex08_CharacterGenerator cg = new Ex08_CharacterGenerator();

        for(int i = 0; i < 6; i++)
            System.out.println(cg.next());

        for(StoryCharacter ch : new Ex08_CharacterGenerator(6))
            System.out.println(ch);
    }
}
