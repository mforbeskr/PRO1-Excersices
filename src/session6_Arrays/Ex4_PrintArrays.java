package session6_Arrays;

import java.util.Arrays;

public class Ex4_PrintArrays
{
  public static void main(String[] args)
  {
    String[] cities = new String[]{"Copenhagen", "Stockholm", "Oslo"};
    int[] numbers = {1, 2, 3, 4, 5};
    numbers[2] = 41;

    String formattedArray = Arrays.toString(numbers);
    System.out.println(Arrays.toString(numbers));

    String formattedArrayCities = Arrays.toString(cities);
    System.out.println(Arrays.toString(cities));
    System.out.println(formattedArray + formattedArrayCities);

    System.out.println("\nThe array list of cities contains: " +cities.length + " cities.");
    System.out.println("The array with numbers can contain : " + numbers.length + " numbers");


  }
}
