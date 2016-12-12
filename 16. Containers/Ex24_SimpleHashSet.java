/**
 * Following the example in SimpleHashMap.java, create and test a SimpleHashSet.
 */

import net.mindview.util.Countries;

import java.util.*;

class SimpleHashSet<T> extends AbstractSet<T> {
    static final int SIZE = 997;
    @SuppressWarnings("unchecked")
    LinkedList<T>[] buckets = new LinkedList[SIZE];

    @Override
    public boolean add(T key) {
        int index = Math.abs(key.hashCode()) % SIZE;
        if (buckets[index] == null)
            buckets[index] = new LinkedList<>();

        LinkedList<T> bucket = buckets[index];
        ListIterator<T> it = bucket.listIterator();

        while (it.hasNext())
            if (it.next().equals(key))
                return false;

        it.add(key);
        return true;
    }

    @Override
    public boolean contains(Object key) {
        int index = Math.abs(key.hashCode()) % SIZE;

        if (buckets[index] == null)
            return false;

        Iterator<T> it = buckets[index].iterator();
        while (it.hasNext())
            if (it.next().equals(key))
                return true;
        return false;
    }

    @Override
    public int size() {
        int sz = 0;
        for (LinkedList<T> bucket : buckets) {
            if (bucket != null)
                sz += bucket.size();
        }
        return sz;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int count;
            private boolean removeable;
            private int index1, index2;

            public boolean hasNext() {
                return count < size();
            }

            @Override
            public T next() {
                if (hasNext()) {
                    removeable = true;
                    ++count;
                    for (; ; ) {
                        while (buckets[index1] == null)
                            ++index1;

                        try {
                            return buckets[index1].get(index2++);
                        } catch (IndexOutOfBoundsException e) {

                            ++index1;
                            index2 = 0;
                        }
                    }
                }
                throw new NoSuchElementException();
            }

            @Override
            public void remove() {
                if(removeable) {
                    removeable = false;
                    buckets[index1].remove(--index2);
                    if(buckets[index1].isEmpty())
                        buckets[index1++] = null;
                    --count;
                } else
                    throw new IllegalStateException();
            }
        };
    }

    public static void main(String[] args) {

    }
}

public class Ex24_SimpleHashSet {
    public static void main(String[] args) {
        SimpleHashSet<String> shss = new SimpleHashSet<>();
        shss.addAll(Countries.names(10));
        System.out.println("shss = " + shss);
        System.out.println("size = " + shss.size());
        Iterator<String> iter = shss.iterator();
        System.out.println("iter next = "+ iter.next());
        iter.remove();
        System.out.println("iter next = "+ iter.next());
        System.out.println("shss = " + shss);
        shss.remove("CAMEROON");
        System.out.println("shss = " + shss);
    }
}