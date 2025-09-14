package session2_input;

import java.util.Scanner;

public class ImportMathic
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);

    System.out.println("Enter digit:");
    String input = in.nextLine();

    int theNumber = Integer.parseInt(input);
    int theIncrease = theNumber +1; //FACIT LANDER HER|| KAN SES SOM EN LIGNING?

    System.out.println("Your digit: " + theIncrease);
  }
}
