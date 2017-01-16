/**
 * Using Directory.walk( ) and BinaryFile, verify that all .class files in a directory tree begin with the
 * hex characters ‘CAFEBABE’.
 */

import net.mindview.util.BinaryFile;
import net.mindview.util.Directory;

import java.io.File;
import java.io.IOException;

class First {
    private int x = 0;
}

class Second {
    private double d = 1.2;
}

public class Ex20_CAFEBABE {
    private static final byte[] signature = {(byte)202, (byte)254, (byte)186, (byte)190};
    private static final String sourceFolder = "out\\production\\Current";

    public static void main(String[] args) throws IOException {

        boolean noBrokenFilesDetected = true;

        for (File file : Directory.walk(sourceFolder, ".*\\class")) {
            byte[] buffer = BinaryFile.read(file);

            for (int i = 0; i < signature.length; i++) {
                if (buffer[i] != signature[i]) {
                    System.out.println("File " + file.getName() + " corrupted!");
                    noBrokenFilesDetected = false;
                    break;
                }
            }
        }

        if (noBrokenFilesDetected) {
            System.out.println("No broken files detected.");
        }
    }
}
