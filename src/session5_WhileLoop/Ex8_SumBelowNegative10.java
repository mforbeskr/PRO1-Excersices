package session5_WhileLoop;

import java.util.Scanner;

public class Ex8_SumBelowNegative10
{
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int sum = 0;

    while (true) {
      System.out.println("Enter a number: ");
      int number = scanner.nextInt();

      sum += number;
      System.out.println("Current sum: " + sum);

      if (sum < -10){
        System.out.println("\nSum is now " + sum + " and has dropped below -10.\nStopping program immediately. ");
        break;

      }
    }
  }
}
