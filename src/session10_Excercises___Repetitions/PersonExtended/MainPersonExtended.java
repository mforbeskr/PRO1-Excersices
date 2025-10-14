package session10_Excercises___Repetitions.PersonExtended;

import java.util.ArrayList;
import java.util.Arrays;

public class MainPersonExtended {
  public static void main(String[] args) {

Person person = new Person("Alexa", 24);
person.addHobby("Swimming");
person.addHobby("Dancing");
person.addHobby("Singing");
person.addHobby("Swimming");

    System.out.println(person.getName());
    System.out.println(person.getHobbies());
person.removeHobby("Dancing");
    System.out.println(person.getHobbies());

    System.out.println();
    person.setHobbies(Arrays.asList("Hopping", "Jocking"));
    //REMOVES LIST AND ADDS NEW IMMEDIATELY
    System.out.println(person.getHobbies()); // then print out new list.















  }
}
