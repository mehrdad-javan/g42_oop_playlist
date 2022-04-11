package se.lexicon;

import java.time.LocalDate;

public class Artist {

  private String name;
  public LocalDate birthDate;

  public Artist(String name, LocalDate birthDate) {
    this.name = name;
    this.birthDate = birthDate;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LocalDate getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }

  public String summaryInformation(){
    return "Name: " + name + " BirthDate: " + birthDate;
  }

}
