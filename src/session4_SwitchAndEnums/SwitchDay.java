package session4_SwitchAndEnums;

public class SwitchDay
{
  public static void main(String[] args) {

    System.out.println("Which day is it today?");


    String day = "Saturday";

    switch (day) {

      case "Sunday":
        System.out.println("You are right, it is Sunday!");
        break;
      case "Monday":
        System.out.println("You are right, it is Monday!");
        break;
      case "Tuesday":
        System.out.println("You are right, it is Tuesday!");
        break;
      case "Wednesday":
        System.out.println("You are right, it is Wednesday!");
        break;
      case "Thursday":
        System.out.println("You are right, it is Thursday!");
        break;
      case "Friday":
        System.out.println("You are right, it is Friday!");
        break;
      case "Saturday":
        System.out.println("You are right, it is Saturday!");
        break;
      default:
        System.out.println("That is not a day!");
    }
  }
}
