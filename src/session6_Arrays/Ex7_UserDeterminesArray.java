package session6_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ex7_UserDeterminesArray
{
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the size of the array: ");
    int size = scanner.nextInt();

    int[] numbersArray = new int[size];

    System.out.print("Enter " + size + " numbers: ");
    for (int i=0; i < numbersArray.length; i++){
      System.out.println("\nNumber " + (i + 1) + ":");
      numbersArray[i] = scanner.nextInt();
    }
    System.out.println();
    System.out.println("Array contains:" + Arrays.toString(numbersArray));

  }
}
