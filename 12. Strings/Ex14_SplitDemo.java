/**
 * Rewrite SplitDemo using String.split( ).
 */

import java.util.Arrays;

public class Ex14_SplitDemo {
  public static void main(String[] args) {
    String input = "This!!unusual use!!of exclamation!!points";
    /*
    print(Arrays.toString(
      Pattern.compile("!!").split(input)));

    print(Arrays.toString(
      Pattern.compile("!!").split(input, 3)));
    */

    System.out.println(Arrays.toString(input.split("!!")));
    System.out.println(Arrays.toString(input.split("!!", 3)));

  }
}