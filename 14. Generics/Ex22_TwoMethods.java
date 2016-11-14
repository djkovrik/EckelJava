/**
 * Use a type tag along with reflection to create a method that uses the argument version of newInstance( )
 * to create an object of a class with a constructor that has arguments.
 */
import java.lang.reflect.*;

class ClassAsFactory<T> {
    Class<T> kind;
    ClassAsFactory(Class<T> kind) { this.kind = kind; }
    T create(int arg) {
        try {
            for(Constructor<?> ctor : kind.getConstructors()) {
                Class<?>[] params = ctor.getParameterTypes();
                if (params.length == 1)
                    if (params[0] == int.class)
                        return kind.cast(ctor.newInstance(arg));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return null;
    }
}

class Employee {}

public class Ex22_TwoMethods {
    public static void main(String[] args) {

        ClassAsFactory<Employee> cfe = new ClassAsFactory<>(Employee.class);
        Employee e = cfe.create(1);

        if(e == null)
            System.out.println("Can't create Employee!");

        ClassAsFactory<Integer> cfi = new ClassAsFactory<>(Integer.class);
        Integer i = cfi.create(0);

        if(i == null)
            System.out.println("Can't create Integer!");
    }
}
