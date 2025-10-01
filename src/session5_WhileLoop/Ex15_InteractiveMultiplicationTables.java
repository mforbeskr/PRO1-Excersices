package session5_WhileLoop;

import java.util.Scanner;

public class Ex15_InteractiveMultiplicationTables
{
  public static void main(String[] args)
  {

    Scanner scanner = new Scanner(System.in);
    int number;

    while (true)
    {
      System.out.println("Enter a number (0 to stop): ");

      if (scanner.hasNextInt())
      {
        number = scanner.nextInt();

        if (number == 0)
        {
          System.out.println("Exiting, bye!");
          break;
        }

        System.out.println("\nMultiplication table for " + number + ":");
        int multiplier = 1;
        while (multiplier <= 10)
        {
          System.out.println(
              number + " x " + multiplier + " =\t" + (number * multiplier));
          multiplier++;
        }
        System.out.println();

      } else {
        System.out.println("Error: Please inter a valid integer. ");
        String invalid = scanner.next();
        System.out.println("'" + invalid  + "'" + " is not a number.");

      }
    }
    scanner.close();
  }
}