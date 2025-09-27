package session5_Loops;

import java.util.Scanner;

public class Ex2_SumExpanded
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int input = scanner.nextInt();

    int sum = 0;
    String details = "(";

    for(int i = 1; i <= input ; i++ ){
      sum += i;
      details += i;
      if (i < input){
        details += "+";
      }
    }
    details += "): ";

    System.out.println("The sum is " +details + sum);
    scanner.close();


    }
}

