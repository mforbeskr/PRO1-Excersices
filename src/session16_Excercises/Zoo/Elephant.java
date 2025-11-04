package session16_Excercises.Zoo;

public class Elephant extends Mammal
{
  private double tuskLength;
  private boolean hasTusks;

  public Elephant(String name, int age, double weight, String furColor,
      double bodyTemperature, double tuskLength)
  {
    super(name, age, weight, furColor, bodyTemperature);
    this.tuskLength = tuskLength;
  }

  public double getTuskLength(){
    return tuskLength;
  }

  public void setTuskLength(double newLength){
    this.tuskLength = newLength;
  }

  public void setTuskStatus (boolean tuskStatus)
  {
    this.hasTusks = tuskStatus;
  }

  public boolean hasTusks(){
    return hasTusks;
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


