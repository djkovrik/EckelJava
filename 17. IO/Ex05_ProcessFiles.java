import net.mindview.util.Directory;

import java.io.*;

public class Ex05_ProcessFiles {
  public interface Strategy {
    void process(File file);
  }
  private Strategy strategy;
  private String regex;
  public Ex05_ProcessFiles(Strategy strategy, String regex) {
    this.strategy = strategy;
    this.regex = regex;
  }
  public void start(String[] args) {
    try {
      if(args.length == 0)
        processDirectoryTree(new File("."));
      else
        for(String arg : args) {
          File fileArg = new File(arg);
          if(fileArg.isDirectory())
            processDirectoryTree(fileArg);
          else {
            if (arg.matches(regex))
              strategy.process(fileArg.getCanonicalFile());
          }
        }
    } catch(IOException e) {
      throw new RuntimeException(e);
    }
  }
  public void
  processDirectoryTree(File root) throws IOException {
    for(File file : Directory.walk(
        root.getAbsolutePath(), ".*\\.java"))
      strategy.process(file.getCanonicalFile());
  }
  // Demonstration of how to use it:
  public static void main(String[] args) {
    new Ex05_ProcessFiles(file -> System.out.println(file), "java").start(args);
  }
}
