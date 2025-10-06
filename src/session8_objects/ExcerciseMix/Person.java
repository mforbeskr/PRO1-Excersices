package session8_objects.ExcerciseMix;

public class Person {

  int age = 25;
  String name = "Louis";
  int year = 2000;
  String home = "Denmark";
  boolean isEating = true;


  void eat(){
    isEating = true;
    System.out.println("The person is currently eating.");
  }

  void showID(){
    System.out.println();
    System.out.println("*Shows ID*");
    System.out.println(age + " " + name + " " + year + " " + home + ".");
  }

}
