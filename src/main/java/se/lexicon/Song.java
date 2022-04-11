package se.lexicon;

import java.time.LocalDate;

public class Song {

  private int id;
  private String title;
  private String lyric;
  private LocalDate createDate;
  public LocalDate releaseDate;
  private Artist artist;
  private Album album;

  public Song() {
    this.id = SongSequencer.nextId();
  }

  public Song(String title, String lyric, LocalDate createDate, LocalDate releaseDate, Artist artist, Album album) {
    this(title, lyric, artist);
    this.createDate = createDate;
    this.releaseDate = releaseDate;
    setAlbum(album);
  }

  public Song(String title, String lyric, Artist artist) {
    this();
    setTitle(title);
    this.lyric = lyric;
    setArtist(artist);
  }


  public int getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    if (title == null) {
      throw new IllegalArgumentException("Title should not be null!");
    }
    this.title = title;
  }

  public String getLyric() {
    return lyric;
  }

  public void setLyric(String lyric) {
    this.lyric = lyric;
  }

  public LocalDate getCreateDate() {
    return createDate;
  }

  public void setCreateDate(LocalDate createDate) {
    this.createDate = createDate;
  }

  public LocalDate getReleaseDate() {
    return releaseDate;
  }

  public void setReleaseDate(LocalDate releaseDate) {
    this.releaseDate = releaseDate;
  }

  public Artist getArtist() {
    return artist;
  }

  public void setArtist(Artist artist) {
    if (artist == null) {
      throw new IllegalArgumentException("Artist should not be null!");
    }
    this.artist = artist;
  }

  public Album getAlbum() {
    return album;
  }

  public void setAlbum(Album album) {
    if (album != null) {
      album.addSong(this);
    }
    this.album = album;
  }

  public String summaryInformation() {
    return "Id: " + id + " Title: " + title + " Lyric: " + lyric + (album != null ? " Album Information: " + album.summaryInformation() : " Single Track");
  }

}
