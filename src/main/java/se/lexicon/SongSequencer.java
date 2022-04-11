package se.lexicon;

public class SongSequencer {

  public static  int sequencer = 100;

  public static int nextId(){
    return ++sequencer;
  }
}
