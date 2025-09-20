package session4_SwitchAndEnums;

import java.util.Scanner;

public class ColorsOfLights
  {
    public static void main(String[] args) {


      printAction(TrafficLight.RED);
      printAction(TrafficLight.YELLOW);
      printAction(TrafficLight.GREEN);
    }

    public static void printAction(TrafficLight trafficLight) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter a color of the traffic light and learn what to do:");

      String inputColor = scanner.nextLine();


      switch (inputColor){
        case "Red":
        System.out.println("STOP!");
        break;

        case "Yellow":
        System.out.println("Caution!");
        break;

        case "Green":
        System.out.println("Go!");
        break;

        default:
          System.out.println("Please answer with 'Red' , 'Yellow' or 'Green'.");
      }

    }
  }

  enum TrafficLight {
    RED,
    YELLOW,
    GREEN
  }