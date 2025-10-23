package session14_Abstract.Animals;

import java.util.Objects;

public abstract class Animal {
 protected String name;
 protected int age;

  public Animal(String name, int age)
  {
    this.name = name;
    this.age = age;
  }

  public void sleep(){
    System.out.println(name + " is sleeping");
  }

  public abstract void makeSound();
  public abstract void move();
  public abstract void eat();

  @Override
  public int hashCode()
  {
    return Objects.hash(name, age);
  }

  @Override public boolean equals(Object obj)
  {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Animal other = (Animal) obj;
    return age == other.age && name.equals(other.name);
  }
}
