/**
 * Using BinaryFile and a Map<Byte,Integer>, create a program that counts the occurrence of all the different bytes in a file.
 */

import net.mindview.util.BinaryFile;

import java.io.IOException;
import java.util.*;

public class Ex19_ByteCount {
    private static final String source = "out\\production\\Current\\Ex19_ByteCount.class";

    public static void main(String[] args) throws IOException {
        Map<Byte,Integer>  bytes = new HashMap<>();

        for (Byte b : BinaryFile.read(source)) {
            Integer freq = bytes.get(b);
            bytes.put(b, freq == null ? 1 : freq + 1);
        }

        List<Byte> keys = new ArrayList<>(bytes.keySet());
        Collections.sort(keys);

        for (Byte key : keys) {
            System.out.println(key + " - " + bytes.get(key));
        }
    }
}
