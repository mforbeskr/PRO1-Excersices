package session5_WhileLoop;

import java.util.Scanner;

public class Ex1_CountdownOutput
{
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter positive number: ");
    int number = scanner.nextInt();

    while(number > 0){
      System.out.println(number);
      number--;
    }
    System.out.println("KAboOOm!");


  }
}
