package session9_MethodOverloading.Counter;

public class Person
{
  private String name;
  private int age;

  // static field shared by all Person objects
  private static int population = 0;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
    population++; // increment the class-wide counter
  }

  public static int getPopulation() {
    return population;
  }

  public static void resetCounter(){
  population = 0;
  }


  @Override
  public String toString() {
    return "Person{name='" + name + "', age=" + age + "}";
  }
}
