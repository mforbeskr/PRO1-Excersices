package session2_input;

import java.util.Scanner;

public class MyImportEcho
{
  public static void main(String[] args)
  {
  Scanner written = new Scanner(System.in);

  System.out.println("Please insert 1st text: ");
  String firstInput = written.nextLine();

  System.out.println("Please insert 2nd text: ");
  String secondText = written.nextLine();


  System.out.println("This is your text: ");
  System.out.println(firstInput + " " + secondText);
  int length = firstInput.length();
  int length2 = secondText.length();
  int maxlength = (length+length2);
  System.out.print("Total characters: " + maxlength);
  }
}