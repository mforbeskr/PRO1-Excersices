package session16_Excercises.Zoo;

public class Eagle extends Bird
{
  private double maxAltitude;

  public Eagle(String name, int age, double weight, double wingspan,
      boolean canFly, double maxAltitude)
  {
    super(name, age, weight, wingspan, canFly);
    this.maxAltitude = maxAltitude;
  }

  public double getMaxAltitude()
  {
    return maxAltitude;
  }

  public double setMaxAltitude(double newAltitude)
  {
    this.maxAltitude = newAltitude;
    return maxAltitude;
  }

  @Override public void clipFeathers()
  {

  }
  @Override public String getFoodType()
  {
    return "";
  }

  @Override public String getAnimalType()
  {
    return "mammal";
  }

  @Override public void makeSound()
  {

  }

  @Override public void checkHealth()
  {
    if (isHealthy()) {
      System.out.println(getName() + " is healthy.");
    } else {
      System.out.println(getName()+ " needs medical attention!");
    }
  }


}
