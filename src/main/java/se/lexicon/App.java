package se.lexicon;

import java.time.LocalDate;

/**
 * Hello world!
 */
public class App {
  public static void main(String[] args) {
    Album album1 = new Album("album1", LocalDate.parse("2021-01-01"));
    Album album2 = new Album("album2", LocalDate.parse("2020-08-01"));

    Artist artist1 = new Artist("artist1", LocalDate.of(1980, 1, 1));
    Artist artist2 = new Artist("artist2", LocalDate.of(2000, 2, 2));
    Artist artist3 = new Artist("artist3", LocalDate.of(2001, 3, 3));

    Song song1 = new Song("song1", "test test", LocalDate.now(), LocalDate.now(), artist1, album1);
    Song song2 = new Song("song2", "test test", LocalDate.now(), LocalDate.now(), artist3, null);

    Song song3 = new Song("song3", "test test", LocalDate.now(), LocalDate.now(), artist2, album1);
    Song song4 = new Song("song4", "test test", LocalDate.now(), LocalDate.now(), artist1, album2);

    Playlist playlist1 = new Playlist("My First Playlist");
    playlist1.addSong(song1);
    playlist1.addSong(song2);
    playlist1.addSong(song3);
    System.out.println(playlist1.playlistInf());


    Playlist playlist2 = new Playlist("Playlist2");
    playlist2.addSong(song1);
    playlist2.addSong(song2);
    playlist2.addSong(song3);
    playlist2.addSong(song4);
    System.out.println(playlist2.playlistInf());
    playlist2.removeSong(song1);
    System.out.println(playlist2.playlistInf());


  }
}
