package session8_objects.ExcerciseMix;

public class Student {

  String name;
  int age;
  double snit;
  boolean hjemmeboende;


  Student (String name, int age, double snit){
    this.name = name;
    this.age = age;
    this.snit = snit;
    this.hjemmeboende = true;
  }

  void study (){
    System.out.println(this.name + " is studying");
  }

  void ofAge (){
    System.out.println("and is " + this.age + " years old");
  }
}
