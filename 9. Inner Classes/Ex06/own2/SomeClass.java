package own2;

import own.*;

public class SomeClass {
    protected class Inner implements SomeInterface {
        public Inner() {}
        @Override public void f() { System.out.println("SomeClass.Inner.f()"); }
    }

}
