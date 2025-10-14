package session8_objects.PersonAgain;

import java.util.ArrayList;

public class PersonTester {
  public static void main(String[] args)
  {
    Person person = new Person("Mack", 24);
    person.greet();
    person.setName("Harry");
    person.greet();
    System.out.println();  //   Separation

    Person person1 = new Person("Abdi", 44);
    person1.greet();
    person1.setAge(45);
    person1.greet();
    person1.addHobby("Spinning");
    System.out.println(person1);

    System.out.println();
    Person person2 = new Person("Bobby", 21);
    person2.greet();
    int age = person2.getAge();
    String newName = person2.getName();
    person2.addHobby("boxing");
    System.out.println(person2 + " I repeat, " + age);
    person2.setName("Abdi");
    person2.greet();
    System.out.println();

    Person finalPerson = new Person("Felicity", 22);
    finalPerson.addHobby("Swimming");
    finalPerson.addHobby("Daydrinking");
    finalPerson.addHobby("Dancing");
    finalPerson.addHobby("Livestreaming");

    finalPerson.greet();
    System.out.print("I like to go ");

    String[] hobbyArray = finalPerson.getHobbies();

    for (int i = 0; i < hobbyArray.length; i++)
    {
      System.out.print(hobbyArray[i] + " ");
    }
  }


}
