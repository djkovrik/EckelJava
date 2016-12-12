/**
 * Compare the performance of Collections.sort( ) between an ArrayList and a LinkedList.
 */

import net.mindview.util.CollectionData;
import net.mindview.util.RandomGenerator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Ex30_ComparePerformance {
    static List<Test<List<Integer>>> tests = new ArrayList<>();

    static {
        tests.add(new Test<List<Integer>>("sorting") {
            int test(List<Integer> list, TestParam tp) {
                for (int i = 0; i < tp.loops; i++) {
                    list.clear();
                    list.addAll(CollectionData.list(new RandomGenerator.Integer(), tp.size));
                    Collections.sort(list);
                }
                return tp.loops;
            }
        });
    }

    static class ListTester extends Tester<List<Integer>> {
        public ListTester(List<Integer> container, List<Test<List<Integer>>> tests) {
            super(container, tests);
        }

        @Override protected List<Integer> initialize(int size){
            container.clear();
            container.addAll(CollectionData.list(
                    new RandomGenerator.Integer(), size));
            return container;
        }

        public static void run(List<Integer> list, List<Test<List<Integer>>> tests) {
            new ListTester(list, tests).timedTest();
        }
    }

    public static void main(String[] args) {
        Tester.defaultParams= TestParam.array(10, 5000, 100, 5000, 1000, 1000);

        ListTester.run(new ArrayList<>(), tests);
        ListTester.run(new LinkedList<>(), tests);
    }
}
