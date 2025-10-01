package session5_ForLoops;

import java.util.Scanner;

public class Ex4_PrintEvenNumbers
{
  public static void main(String[] args)
  {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter number: ");
    int input = scanner.nextInt();

    for (int i = 0; i <= input; i++)
    {
      if (i % 2 == 1)
      {
        continue;
      }

      System.out.println(i);

    }
    scanner.close();
  }
}