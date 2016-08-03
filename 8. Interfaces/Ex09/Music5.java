/**
 * Refactor Musics.java by moving the common methods in Wind, Percussion and Stringed into an abstract class.
 */

import music.Note;
import static net.mindview.util.Print.*;

abstract class Instrument {
  void play(Note n) { print(this + ".play() " + n); }
  void adjust() { print(this + ".adjust()"); }
}

class Wind extends Instrument {
  public String toString() { return "Wind"; }
}

class Percussion extends Instrument {
  public String toString() { return "Percussion"; }
}

class Stringed extends Instrument {
  public String toString() { return "Stringed"; }
}

class Brass extends Wind {
  public String toString() { return "Brass"; }
}	

class Woodwind extends Wind {
  public String toString() { return "Woodwind"; }
}

public class Music5 {

  static void tune(Instrument i) {
    i.adjust();
    i.play(Note.MIDDLE_C);
  }

  static void tuneAll(Instrument[] e) {
    for(Instrument i : e)
      tune(i);
  }


    public static void main(String[] args) {

    Instrument[] orchestra = {
      new Wind(),
      new Percussion(),
      new Stringed(),
      new Brass(),
      new Woodwind()
    };
    tuneAll(orchestra);
  }
}