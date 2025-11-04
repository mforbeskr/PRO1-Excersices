package session16_Excercises.Zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo
{
  private String zooName;
  private ArrayList<Enclosure> enclosures;

  public Zoo(String zooName)
  {
    this.zooName = zooName;
    this.enclosures = new ArrayList<>();
  }

  public String getZooName()
  {
    return zooName;
  }

  public void buildEnclosure(Enclosure enclosure){
    enclosures.add(enclosure);
  }

  public ArrayList<Enclosure> getEnclosures()
  {
    return enclosures;
  }

  public Enclosure findEnclosure(int id){
    for (Enclosure enclosure: enclosures){
      if (enclosure.getEnclosureID() == id){
        return enclosure;
      }
    }return null;
  }

  public ArrayList<Animal> getAllAnimals(){
    ArrayList<Animal> allAnimals = new ArrayList<>();
    for (Enclosure enclosure: enclosures){
      allAnimals.addAll(enclosure.getAnimals());
    }
    return allAnimals;
  }



  @Override
  public String toString() {
    return "Zoo{name='" + zooName + "', enclosures=" + enclosures.size() + "}";
  }
}

