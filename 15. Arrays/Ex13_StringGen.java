/**
 * Fill a String using CountingGenerator.Character.
 */

import net.mindview.util.CountingGenerator;

import java.util.Arrays;

public class Ex13_StringGen {
    public static void main(String[] args) {
        
        char[] ch = new char[10];
        CountingGenerator.Character gen = new CountingGenerator.Character();

        for (int i = 0; i < ch.length; i++) {
            ch[i] = gen.next();
        }

        String str = Arrays.toString(ch);
        System.out.println(str);
    }
}
