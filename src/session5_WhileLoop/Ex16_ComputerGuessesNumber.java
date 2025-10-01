package session5_WhileLoop;

import java.util.Scanner;

public class Ex16_ComputerGuessesNumber
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    int low = 1;
    int high = 1000;
    int guesses = 0;
    String answer;

    System.out.println(
        "Think of a number between 1-1000 and i will try to guess it!\n");

    while (true)
    {
          int guess = (low + high) / 2;
          System.out.println("Alright, is " + guess + " your number? ('correct', 'higher', 'lower'): ");
          guesses++;
          answer = scanner.next().toLowerCase();

          if (answer.equals("0"))
          {
            System.out.println("Program will now shut down.");
            break;
          }
          if (answer.equals("correct") || answer.equals("yep"))
          {
            System.out.println(
                "Yay I guessed your number in " + guesses + " attempt(s)!\nProgram will now shut down.");
            break;
          }

          else if (answer.equals("higher"))
          {
            low = guess - 1;
          }

          else if (answer.equals("lower"))
          {
            high = guess + 1;
          }

          else
          {
            System.out.println("Please type (correct, higher, lower).");
            guesses--;
          }

          if (low > high)
          {
            System.out.println(
                "This makes no sense, is it higher or lower? Program shuts down.");
            break;
      }
    }
  }
}