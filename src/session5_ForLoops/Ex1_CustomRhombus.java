package session5_ForLoops;

import java.util.Scanner;

public class Ex1_CustomRhombus
{
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter which line the widest part should be in: ");
    int input = scanner.nextInt();

    if (input % 2 ==0) {
      System.out.println("The entered number must be odd");
    }

    else if (input % 2 ==1) {
      //Top-half//
      for (int i = 1; i <= input; i++) {
        for (int j = input; j > i; j--) {
          System.out.print(" ");
        }

        for (int k = 1; k <= (2 * i - 1); k++) {
          System.out.print("*");
        }
        System.out.println();
      }
      //Bottom-half//
      for (int i = input - 1; i>= 1; i--) {
        for (int j = input; j > i; j--) {
          System.out.print(" ");
        }

        for (int k = 1; k <= (2 * i - 1); k++) {
          System.out.print("*");
        }

        System.out.println();
      }
    }
      scanner.close();
    }
  }
