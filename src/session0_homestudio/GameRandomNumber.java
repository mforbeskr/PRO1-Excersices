package session0_homestudio;

import java.util.Random;
import java.util.Scanner;

public class GameRandomNumber
{
  public static void main(String[] args){

    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    int guess;
    int attempts = 0;
    int min = 1;
    int max = 500;
    int randomNumber = random.nextInt(min,max +1);

    System.out.println("NUMBER GUESSING GAME");
    System.out.print("\nGuess a number between " + min + " - " + max +".\n");

    do
    {   // DO THIS CODE ONCE,

      System.out.print("Enter a guess: ");
      guess = scanner.nextInt();
      attempts++;

      if (guess < randomNumber){
        System.out.println("Too Low, Try Again!");
      }
      else if (guess > randomNumber){
        System.out.println("Too High, Try Again!");
      }
      else{
        System.out.println("\nCorrect! The number was: " + randomNumber);
        System.out.println("You've used " + attempts + " attempts. Good job!");
      }


    }while(guess !=randomNumber);   // WHILE THIS CONDITION REMAINS TRUE

    scanner.close();
  }
}
