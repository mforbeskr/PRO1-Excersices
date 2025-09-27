package session5_WhileLoop;

import java.util.Scanner;

public class Ex2_SumUntillX
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    int sum = 0;
    String input;

    do{
      System.out.println("Enter a number (x to stop): ");
      input = scanner.nextLine();

      if (!input.equals("x")){
        int number = Integer.parseInt(input);
        sum += number;

      }

    }while(!input.equals("x"));

    System.out.println("The sum is: " + sum + "\nYou've stopped the program.");




  }
}
