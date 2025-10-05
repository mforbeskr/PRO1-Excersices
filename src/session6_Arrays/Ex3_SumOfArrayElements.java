package session6_Arrays;

import java.util.Scanner;

public class Ex3_SumOfArrayElements
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    int[] numbers = new int[5];

    System.out.print("Enter a number: ");
    numbers[0] = scanner.nextInt();

    System.out.print("Enter a number: ");
    numbers[1] = scanner.nextInt();

    System.out.print("Enter a number: ");
    numbers[2] = scanner.nextInt();

    System.out.print("Enter a number: ");
    numbers[3] = scanner.nextInt();

    System.out.print("Enter a number: ");
    numbers[4] = scanner.nextInt();


    int numbersSum = numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4];
    System.out.print("\nResult = " + numbersSum);

  }
}
