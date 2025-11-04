package session16_Excercises.Zoo;

public class ReptileHouse extends Enclosure
{

  private double temperature;
  private int humidityLevel;

  public ReptileHouse(int id, String name, double temperature,
      int humidityLevel)
  {
    super(id, name);
    this.temperature = temperature;
    this.humidityLevel = humidityLevel;
  }

  public double getTemperature()
  {
    return temperature;
  }

  public void setTemperature(double newTemp)
  {
    this.temperature = newTemp;
  }

  public int getHumidityLevel()
  {
    return humidityLevel;
  }

  public void setHumidityLevel(int newLevel)
  {
    this.humidityLevel = newLevel;
  }


  @Override public int getMaxCapacity()
  {
    return 0;
  }

  @Override public String getEnclosureType()
  {
    return "Reptile House";
  }
}
