package session16_Excercises.Zoo;

import java.util.ArrayList;

public abstract class Enclosure
{
  private int enclosureID;
  private String name;
  private ArrayList<Animal> animals;

  public Enclosure(int id, String name)
  {
    this.enclosureID = id;
    this.name = name;
    this.animals = new ArrayList<>();
  }

  public int getEnclosureID()
  {
    return enclosureID;
  }

  public String getEnclosureName()
  {
    return name;
  }

  public void setEnclosureID(int enclosureID)
  {
    this.enclosureID = enclosureID;
  }

  public void setEnclosureName(String newName)
  {
    this.name = newName;
  }

  public ArrayList<Animal> getAnimals()
  {
    return animals;
  }

  public void addAnimal(Animal animal)
  {
    animals.add(animal);
  }

  public Animal takeOutAnimal (Animal animalName){
    animals.remove(animalName);
    return animalName;
  }

  public abstract int getMaxCapacity();
  public abstract String getEnclosureType();

  public int getCurrentNumberOfAnimals(){
    return animals.size();
  }

  @Override public String toString()
  {
    return "Enclosure{" + "enclosureID=" + enclosureID + ", name='" + name
        + '\'' + ", animals=" + animals + '}';
  }
}
