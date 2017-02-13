/**
 * Use a static import to modify TrafficLight.java so you don’t have to qualify the enum instances.
 */

import enums.Signal;

import static net.mindview.util.Print.print;
import static enums.Signal.*;

public class TrafficLight {
  Signal color = RED;
  public void change() {
    switch(color) {
      case RED:    color = Signal.GREEN;
                   break;
      case GREEN:  color = Signal.YELLOW;
                   break;
      case YELLOW: color = Signal.RED;
                   break;
    }
  }
  public String toString() {
    return "The traffic light is " + color;
  }
  public static void main(String[] args) {
    TrafficLight t = new TrafficLight();
    for(int i = 0; i < 7; i++) {
      print(t);
      t.change();
    }
  }
}