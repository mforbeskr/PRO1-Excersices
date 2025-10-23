package session14_Abstract.Animals;

public class Dog extends Animal
{
  private String breed;

  public Dog(String name, int age, String breed)
  {
    super(name, age);
    this.breed = breed;
  }



  @Override public void makeSound()
  {
    System.out.println(name + "goes woof! woof!");
  }

  @Override public void move()
  {
    System.out.println(name + " is moving.");
  }

  @Override public void eat()
  {
    System.out.println(name + " is eating.");
  }

  public void fetch(){
    System.out.println(name + " *Fetches the thing*");
  }


  @Override public String toString()
  {
    return "Dog{" + "breed='" + breed + '\'' + ", name='" + name + '\''
        + ", age=" + age + '}';
  }

  @Override public int hashCode()
  {
    return super.hashCode();
  }

  @Override public boolean equals(Object obj)
  {
    return super.equals(obj);
  }
}
