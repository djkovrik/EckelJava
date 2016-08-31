/**
 * Stacks are often used to evaluate expressions in programming languages. Using net.mindview.util.Stack,
 * evaluate the following expression, where’+’ means "push the following letter onto the stack," and’-’ means
 * "pop the top of the stack and print it":
 * "+U+n+c---+e+r+t---+a-+i-+n+t+y---+ -+r+u--+l+e+s---"
 */

import net.mindview.util.Stack;
import static net.mindview.util.Print.printnb;

public class Ex15_Evaluate {
    private static Stack<Character> stack = new Stack<>();

    private static void evaluate(String str) {
        char[] array = str.toCharArray();

        for (int i = 0; i < array.length; ) {
            switch (array[i++]) {
                case '+':
                    stack.push(array[i]);
                    break;
                case '-':
                    printnb(stack.pop());
                    break;
            }
        }
    }

    public static void main(String[] args) {
        evaluate("+U+n+c---+e+r+t---+a-+i-+n+t+y---+ -+r+u--+l+e+s---");
    }
}