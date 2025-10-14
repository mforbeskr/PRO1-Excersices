package session9_MethodOverloading.Counter;

public class CounterTester
{
  public static void main(String[] args) {

    System.out.println(Person.getPopulation()); // 0
    Person p1 = new Person("Alice", 25);
    Person p2 = new Person("Bob", 30);
    System.out.println(Person.getPopulation()); // 2 (shared value)
    Person p3 = new Person("Charlie", 35);
    System.out.println(Person.getPopulation()); // 3 (shared value)
    Person.resetCounter();
    System.out.println();
    Person p4 = new Person("Hassan", 35);
    System.out.println(Person.getPopulation()); // 1 (shared value)

  }
}
