package session8_objects.ExcerciseMix;

public class Car {

    String make = "Bentley";
    String model = "Bentega";
    int year = 2014;
    double price = 44000.99;
    boolean isRunning = false;

    void start(){
      isRunning = true;
      System.out.println("You start the engine");
    }

    void stop(){
      isRunning = false;
      System.out.println("You stop the engine");
    }

    void drive (){
      System.out.println("You drive the " + make);
    }

    void brake (){
      System.out.println("You brake the " + make);
    }


}
