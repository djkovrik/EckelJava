/**
 * Prove that all the methods in an interface are automatically public.
 */

import somepackage.Base;

class Derived implements Base {
    @Override public void method1() {}
    @Override public void method2() {}
    @Override public void method3() {}

    //@Override void method1() {}
    //@Override void method2() {}
    //@Override void method3() {}
    //!ERRORS:
    //!methodX() in Derived cannot implement methodX() in somepackage.Base
    //!attempting to assign weaker access privileges; was public
}

public class Ex06_AutoPublic {

    public static void main(String[] args) { }
}
