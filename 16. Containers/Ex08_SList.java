import java.util.NoSuchElementException;

/**
 * Create a generic, singly linked list class called SList, which, to keep things simple, does not implement the List
 * interface. Each Node object in the list should contain a reference to the next element in the list, but not the
 * previous one (LinkedList, in contrast, is a doubly linked list, which means it maintains links in both directions).
 * Create your own SListIterator which, again for simplicity, does not implement ListIterator. The only method in
 * SList other than toString( ) should be iterator( ), which produces an SListIterator. The only way to insert and
 * remove elements from an SList is through SListIterator. Write code to demonstrate SList.
 */

interface SListIterator<T> {
    boolean hasNext();
    T next();
    void remove();
    void add(T element);
}

public class Ex08_SList<T> {

    private final Node<T> header = new Node<>(null, null);

    private class Node<U> {
        U element;
        Node<U> next;

        public Node(U element, Node<U> next) {
            this.element = element;
            this.next = next;
        }
    }

    private class SListIteratorImpl implements SListIterator<T> {
        private Node<T> lastReturned = header;
        private Node<T> next;

        SListIteratorImpl() { next = header.next; }
        public boolean hasNext() { return next != header; }

        public T next() {
            if(next == header) {
                throw new NoSuchElementException();
            }
            lastReturned = next;
            next = next.next;
            return lastReturned.element;
        }

        public void remove() {
            if(lastReturned == header)
                throw new IllegalStateException();

            for(Node<T> curr = header; ; curr = curr.next) {
                if (curr.next == lastReturned) {
                    curr.next = lastReturned.next;
                    break;
                }
            }
            lastReturned = header;
        }

        public void add(T element) {
            lastReturned = header;
            Node<T> newLink = new Node<>(element, next);
            if (header.next == header)
                header.next = newLink;
            else {
                for (Node<T> curr = header; ; curr = curr.next)
                    if (curr.next == next) {
                        curr.next = newLink;
                        break;
                    }
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder text = new StringBuilder();
        text.append("[");
        for(SListIterator<T> it = iterator(); it.hasNext();) {
            T element = it.next();
            text.append(element == this ? "(this SList)" :
                    String.valueOf(element));
            if(it.hasNext())
                text.append(", ");
        }
        text.append("]");
        return text.toString();
    }

    public SListIterator<T> iterator() {
        return new SListIteratorImpl();
    }

    public Ex08_SList() {
        header.next = header;
    }

    public static void main(String[] args) {
        Ex08_SList<String> sls = new Ex08_SList<>();
        SListIterator<String> iter = sls.iterator();
        iter.add("one");
        iter.add("two");
        iter.add("three");
        iter.add("four");
        iter.add("five");
        System.out.println(sls);

        System.out.println("Printing with iterator...");
        for(SListIterator<String> iter2 = sls.iterator(); iter2.hasNext();) {
            System.out.print(iter2.next() + " ");
        }

        System.out.println("\nRemoving an element...");
        iter = sls.iterator();
        System.out.println(iter.next());
        iter.remove();
        System.out.println(sls);
    }
}
