package session16_Excercises.Zoo;

public abstract class Bird extends Animal
{
  private double wingspan;
  private boolean canFly;

  public Bird(String name, int age, double weight, double wingspan,
      boolean canFly)
  {
    super(name, age, weight);
    this.wingspan = wingspan;
    this.canFly = canFly;
  }

  public double getWingspan()
  {
    return wingspan;
  }

  public void setWingspan(double wingspan)
  {
    this.wingspan = wingspan;
  }

  public boolean canFly()
  {
    return canFly;
  }

  public void setCanFly(boolean canFly)
  {
    this.canFly = canFly;
  }

  public abstract void clipFeathers();


}
