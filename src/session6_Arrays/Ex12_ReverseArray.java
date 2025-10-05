package session6_Arrays;

import java.util.Arrays;

public class Ex12_ReverseArray
{
  public static void main(String[] args)
  {

    int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
    int[] reversed = new int[numbers.length];

    System.out.println("Array in reverse order: ");
    for (int i = numbers.length -1, j = 0; i >= 0; i--, j++){
      reversed[j] = numbers[i];

    }

    System.out.println("Original array: " + Arrays.toString(numbers));
    System.out.println("Reversed array: " + Arrays.toString(reversed));

  }
}
