/**
 * Write a class called Command that contains a String and has a method operation( ) that displays the String.
 * Write a second class with a method that fills a Queue with Command objects and returns it. Pass the filled
 * Queue to a method in a third class that consumes the objects in the Queue and calls their operation( ) methods.
 */

import java.util.LinkedList;
import java.util.Queue;

class Command {
    private String str;
    public void operation() { System.out.println("str = " + str); }

    Command(String s) { str = s; }
}

class Generator {
    public Queue<Command> generate() {
        Queue<Command> qstr = new LinkedList<>();
        qstr.offer( new Command("first") );
        qstr.offer( new Command("second") );
        qstr.offer( new Command("third") );

        return qstr;
    }
}

public class Ex27_Commands {

    public static void printQ(Queue<Command> q) {
        while(q.peek() != null) {
            q.remove().operation();
        }
    }

    public static void main(String[] args) {
        Generator g = new Generator();

        printQ( g.generate() );
    }
}
