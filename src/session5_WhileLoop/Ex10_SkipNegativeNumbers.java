package session5_WhileLoop;

import java.util.Scanner;

public class Ex10_SkipNegativeNumbers
{

  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    int sum = 0;
    int count = 1;

    while (count <= 10)
    {
      System.out.print("Enter number " + count + ": ");
      int number = scanner.nextInt();

      if (number < 0)
      {
        count++;
        continue;
      }

      sum += number;
      count++;

    }
    System.out.println("\nThe sum of all entered numbers is accumulated to: " + sum);

  }
}
