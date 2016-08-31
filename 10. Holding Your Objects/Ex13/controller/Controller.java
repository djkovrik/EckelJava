//: innerclasses/controller/Controller.java
// The reusable framework for control systems.
package controller;
import java.util.*;

public class Controller {
    // A class from java.util to hold Event objects:
    //private List<Event> eventList = new ArrayList<Event>();
    private LinkedList<Event> eventList = new LinkedList<>();
    public void addEvent(Event c) { eventList.add(c); }
    public void run() {

        while(eventList.size() > 0) {
            Iterator<Event> iter = new LinkedList<>(eventList).iterator();
            while (iter.hasNext()) {
                Event e = iter.next();
                if (e.ready()) {
                    System.out.println(e);
                    e.action();
                    iter.remove();
                }
            }
        }
    }
} ///:~
