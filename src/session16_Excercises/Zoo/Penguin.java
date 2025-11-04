package session16_Excercises.Zoo;

public class Penguin extends Bird
{
  private double swimSpeed;

  public Penguin(String name, int age, double weight, double wingspan,
      boolean canFly, double swimSpeed)
  {
    super(name, age, weight, wingspan, canFly);
    this.swimSpeed = swimSpeed;
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
