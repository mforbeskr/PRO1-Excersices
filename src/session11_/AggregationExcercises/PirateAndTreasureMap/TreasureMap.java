package session11_.AggregationExcercises.PirateAndTreasureMap;

public class TreasureMap {

  private String islandName;
  private String coordinates;
  private String treasureDescription;
  private int difficultyLevel;

  public TreasureMap(String islandName, String coordinates,
      String treasureDescription, int difficultyLevel)
  {
    this.islandName = islandName;
    this.coordinates = coordinates;
    this.treasureDescription = treasureDescription;
    this.difficultyLevel = difficultyLevel;
  }

  public String getIslandName()
  {
    return islandName;
  }

  public String getCoordinates()
  {
    return coordinates;
  }

  public String getTreasureDescription()
  {
    return treasureDescription;
  }

  public int getDifficultyLevel()
  {
    return difficultyLevel;
  }

  public String getMapInfo (){
    return "Retrieving Map Information...\nLocation: " + islandName + ", " + coordinates + ", " + treasureDescription + ", Difficulty Level: " + difficultyLevel +"\n";
  }
}
