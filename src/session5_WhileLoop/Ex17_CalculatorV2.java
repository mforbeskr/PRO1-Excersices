package session5_WhileLoop;

import java.util.Scanner;

public class Ex17_CalculatorV2
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    double firstNumber = 0;
    double secondNumber = 0;
    String operator;


    while (true) // FIRST NUMBER INPUT
    {
      System.out.print(
          "Hello and welcome to your calculator!\n\nPlease enter the first number (press 'q' to quit): ");

      if (scanner.hasNextDouble())
      {
        firstNumber = scanner.nextDouble();
        break;
      }
      else if (scanner.hasNext("q"))
      {
        System.out.println("Exiting calculator. Goodbye!");
        return;
      }
      else
      {
        System.out.println("Please enter a valid operator: ");
      }
    }

      while (true) // ENTER OPERATOR
      {
        System.out.println("Enter a valid operator ( +, -, *, / ): ");
        operator = scanner.next();
        if (operator.equals("+") || operator.equals("-") || operator.equals("*")
            || operator.equals("/"))
        {
          break;
        }
        else
        {
          System.out.println("Please enter a valid operator: ");
        }
      }

      while(true)
      {
        System.out.println("Enter second number: ");
        if (scanner.hasNextDouble())
        {
          secondNumber = scanner.nextDouble(); // SECOND NUMBER
          if (operator.equals("/") && secondNumber == 0)
          {
            System.out.println(
                "It's not possible to divide by zero, Enter different number: ");
            continue;
          }
          break;
        }
        else if (scanner.hasNext("q"))
        {
          System.out.println("Exiting calculator. Goodbye!");
          scanner.close();
          return;
        }
        else
        {
          System.out.println("Invalid input. Please enter a number: ");
          scanner.next();
        }
      }

      double result = 0;
      switch(operator){
        case "+": result = firstNumber + secondNumber; break;
        case "-": result = firstNumber - secondNumber; break;
        case "*": result = firstNumber * secondNumber; break;
        case "/": result = firstNumber / secondNumber; break;


      }

        System.out.println("Let's calculate " + firstNumber + " " + operator + " " + secondNumber + " = " + result);
        System.out.println();


    }
  }

