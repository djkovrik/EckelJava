/**
 * Using SlowMap.java for inspiration, create a SlowSet.
 */

import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex18_SlowSet<T> extends AbstractSet<T> {
    private List<T> keys = new ArrayList<>();

    @Override
    public Iterator<T> iterator() {
        return keys.iterator();
    }

    @Override
    public int size() {
        return keys.size();
    }

    @Override
    public boolean add(T t) {
        if(!contains(t)) {
            keys.add(t);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Ex18_SlowSet<String> sss = new Ex18_SlowSet<>();

        sss.add("one");
        sss.add("two");
        sss.add("three");
        sss.add("four");
        sss.add("one");
        sss.add("two");
        sss.add("three");
        sss.add("four");

        System.out.println(sss);
    }
}
