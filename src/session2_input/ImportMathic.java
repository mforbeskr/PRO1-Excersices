package session2_input;

import java.util.Scanner;

public class ImportMathic
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter any number:");
    String input = scan.nextLine();
    int theNumber = Integer.parseInt(input);
    int increasedNumber = theNumber + 4; // Increment by +1 //
    int decreasedNumber = theNumber - 4; // Decrement by +1 //

    System.out.println("Your increased number: " + increasedNumber);
    System.out.println("Your decreased number: " + decreasedNumber);

    System.out.println("Guess the correct number used: ");
    String guessedOperator = scan.nextLine();//INPUT
    char correctDigit = '4';//CORRECT INPUT
    if (guessedOperator.equals(String.valueOf(correctDigit)))
    {
      System.out.println("Correct, you are a natural! '" + correctDigit + "' was the right number!");
    }
    else
    {
      System.out.println("Nope that is incorrect, please try again!");
    }

    String guessedOperator2 = scan.nextLine();
    char correctDigit2 = '4';
    if (guessedOperator2.equals(String.valueOf(correctDigit2)))
    {
      System.out.println("Correct, you are a natural! '" + correctDigit + "' was the right number!");
    }
    else
    {
      System.out.println("Incorrect answer. Try again!");
    }

    String guessedOperator3 = scan.nextLine();
    char correctDigit3 = '4';
    if (guessedOperator3.equals(String.valueOf(correctDigit3)))
    {
      System.out.println("Correct, you are a natural! '" + correctDigit + "' was the right number!");
    }
    else
    {
      System.out.println("Incorrect answer. Last Try!");
    }
    String guessedOperator4 = scan.nextLine();
    char correctDigit4 = '4';
    if (guessedOperator4.equals(String.valueOf(correctDigit4)))
    {
      System.out.println("Correct, you are a natural! '" + correctDigit + "' was the right number!");
    }
    else
    {
      System.out.println("Type in 'Please' if you want the correct answer.");
      String inputPlease = scan.nextLine();

      if (inputPlease.equals("Please"))
      {
        System.out.println("The correct answer is '4'.");
      }
      else
      {
        System.out.println("Too bad - you didn't say the magic word!");
      }
    }
  }
}
