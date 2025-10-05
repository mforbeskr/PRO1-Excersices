package session5_WhileLoop;

import java.util.Scanner;

public class Ex18_NumberGuessingGameV2
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    double sum = 0.0;
    int currentTerm = 1;
    int termsPerBatch = 5;
    int totalTerms = 0;
    boolean continueCalculation = true;

    while (continueCalculation)
    {
      for (int batch = 0; batch <= termsPerBatch; batch++)
      {
        double term = 1.0 / (2 * currentTerm - 1);

        if (currentTerm % 2 == 1)
        {
          sum += term;
        }
        else
        {
          sum -= term;
        }
        currentTerm++;

      }

      totalTerms += termsPerBatch;
      double estimatedPI = 4 * sum;
      double actualPI = Math.PI;
      double difference = Math.abs(actualPI - estimatedPI);

      System.out.println(
          "Estimated PI using " + totalTerms + " terms: " + estimatedPI);
      System.out.println("Actual PI: " + actualPI);
      System.out.println("Difference: " + difference);
      System.out.println();

      System.out.print("Do you want to calculate 5 more terms? (y/n): ");
      String userInput = scanner.nextLine();

      if (!userInput.equalsIgnoreCase("y"))
      {
        continueCalculation = false;
        System.out.println("\nFinal Results:");
        System.out.println(
            "Estimated PI using " + totalTerms + " terms: " + estimatedPI);
        System.out.println("Actual PI: " + actualPI);
        System.out.println("Difference: " + difference);
      }
    }
  }
}
