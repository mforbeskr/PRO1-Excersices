package session5_WhileLoop;

import java.util.Scanner;

public class Ex3_PasswordValidation
{
  public static void main(String[] args) {

    Scanner scanner = new Scanner((System.in));
    String correctPassword = "java123";
    String guessedPassword;
    boolean accessGranted = false;


   while(!accessGranted){
     System.out.print("Enter Password: ");
     guessedPassword = scanner.nextLine();

     if (guessedPassword.equals(correctPassword)){
       accessGranted = true;
       System.out.println("Success! Access has been granted.");

     }else {
       System.out.println("Incorrect. Please try again. ");

     }
   }
   scanner.close();
  }
}
