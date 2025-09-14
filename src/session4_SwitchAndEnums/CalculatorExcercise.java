package session4_SwitchAndEnums;

import java.util.Scanner;

public class CalculatorExcercise
{
  public static void main(String[] args)
  {

    Scanner scanner = new Scanner(System.in);

    // Ask for two numbers
    System.out.print("Enter the first number: ");
    double num1 = scanner.nextDouble();

    System.out.print("Enter the second number: ");
    double num2 = scanner.nextDouble();

    // Ask for the operator
    System.out.print("Enter an operator (+, -, *, /): ");
    char operator = scanner.next().charAt(0);

    double result;

    // Use switch to perform the operation
    switch (operator)
    {
      case '+':
        result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + result);
        break;
      case '-':
        result = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + result);
        break;
      case '*':
        result = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + result);
        break;
      case '/':
        if (num2 != 0)
        {
          result = num1 / num2;
          System.out.println(num1 + " / " + num2 + " = " + result);}
        else {
          System.out.println("Error: Division by zero (0) is not allowed.");}
        break;
    default: System.out.println("That made no sense. Please use +, -, *, or /.");
    }
    System.out.println("The operator your chose : " +"'" + operator + "'");
    scanner.close();
  }
}