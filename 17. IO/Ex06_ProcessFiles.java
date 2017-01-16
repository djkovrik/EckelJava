/**
 * Use ProcessFiles to find all the Java source-code files in a particular directory subtree that have been modified
 * after a particular date.
 */

import net.mindview.util.ProcessFiles;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Locale;

public class Ex06_ProcessFiles {
    public static void main(String[] args) {
        DateFormat format = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.US);
        String path = "\\D:\\_My\\Yandex\\sources\\eckel_java\\17. IO";
        String date = "Dec 20, 2016";

        long temp = 0;

        try {
            format.setLenient(false);
            temp = format.parse(date).getTime();
        } catch (ParseException e) {
            e.printStackTrace();
            return;
        }

        long time = temp;

        new ProcessFiles(file -> {
            if(time < file.lastModified())
                System.out.println(file);
        }, "java").start(new String[] {path});
    }
}
