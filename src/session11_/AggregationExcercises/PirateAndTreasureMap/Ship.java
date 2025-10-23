package session11_.AggregationExcercises.PirateAndTreasureMap;

public class Ship
{

  private String shipName;
  private String shipType;
  private int crewCapacity;

  public Ship(String shipName, String shipType, int crewCapacity)
  {
    this.shipName = shipName;
    this.shipType = shipType;
    this.crewCapacity = crewCapacity;
  }

  public String getShipName()
  {
    return shipName;
  }

  public String getShipType()
  {
    return shipType;
  }

  public int getCrewCapacity()
  {
    return crewCapacity;
  }

  public String getShipInfo()
  {
    return "Ship Information: " + shipName + " Ship Type: " + shipType
        + " Crew Capacity: " + crewCapacity;
  }


}
