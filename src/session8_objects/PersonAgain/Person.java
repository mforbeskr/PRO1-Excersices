package session8_objects.PersonAgain;

import java.util.ArrayList;

public class Person
{

  private String name;
  private int age;
  private ArrayList<String> hobbies;

  /// CONSTRUCTOR ///
  public Person(String name, int age)
  {
    this.name = name;
    this.age = age;
    this.hobbies = new ArrayList<>();
  }

  /// METHODS ///

  public void greet() {
    System.out.println(
        "Hello there, my name is " + name + " and I am " + age + " years old.");
  }


  public void setName(String newName) {
    this.name = newName;
  }

  public String getName() {
    return name;
  }

  public void setAge(int newAge) {
    this.age = newAge;
  }

  public int getAge(){
    return age;
  }

  public void addHobby(String hobby) {
    hobbies.add(hobby);
  }

  public String[] getHobbies(){
    return hobbies.toArray(new String [0]);
  }







  @Override
  public String toString() {
    return "Hello there, my name is " + name + " and I am " + age
        + " years old. My hobbies are " + hobbies;
  }

}
