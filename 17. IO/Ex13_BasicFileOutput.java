/**
 * Modify BasicFileOutput.java so that it uses LineNumberReader to keep track of the line count. Note that it’s much
 * easier to just keep track programmatically.
 */

import java.io.*;

public class Ex13_BasicFileOutput {
  static String file = "Ex13_BasicFileOutput.out";
  public static void main(String[] args)
  throws IOException {
    LineNumberReader in = new LineNumberReader(new FileReader("src\\Ex13_BasicFileOutput.java"));
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file)));
    
    String s;

    while((s = in.readLine()) != null )
      out.println(in.getLineNumber() + ": " + s);
    out.close();

    System.out.println(BufferedInputFile.read(file));
  }
}
