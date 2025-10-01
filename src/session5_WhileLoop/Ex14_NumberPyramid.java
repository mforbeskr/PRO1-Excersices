package session5_WhileLoop;

import java.util.Scanner;

public class Ex14_NumberPyramid
{
  public static void main(String[] args)
  {

    Scanner scanner = new Scanner(System.in);
    System.out.print("please enter height of pyramid: ");
    int input = scanner.nextInt();

    for (int row = 1; row <= input; row++)
    {
      for (int numbers = 1; numbers <= row; numbers++)
      {
        System.out.print(numbers);
      }
      System.out.println();
    }
  }
}