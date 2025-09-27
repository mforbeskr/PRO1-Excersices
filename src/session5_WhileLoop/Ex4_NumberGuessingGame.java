package session5_WhileLoop;

import javax.swing.*;
import java.util.Scanner;

public class Ex4_NumberGuessingGame
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    int randomNumber = (int)(Math.random() * 10) + 1;
    int guessedNumber ;

    do {
      System.out.print("Guess the random generated number: ");
      guessedNumber = scanner.nextInt();

      if (guessedNumber == randomNumber) {
        System.out.println("\nNice job, you've guessed correctly!");

      }else {
        System.out.println("Wrong guess, try again!");
      }

    }while(!(guessedNumber ==randomNumber));

      System.out.println("The random number was: " + randomNumber);
      System.out.println("Thanks for playing!");

      scanner.close();
  }
}
