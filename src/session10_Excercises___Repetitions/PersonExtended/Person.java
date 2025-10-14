package session10_Excercises___Repetitions.PersonExtended;

import java.util.ArrayList;
import java.util.List;

public class Person {

  private String name;
  private int age;
  private List<String> hobbies;

  public Person (String name, int age){
    this.name = name;
    this.age = age;
    this.hobbies = new ArrayList<>();
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public int getAge()
  {
    return age;
  }

  public void setAge(int age)
  {
    this.age = age;
  }

  public List<String> getHobbies()
  {
    return hobbies;
  }

  public void setHobbies(List<String> hobbies)
  {
    this.hobbies = hobbies;
  }

  public void addHobby (String hobby){
    if (!hobbies.contains(hobby)){
        hobbies.add(hobby);
        System.out.println("'" + hobby + "' added to hobbies.");
    }
    else {
      System.out.println("'" + hobby + "' already exists");
    }
  }

  public void removeHobby (String hobby){
    if (hobbies.contains(hobby)){
      hobbies.remove(hobby);
      System.out.println("'" + hobby + "' removed.");
    }
    else {
      System.out.println("'" + hobby + "' doesn't exists.");
    }
  }


}
