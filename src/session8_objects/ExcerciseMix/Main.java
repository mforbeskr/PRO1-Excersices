package session8_objects.ExcerciseMix;

public class Main {
  public static void main(String[] args) {


    Car car = new Car();
    Person person = new Person();


    System.out.println(car.make + " " + car.model);
    car.start();
    car.drive();
    car.brake();
    car.stop();

    person.eat();
    person.showID();

    System.out.println("-------");
    System.out.println();

    Student student1 = new Student("Andy", 24, 4.4);
    Student student2 = new Student("Elvira", 14, 1.4);
    Student student3 = new Student("Bobby", 19, 2.7);

    System.out.println(student1.name);
    System.out.println(student1.age);
    System.out.println(student1.snit);
    System.out.println(student1.hjemmeboende);
    System.out.println();

    System.out.println(student2.name);
    System.out.println(student2.age);
    System.out.println(student2.snit);
    System.out.println(student2.hjemmeboende);
    System.out.println();

    System.out.println(student3.name);
    System.out.println(student3.age);
    System.out.println(student3.snit);
    System.out.println(student3.hjemmeboende);
    System.out.println();

    student1.study();
    student1.ofAge();
    System.out.println();

    student2.study();
    student2.ofAge();
    System.out.println();

    student3.study();
    student3.ofAge();


  }
}
