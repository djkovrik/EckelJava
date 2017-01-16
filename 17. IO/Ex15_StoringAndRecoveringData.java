/**
 * Look up DataOutputStream and DataInputStream in the JDK documentation. Starting with
 * StoringAndRecoveringData.java, create a program that stores and then retrieves all the
 * different possible types provided by the DataOutputStream and DataInputStream classes.
 * Verify that the values are stored and retrieved accurately.
 */

import java.io.*;

public class Ex15_StoringAndRecoveringData {
  public static void main(String[] args)  throws IOException {

    DataOutputStream out = new DataOutputStream(
      new BufferedOutputStream(
        new FileOutputStream("src\\Data.txt")));

    out.writeBoolean(true);
    out.writeByte(2);
    out.writeChar('z');
    out.writeDouble(3.0d);
    out.writeFloat(1.23f);
    out.writeInt(45678);
    out.writeLong(10L);
    out.writeShort(2);
    out.writeUTF("test");

    out.close();

    DataInputStream in = new DataInputStream(
      new BufferedInputStream(
        new FileInputStream("src\\Data.txt")));

    System.out.println(in.readBoolean());
    System.out.println(in.readByte());
    System.out.println(in.readChar());
    System.out.println(in.readDouble());
    System.out.println(in.readFloat());
    System.out.println(in.readInt());
    System.out.println(in.readLong());
    System.out.println(in.readShort());
    System.out.println(in.readUTF());
  }
}