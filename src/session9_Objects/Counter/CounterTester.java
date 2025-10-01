package session9_Objects.Counter;

public class CounterTester
{
  public static void main(String[] args)
  {
    Counter c1 = new Counter();
    System.out.println(c1);
    Counter c2 = new Counter();
    System.out.println(c2);
    Counter c3 = new Counter();
    System.out.println(c3);
    new Counter();
    System.out.println(c1.getCurrentCount());
    System.out.println(c2.getCurrentCount());
    System.out.println(c3.getCurrentCount());




  }
}
