import java.util.List;

//: io/OSExecuteDemo.java
// Demonstrates standard I/O redirection.
public class OSExecuteDemo {
  public static void main(String[] args) {
    List<String> result = OSExecute.command("javap OSExecuteDemo");
    for (String s : result) {
      System.out.println(s);
    }
  }
}