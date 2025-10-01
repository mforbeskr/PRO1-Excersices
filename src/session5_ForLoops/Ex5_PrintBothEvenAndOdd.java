package session5_ForLoops;

import java.util.Scanner;

public class Ex5_PrintBothEvenAndOdd
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int input = scanner.nextInt();
    System.out.println();

    for (int i = 0; i <= input; i++)
    {

      if (i % 2 == 0) {
        System.out.println(i + " is even");
      }

      if (i % 2 == 1) {
        System.out.println(i + " is odd");
      }

      scanner.close();
    }
  }
}