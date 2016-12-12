/**
 * Repeat the previous exercise for a container of int, and compare the performance to an ArrayList<Integer>.
 * In your performance comparison, include the process of incrementing each object in the container.
 * <p>
 * Create a container that encapsulates an array of String, and that only allows adding Strings and getting Strings,
 * so that there are no casting issues during use. If the internal array isn’t big enough for the next add, your
 * container should automatically resize it. In main( ), compare the performance of your container with an
 * ArrayList<String>.
 */

import java.util.ArrayList;
import java.util.List;

class MyIntContainer {
    private static final int INCREMENT = 255;
    private Integer[] array;
    private int index;

    public MyIntContainer() {
        array = new Integer[10];
    }

    public MyIntContainer(int size) {
        array = new Integer[size];
    }

    public void add(Integer n) {
        if (index >= array.length) {
            Integer[] temp = new Integer[array.length + INCREMENT];

            for (int i = 0; i < array.length; i++)
                temp[i] = array[i];

            index = array.length;
            array = temp;
        }

        array[index++] = n;
    }

    public Integer get(int i) {
        return array[i];
    }

    public void set(int i, int val) {
        array[i] = val;
    }

    public int size() {
        return index;
    }


}

public class Ex32_IntContainer {
    static final int ITERATIONS = 1000;
    static List<Test<List<Integer>>> listTest = new ArrayList<>();
    static List<Test<MyIntContainer>> myContainerTest = new ArrayList<>();

    static {
        listTest.add(new Test<List<Integer>>("add and get") {
            int test(List<Integer> list, TestParam tp) {
                for (int i = 0; i < ITERATIONS; i++) {
                    list.add(i);
                    list.set(i, list.get(i) + 1);
                }
                return ITERATIONS;
            }
        });

        myContainerTest.add(new Test<MyIntContainer>("add and get") {
            int test(MyIntContainer sc, TestParam tp) {
                for (int i = 0; i < ITERATIONS; i++) {
                    sc.add(i);
                    sc.get(i);
                }
                return ITERATIONS;
            }
        });
    }

    public static void main(String[] args) {
        Tester.defaultParams = TestParam.array(ITERATIONS, 1);
        Tester.run(new ArrayList<>(ITERATIONS), listTest);
        Tester.run(new MyIntContainer(ITERATIONS), myContainerTest);
    }
}