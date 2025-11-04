package session16_Excercises.Zoo;

public abstract class Mammal extends Animal {
  private String furColor;
  private double bodyTemperature;

  public Mammal(String name, int age, double weight, String furColor,
      double bodyTemperature)
  {
    super(name, age, weight);
    this.furColor = furColor;
    this.bodyTemperature = bodyTemperature;
  }

  public String getFurColor()
  {
    return furColor;
  }

  public void setFurColor(String newFurColor){
    this.furColor = newFurColor;
  }

  public void setBodyTemperature(double newTemp)
  {
    this.bodyTemperature = newTemp;
  }


}
