package session14_Abstract.Animals;

public class Cat extends Animal
{

  private boolean isIndoor;

  public Cat(String name, int age, boolean isIndoor)
  {
    super(name, age);
    this.isIndoor = true;
  }



  @Override public void makeSound()
  {
    System.out.println(name + "goes meow! meow!");

  }

  @Override public void move()
  {
    System.out.println(name + " is moving.");

  }

  @Override public void eat()
  {
    System.out.println(name + " is eating.");
  }

  public void climb(){
    System.out.println(name + " *Climbs up the thing*");
  }

  @Override public String toString()
  {
    return "Cat{" + "isIndoor=" + isIndoor + ", name='" + name + '\'' + ", age="
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
