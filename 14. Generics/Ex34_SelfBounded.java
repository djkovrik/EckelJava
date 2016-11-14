/**
 * Create a self-bounded generic type that contains an abstract method that takes an argument of the generic
 * type parameter and produces a return value of the generic type parameter. In a non-abstract method of the
 * class, call the abstract method and return its result. Inherit from the self-bounded type and test the
 * resulting class.
 */

abstract class SBGeneric<T extends SBGeneric<T>> {
    abstract T produce(T arg);
    T test() { return produce(null); }
}

class Concrete extends SBGeneric<Concrete> {
    @Override Concrete produce(Concrete arg) {
        if(arg == null)
            return this;

        return arg;
    }
}

public class Ex34_SelfBounded {
    public static void main(String[] args) {
        Concrete c = new Concrete();
        System.out.println(c == c.test());
    }
}
