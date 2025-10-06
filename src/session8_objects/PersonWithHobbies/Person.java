package session8_objects.PersonWithHobbies;

public class Person {

  String name;
  int age;

  Person (String name, int age){
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString(){
    return "[Name: " + name + ", age: " + age + "]";
  }

}
