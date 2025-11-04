package session16_Excercises.Zoo;

public abstract class Animal
{
  private String name;
  private int age;
  private double weight;
  private boolean isHealthy;

  public Animal(String name, int age, double weight)
  {
    this.name = name;
    this.age = age;
    this.weight = weight;
    this.isHealthy = true;

  }

  public String getName()
  {
    return name;
  }

  public int getAge()
  {
    return age;
  }

  public double getWeight()
  {
    return weight;
  }

  public void setAge(int age)
  {
    this.age = age;
  }

  public boolean isHealthy(){
    return isHealthy;
  }

  public void setIsHealthy(boolean healthy)
  {
    isHealthy = healthy;
  }

  public void feed (String type){
    System.out.println("feeding " + name);
  }

  public void assignToEnclosure(Enclosure enclosure){
    enclosure.addAnimal(this);
    System.out.println();
  }

  public abstract String getFoodType();
  public abstract String getAnimalType();
  public abstract void makeSound();
  public abstract void checkHealth();

  @Override public String toString()
  {
    return "Animal {" + "name='" + name + '\'' + ", age=" + age + ", weight="
        + weight + ", isHealthy=" + isHealthy + '}';
  }
}

