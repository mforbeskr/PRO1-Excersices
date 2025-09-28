package session5_WhileLoop;

import java.util.Scanner;

public class Ex7_Password3Attempts
{
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    String correctPassword = "secret123";
    boolean accessGranted = false;

    for (int attempt = 1; attempt <= 3; attempt++) {
      System.out.print("Enter password (attempt " + attempt + "/3): ");
      String guessedPassword = scanner.nextLine();

      if (guessedPassword.equals(correctPassword)) {
        System.out.println("Access Granted!");
        accessGranted = true;
        break; //is it necessary here? //
      }
    }

    if (!accessGranted){
      System.out.println("Access denied. Maximum attempts reached.");
    }


  }
}
