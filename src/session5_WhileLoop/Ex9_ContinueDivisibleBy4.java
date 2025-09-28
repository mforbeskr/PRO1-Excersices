package session5_WhileLoop;

import java.util.Scanner;

public class Ex9_ContinueDivisibleBy4
{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter top bound: ");
    int input = scanner.nextInt();

    for (int i = 0; i <= input ; i++){
      if ( i % 4 == 0){
        continue;
      }
      System.out.print (i + " ");
    }
    scanner.close();
  }
}
