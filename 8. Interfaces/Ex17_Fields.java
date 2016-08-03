/**
 * Prove that the fields in an interface are implicitly static and final.
 */

interface Test {
    int x = 123;
}

public class Ex17_Fields {

    public static void main(String[] args) {

        System.out.println(Test.x);
        //!Test.x = 321;
        //!Cannon asign a value to final variable x
    }
}
