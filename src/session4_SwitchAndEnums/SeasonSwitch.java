package session4_SwitchAndEnums;

import java.util.Scanner;

public class SeasonSwitch
{
  public static void main(String[] args)
  {
    System.out.println("Enter Number of Month and get Season: ");
    Scanner scanner = new Scanner(System.in);
    int input = scanner.nextInt();

    switch (input){
      case 1 -> System.out.println("This is January -> Winter.");
      case 2 -> System.out.println("This is February -> Winter.");
      case 3 -> System.out.println("This is March -> Winter.");
      case 4 -> System.out.println("This is April -> Spring.");
      case 5 -> System.out.println("This is May -> Spring.");
      case 6 -> System.out.println("This is June -> Spring.");
      case 7 -> System.out.println("This is Juli -> Summer.");
      case 8 -> System.out.println("This is August -> Summer.");
      case 9 -> System.out.println("This is September -> Summer.");
      case 10 -> System.out.println("This is October -> Winter.");
      case 11 -> System.out.println("This is November -> Winter.");
      case 12 -> System.out.println("This is December -> Winter.");
      default -> System.out.println("This is not a month of the year");
    }
  }
}
