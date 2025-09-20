package session4_SwitchAndEnums;

import java.util.Scanner;

public class WhatIfAndSoOn
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Do you think it is hard to be a mom? (yes/no):");
    String answer = scanner.nextLine();
    if (answer.equals("Yes") || answer.equals("yes")){
      System.out.print("Then you should try being a dad!\n");
    }
    else {
      System.out.print("Amazing! You are doing a great job my dear!\n");
    }

    System.out.print("Do you think it is hard to be a dad?(yes/no):");
    String answer2 = scanner.nextLine();
    if (answer2.equals("Yes") || answer2.equals("yes")){
      System.out.print("Then you should try being a mom!\n");
    }
    else {
      System.out.print("Amazing! You are doing a great job my dear!\n");
    }

    System.out.print("Do you think it is hard to be a son?(yes/no):");
    String answer3 = scanner.nextLine();
    if (answer3.equals("Yes") || answer3.equals("yes")){
      System.out.print("Then you should try being a daughter!\n");
    }
    else {
      System.out.print("Well that is amazing! You go, child! It's your time to conquer the world! :-) \n");
    }

    System.out.print("Do you think it is hard to be a daughter?(yes/no):");
    String answer4 = scanner.nextLine();
    if (answer4.equals("Yes") || answer4.equals("yes")){
      System.out.print("Then you should try being a son!\n");
    }
    else {
      System.out.print("Well that is amazing! You go, child! Conquer the world :-)!\n");
    }


    scanner.close();
  }
  }
