package se.lexicon;

import java.time.LocalDate;
import java.util.Arrays;

public class Album {
  /*
  -name: String
  -numberOfMusic: int
  -releaseDate: LocalDate
  -songs: Song[ ]
  */

  private String name;
  private int numberOfMusic;
  private LocalDate releaseDate;
  private Song [] songs;

  // constructors
  public Album(String name, LocalDate releaseDate) {
    this.songs = new Song[0];
    setName(name);
    this.releaseDate = releaseDate;
  }

  // getters & setters
  public String getName() {
    return name;
  }

  public void setName(String name) {
    if (name == null){
      throw new IllegalArgumentException("Name should not be null!");
    }
    this.name = name;
  }

  public int getNumberOfMusic() {
    return numberOfMusic;
  }

  public LocalDate getReleaseDate() {
    return releaseDate;
  }

  public void setReleaseDate(LocalDate releaseDate) {
    this.releaseDate = releaseDate;
  }

  public Song[] getSongs() {
    return songs;
  }

  public void setSongs(Song[] songs) {
    this.songs = songs;
  }


  // methods
  public String summaryInformation(){
    return "Name: " + name + " NumberOfMusic: " + numberOfMusic;
  }

  public void addSong(Song song){
    // todo: check the song is not duplicate
    if (songs != null){
      if (song != null){
        Song[] tmp = Arrays.copyOf(songs, songs.length + 1);
        tmp[tmp.length - 1] = song;
        songs = tmp;
        numberOfMusic = songs.length;
      }
    }

  }



}
