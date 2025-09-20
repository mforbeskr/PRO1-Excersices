package session0_homestudio;

import java.util.Scanner;

public class ScannerMus
{
  public static void main(String[] args){
    Scanner scan = new Scanner (System.in);


    System.out.print("Enter your name: ");
    String name = scan.nextLine();

    System.out.print("Enter your age: ");
    int age = scan.nextInt();

    System.out.print("What is your gpa: ");
    double gpa = scan.nextDouble();

    System.out.print("Are you a student? (true/false): ");
    boolean isStudent = scan.nextBoolean();


    System.out.println("\nHello " + name );
    System.out.println("You are " + age + " years old");
    System.out.println("Your gpa is: " + gpa );
    System.out.println("When asked if you are a student, you answered: '" + isStudent + "'.");

    /* ----------------------------------------------------------- */

    if (isStudent){ // if this boolean is true the program will print this to the console
      System.out.println("\nNot too shabby, student!");
    }
    else{
      System.out.println("Which means you are a dropout... :(");
    }

    scan.close();
  }
}
