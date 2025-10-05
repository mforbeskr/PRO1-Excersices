package session6_Arrays;

public class Ex6_SafeArrayAccess
{
  public static void main(String[] args) {

    int[] numbers = new int[5];
    numbers [0] = 10;
    numbers [1] = 20;
    numbers [2] = 30;
    numbers [3] = 40;
    numbers [4] = 50;

    System.out.println("Array length: " + numbers.length );

    System.out.println("Element at index 0: " + numbers[0]);
    System.out.println("Element at index 2: " + numbers[2]);

    System.out.println("Last valid index: " + (numbers.length -1));
    System.out.println("Element at last valid index: " + numbers[numbers.length -1] );

    System.out.println("Attempting to access index " + numbers.length + "...") ;
    System.out.println(numbers[numbers.length]);
    // THE LINE ABOVE PRINTS AN ERROR, CANT ACCESS INDEX 5 AS IT GOES FROM [0-4]
  }
}
