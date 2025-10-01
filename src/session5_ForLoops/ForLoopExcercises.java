package session5_ForLoops;

import java.util.Scanner;

public class ForLoopExcercises
{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int input = scanner.nextInt();

    int sum = 0;
    for (int i = 0; i <= input; i++){
      sum += i;
    }
    System.out.print("The sum of all numbers\nleading up to your input is: "+ sum);

    scanner.close();
  }
}
