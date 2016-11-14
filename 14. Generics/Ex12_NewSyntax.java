/**
 * Repeat the previous exercise using explicit type specification.
 *
 * Test New.java by creating your own classes and ensuring that New will work properly with them.
 */

import net.mindview.util.New;

import java.util.Set;

class MyClass {
    private int id = 0;
    MyClass() {}

    public MyClass(int id) { this.id = id; }

    @Override
    public String toString() {
        return "MyClass{" +
                "id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof MyClass &&
                id == ((MyClass)obj).id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}

public class Ex12_NewSyntax {
    static void fill(Set<MyClass> s, int n) {
        for (int i = 0; i < n; i++ )
            s.add( new MyClass(i) );

        System.out.println(s);
    }

    public static void main(String[] args) {
        Set<MyClass> smc = New.set();
        smc.add( new MyClass(1) );
        smc.add( new MyClass(2) );
        smc.add( new MyClass(3) );
        smc.add( new MyClass(1) );
        System.out.println(smc);

        fill(New.<MyClass>set(), 5);
    }
}
