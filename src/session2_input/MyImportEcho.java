package session2_input;

import java.util.Scanner;

public class MyImportEcho
{
  public static void main(String[] args)
  {
  Scanner scan = new Scanner(System.in);

  System.out.println("Please insert 1st text: ");
  String firstInput = scan.nextLine();

  System.out.println("Please insert 2nd text: ");
  String secondText = scan.nextLine();


  System.out.println("This is your text: ");
  System.out.println(firstInput + " " + secondText);
  int length = firstInput.length();
  int length2 = secondText.length();
  int maxlength = (length+length2);
  System.out.print("Total characters: " + maxlength);
  }
}