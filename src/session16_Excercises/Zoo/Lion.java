package session16_Excercises.Zoo;

public class Lion extends Mammal
{
  private int prideSize;

  public Lion(String name, int age, double weight, String furColor,
      double bodyTemperature, int prideSize)
  {
    super(name, age, weight, furColor, bodyTemperature);
    this.prideSize = prideSize;
  }

  public int getPrideSize()
  {
    return prideSize;
  }

  public void setPrideSize(int newSize)
  {
    this.prideSize = newSize;
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
