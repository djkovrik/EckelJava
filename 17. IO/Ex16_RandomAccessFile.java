/**
 * Look up RandomAccessFile in the JDK documentation. Starting with UsingRandomAccessFile.java, create a program
 * that stores and then retrieves all the different possible types provided by the RandomAccessFile class. Verify
 * that the values are stored and retrieved accurately.
 */

import java.io.*;

public class Ex16_RandomAccessFile {
    static String file = "src\\rtest.dat";

    static void display() throws IOException {
        RandomAccessFile rf = new RandomAccessFile(file, "r");
        System.out.println(rf.readBoolean());
        System.out.println(rf.readByte());
        System.out.println(rf.readChar());
        System.out.println(rf.readDouble());
        System.out.println(rf.readFloat());
        System.out.println(rf.readInt());
        System.out.println(rf.readLong());
        System.out.println(rf.readShort());
        System.out.println(rf.readUTF());
        rf.close();
    }

    public static void main(String[] args) throws IOException {

        RandomAccessFile rf = new RandomAccessFile(file, "rw");

        rf.writeBoolean(true);
        rf.writeByte(2);
        rf.writeChar('a');
        rf.writeDouble(2.3d);
        rf.writeFloat(3.14f);
        rf.writeInt(12345);
        rf.writeLong(1000000L);
        rf.writeShort(7);
        rf.writeUTF("this is utf");
        rf.close();

        display();
    }
}