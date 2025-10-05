package session6_Arrays;

public class Ex11_PrintFruits
{
  public static void main(String[] args)
  {
    String[] fruits = new String[] {"apple", "banana", "orange", "grape"};
    int i = 0;

    while (true)
    {

      System.out.println("Fruit " + (i +1) + ": " + fruits[i]);
      i++;
      if (i == fruits.length)
      {
        break;
      }
    }

  }
}

