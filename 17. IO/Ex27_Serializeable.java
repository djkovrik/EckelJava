import java.io.*;

/**
 * Create a Serializable class containing a reference to an object of a second Serializable class. Create an instance
 * of your class, serialize it to disk, then restore it and verify that the process worked correctly.
 */

class First implements Serializable {
    private Second next;

    public First(char ch) {
        next = new Second(ch);
    }

    @Override
    public String toString() {
        return "First{" +
                "next=" + next +
                '}';
    }
}

class Second implements Serializable {
    private char ch;

    public Second(char ch) {
        this.ch = ch;
    }

    @Override
    public String toString() {
        return "Second{" +
                "ch=" + ch +
                '}';
    }
}

public class Ex27_Serializeable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        First f = new First('z');
        System.out.println("f = " + f);

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("first.out"));
        out.writeObject("First object put");
        out.writeObject(f);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("first.out"));
        String text = (String) in.readObject();
        First restored = (First) in.readObject();

        System.out.println("Restored text: " + text);
        System.out.println("Restored object: " + restored);
    }
}
