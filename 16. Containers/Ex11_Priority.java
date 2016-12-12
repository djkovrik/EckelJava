/**
 * Create a class that contains an Integer that is initialized to a value between 0 and 100 using java.util.Random.
 * Implement Comparable using this Integer field. Fill a PriorityQueue with objects of your class, and extract the
 * values using poll( ) to show that it produces the expected order.
 */

import java.util.PriorityQueue;
import java.util.Random;

class MyClass implements Comparable<MyClass> {
    private static Random gen = new Random(47);
    private Integer value = gen.nextInt(101);

    @Override
    public String toString() {
        return "MyClass{" +
                "value=" + value +
                '}';
    }

    @Override
    public int compareTo(MyClass other) {
        return value < other.value ? -1 : (value == other.value ? 0 : +1);
    }
}

public class Ex11_Priority {
    public static void main(String[] args) {

        PriorityQueue<MyClass> qmc = new PriorityQueue<>();

        for (int i = 0; i < 10; i++)
            qmc.add(new MyClass());

        MyClass m;

        System.out.println("The whole queue:");
        System.out.println(qmc);

        System.out.println("Extracting...");
        while((m = qmc.poll()) != null)
            System.out.println(m);
    }
}
