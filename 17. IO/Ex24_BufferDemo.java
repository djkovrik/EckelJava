/**
 * Modify IntBufferDemo.java to use doubles
 */

import java.nio.*;

public class Ex24_BufferDemo {
  private static final int BSIZE = 1024;
  public static void main(String[] args) {
    ByteBuffer bb = ByteBuffer.allocate(BSIZE);
    DoubleBuffer ib = bb.asDoubleBuffer();
    // Store an array of int:
    ib.put(new double[]{ 1.1, 4.2, 4.7, 9.9, 14.3, 81.1, 101.6 });
    // Absolute location read and write:
    System.out.println(ib.get(3));
    ib.put(3, 1811.0);
    // Setting a new limit before rewinding the buffer.
    ib.flip();
    while(ib.hasRemaining()) {
      double d = ib.get();
      System.out.println(d);
    }
  }
}