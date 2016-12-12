/**
 * Create a container that encapsulates an array of String, and that only allows adding Strings and getting Strings,
 * so that there are no casting issues during use. If the internal array isn’t big enough for the next add, your
 * container should automatically resize it. In main( ), compare the performance of your container with an
 * ArrayList<String>.
 */

import java.util.ArrayList;
import java.util.List;

class MyStringContainer {
    private static final int INCREMENT = 255;
    private String[] array;
    private int index;

    public MyStringContainer() {
        array = new String[10];
    }

    public MyStringContainer(int size) {
        array = new String[size];
    }

    public void add(String s) {
        if (index >= array.length) {
            String[] temp = new String[array.length + INCREMENT];

            for (int i = 0; i < array.length; i++)
                temp[i] = array[i];

            index = array.length;
            array = temp;
        }

        array[index++] = s;
    }

    public String get(int i) {
        return array[i];
    }

    public int size() {
        return index;
    }


}

public class Ex31_StringContainer {
    static final int ITERATIONS = 1000;
    static List<Test<List<String>>> listTest = new ArrayList<>();
    static List<Test<MyStringContainer>> myContainerTest = new ArrayList<>();

    static {
        listTest.add(new Test<List<String>>("add and get") {
            int test(List<String> list, TestParam tp) {
                for(int i = 0; i < ITERATIONS; i++) {
                    list.add(Integer.toString(i));
                    list.get(i);
                }
                return ITERATIONS;
            }
        });

        myContainerTest.add(new Test<MyStringContainer>("add and get") {
            int test(MyStringContainer sc, TestParam tp) {
                for(int i = 0; i < ITERATIONS; i++) {
                    sc.add(Integer.toString(i));
                    sc.get(i);
                }
                return ITERATIONS;
            }
        });
    }

    public static void main(String[] args) {
        Tester.defaultParams = TestParam.array(ITERATIONS, 1);
        Tester.run(new ArrayList<>(ITERATIONS), listTest);
        Tester.run(new MyStringContainer(ITERATIONS), myContainerTest);
    }
}