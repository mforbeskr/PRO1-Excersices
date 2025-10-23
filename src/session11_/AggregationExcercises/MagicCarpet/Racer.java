package session11_.AggregationExcercises.MagicCarpet;

public class Racer {

  private String name;
  private int experienceLevel;
  private int winCount;

  public Racer(String name, int experienceLevel)
  {
    this.name = name;
    this.experienceLevel = experienceLevel;
    this.winCount = winCount;
  }

  public String getName()
  {
    return name;
  }

  public int getExperienceLevel()
  {
    return experienceLevel;
  }

  public int getWinCount()
  {
    return winCount;
  }

  public void incrementWinCount (){
    winCount++;
  }

  public String getRacerInfo (){
    return "Name: " + name + ", Experience Level: " + experienceLevel + ", Win Count: " + winCount;
  }
}
