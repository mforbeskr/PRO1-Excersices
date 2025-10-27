package session15_Interfaces.MadHouse;


public class LivingRoom implements Room
{
  private String name;
  private String description;

  public LivingRoom(String name, String description)
  {
    this.name = name;
    this.description = description;
  }

  @Override public String getName()
  {
    return name;
  }

  @Override public String getDescription()
  {
    return description;
  }
}
