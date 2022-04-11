package se.lexicon;

import java.util.Arrays;

public class Playlist {

  private String name;
  public Song[] songs;

  public Playlist(String name) {
    this.songs = new Song[0];
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Song[] getSongs() {
    return songs;
  }

  public void setSongs(Song[] songs) {
    this.songs = songs;
  }

  public void addSong(Song song) {
    // step1: make a copy
    // step2: add element to the latest index
    // replace the new array with old array
    if (song != null) {
      Song[] tmp = Arrays.copyOf(songs, songs.length + 1);
      tmp[tmp.length - 1] = song;
      songs = tmp;
    }
  }

  public boolean removeSong(Song song) {
    if (song == null){
      return false;
    }
    int findIndex = -1;
    for (int i = 0 ; i < songs.length ; i++){
      if (songs[i].getId() == song.getId()){
        findIndex = i;
        break;
      }
    }

    if (findIndex == -1){
      return false;
    }
    Song[] newArray = new Song[songs.length -1];
    int sequencer = 0;
    for (int i = 0; i < songs.length ; i++){
      if (i == findIndex){
        continue;
      }
      newArray[sequencer++] = songs[i];
    }
    songs = newArray;

    return true;

  }

  public String playlistInf(){
    String result = "";
    result += " PlaylistName: " + name ;
    for (Song song: songs){
      result += "\n\t" + song.summaryInformation() + "\n";
    }
    return result;
  }

}
