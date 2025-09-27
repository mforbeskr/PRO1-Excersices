package session5_WhileLoop;

import java.util.Scanner;

public class Ex5_CalculateFactorial
{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a positive number: ");
    int userInput = scanner.nextInt();

    if (userInput < 0){
      System.out.println("Factorial numbers is not accessible for negative numbers");
    }

    else {
      long factorial = 1;
      int counter = 1;

      while(counter <= userInput){
          factorial*=counter;
          counter++;
      }

      System.out.println("The factorial of " + userInput + " is: " + factorial);

    }
  }
}
