/**
 * Write a program to determine whether an array of char is a primitive type or a true Object.
 */

public class Ex10_CharCheck {
    public static void main(String[] args) {
        char[] array = "Hello, World!".toCharArray();

        System.out.println(array.getClass());
    }
}
