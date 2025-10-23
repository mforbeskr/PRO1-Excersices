package session14_Abstract.Animals;

public class Bird extends Animal
{

  private boolean canFly;

  public Bird(String name, int age, boolean canFly)
  {
    super(name, age);
    this.canFly = true;
  }

  public void sleep (String sideOfBrain)
  {
    System.out.println(name + "'s " + sideOfBrain + " side of brain is sleeping");
  }

  @Override public void makeSound()
  {
    System.out.println(name + "goes birr! brr!");
  }

  @Override public void move()
  {
    System.out.println(name + " is moving.");

  }

  @Override public void eat()
  {
    System.out.println(name + " is eating.");
  }

  public void fly(){
    System.out.println(name + " *Flies up in the air*");
  }


  @Override public String toString()
  {
    return "Bird{" + "canFly=" + canFly + ", name='" + name + '\'' + ", age="
        + age + '}';
  }

  @Override public boolean equals(Object obj)
  {
    return super.equals(obj);
  }

  @Override public int hashCode()
  {
    return super.hashCode();
  }
}
