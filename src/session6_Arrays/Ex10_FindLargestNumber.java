package session6_Arrays;

import java.util.Arrays;

public class Ex10_FindLargestNumber
{ public static void main(String[] args) {

  int[] numbers = new int[]{12, 45, 7, 89, 23, 3, 17, 16, 33};
  int largest = numbers[0];

  for (int i = 0; i < numbers.length; i++){
    if (numbers[i] > largest){
      largest = numbers[i];
    }
  }

  System.out.println(Arrays.toString(numbers));
  System.out.println("The largest number in the array is: " + largest);

  }
}
