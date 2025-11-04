package session16_Excercises.Zoo;

public class Snake extends Reptile{

  private double length;
  private boolean isVenomous;

  public Snake(String name, int age, double weight, String scaleType,
      double length, boolean isVenomous)
  {
    super(name, age, weight, scaleType);
    this.length = length;
    this.isVenomous = isVenomous;
  }

  public double getLength()
  {
    return length;
  }

  public boolean isVenomous(){
    return isVenomous;
  }

  public void setLength(double length)
  {
    this.length = length;
  }

  public void setVenomous(boolean venomous)
  {
    isVenomous = venomous;
  }

  @Override public String getFoodType()
  {
    return "";
  }

  @Override public String getAnimalType()
  {
    return "";
  }

  @Override public void makeSound()
  {

  }

  @Override public void checkHealth()
  {

  }

}

