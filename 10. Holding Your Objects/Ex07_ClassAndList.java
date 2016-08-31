/**
 * Create a class, then make an initialized array of objects of your class. Fill a List from your array.
 * Create a subset of your List by using subList( ), then remove this subset from your List.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static net.mindview.util.Print.print;

class MyClass {
    private static int id;
    private int current = ++id;
    public String toString() { return "MyClass #" + current; }
}

public class Ex07_ClassAndList {
    public static void main(String[] args) {

        MyClass[] array = new MyClass[] {new MyClass(), new MyClass(), new MyClass(), new MyClass()};
        List<MyClass> list = new ArrayList<>(Arrays.asList(array));
        List<MyClass> sub = list.subList(1,3);
        print("List: " + list);
        print("Sublist: " + sub);
        list.removeAll(sub);
        print("Modified list: " + list);
    }
}
