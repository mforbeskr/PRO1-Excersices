package session11_.AggregationExcercises.PirateAndTreasureMap;

public class Prosthetic {

  private String type;
  private String bodyPart;
  private String material;
  private String description;

  public Prosthetic(String type, String bodyPart, String material,
      String description)
  {
    this.type = type;
    this.bodyPart = bodyPart;
    this.material = material;
    this.description = description;
  }

  public String getType()
  {
    return type;
  }

  public String getBodyPart()
  {
    return bodyPart;
  }

  public String getMaterial()
  {
    return material;
  }

  public String getDescription()
  {
    return description;
  }

  public String getProstheticInfo(){
    return "Type: " + type + " Body Part: " + bodyPart + " Material: " + material + " Description: " + description;
  }

  @Override public String toString()
  {
    return "Prosthetic type: " + type + ", " + bodyPart + ", " + material + ", " + description + ")";
  }
}
