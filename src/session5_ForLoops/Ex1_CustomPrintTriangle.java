package session5_ForLoops;

import java.util.Scanner;

public class Ex1_CustomPrintTriangle
{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter tringle height: ");
    int input = scanner.nextInt();

    for (int i=1; i<= input; i++){
        for (int j= 1; j<= i; j++){
            System.out.print("* ");
        }
        System.out.println();
    }

  }
}
