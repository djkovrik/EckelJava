/**
 * Create a class with an int field that’s initialized from a constructor argument. Create two arrays of these objects,
 * using identical initialization values for each array, and show that Arrays.equals( ) says that they are unequal.
 * Add an equals( ) method to your class to fix the problem.
 */

import java.util.Arrays;

class TestClass {
    private int value;

    public TestClass(int value) {
        this.value = value;
    }
/*
    @Override
    public boolean equals(Object obj) {
        return obj instanceof TestClass && value == ((TestClass)obj).value;
    }
*/
}

public class Ex19_Equals {
    public static void main(String[] args) {
        TestClass[] t1 = { new TestClass(1), new TestClass(2), new TestClass(3)};
        TestClass[] t2 = { new TestClass(1), new TestClass(2), new TestClass(3)};

        System.out.println("Are arrays equals: " + Arrays.equals(t1, t2));
    }
}
