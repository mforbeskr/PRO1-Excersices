package session11_.AggregationExcercises.PirateAndTreasureMap;

import java.util.ArrayList;
import java.util.List;

public class Pirate
{

  private String name;
  private String rank;
  private int yearsExperience;
  private TreasureMap treasureMap;
  private Ship ship;
  private List<Prosthetic> prosthetics;

  public Pirate(String name, String rank, int yearsExperience)
  {
    this.name = name;
    this.rank = rank;
    this.yearsExperience = yearsExperience;
    this.prosthetics = new ArrayList<>();
  }

  public void acquireMap(TreasureMap map)
  {
    this.treasureMap = map;
  }

  public TreasureMap giveAwayMap()
  {
    this.treasureMap = null;
    System.out.println(this.name + " throws map away");
    return null;
  }

  public boolean hasMap()
  {
    return treasureMap != null;
  }

  public TreasureMap getMap()
  {
    return treasureMap;
  }

  public void setShip(Ship ship)
  {
  }

  public Ship getShip()
  {
    return ship;
  }

  public void boardShip (Ship ship){

  }

  public void addProsthetic(String type, String bodyPart, String material,
      String description)
  {
    Prosthetic newProsthetic = new Prosthetic(type, bodyPart, material,
        description);
    prosthetics.add(newProsthetic);
  }

  public List<Prosthetic> getProsthetics()
  {
    return prosthetics;
  }

  public int getProstheticCount()
  {
    return prosthetics.size();
  }

  public String getName()
  {
    return name;
  }

  public String getRank()
  {
    return rank;
  }

  public int getYearsExperience()
  {
    return yearsExperience;
  }
}