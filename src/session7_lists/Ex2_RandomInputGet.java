package session7_lists;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex2_RandomInputGet
{
  public static void main(String[] args)
  {

    Scanner scanner = new Scanner(System.in);

    ArrayList<String> animalList = new ArrayList<>();
    animalList.add("Lion");
    animalList.add("Tiger");
    animalList.add("Puma");
    animalList.add("Lynx");
    animalList.add("Leopard");

    System.out.println(animalList);

    while (true)
    {
      System.out.print("Enter a number 1-5 (0 to exit): ");
      int inputNumber = scanner.nextInt();

      if (inputNumber == 0) {
        System.out.println("Exiting program...");
        return;
      }

      System.out.println("Animal at position " + inputNumber + ": "
          + animalList.get((inputNumber - 1))+"\n");

    }
  }
}
