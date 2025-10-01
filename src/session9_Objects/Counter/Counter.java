package session9_Objects.Counter;

public class Counter
{
  private static int count = 0;
  private int instanceNumber;

  public Counter(){

    instanceNumber = count;
    count++;
  }

  @Override public String toString()
  {
    return "Counter{" + "instanceNumber=" + instanceNumber + '}';
  }

  public int getCurrentCount(){

    return count;
  }



}
