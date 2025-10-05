package session6_Arrays;

public class Ex5_ArrayInfoDisplay
{
  public static void main(String[] args)
  {

    int[] numbers = new int[7];
    String[] days = new String[] {"Monday", "Tuesday", "Wednesday"};
    double[] doubles = new double[4];

    System.out.println("Array of integers:");
    System.out.println(
        "Size of array: " + numbers.length + "\nat index 0 we have the value: "
            + numbers[0] + "\nat index: " + (numbers.length - 1)
            + " which is the last, we have the value: " + numbers[6]);
    System.out.println();


    System.out.println("Array of days:");
    System.out.println(
        "Size of array: " + days.length + "\nat index 0 is " + days[0]
            + "\nand at index " + (days.length - 1)
            + " which is the last index, we have the day: " + days[2] + ".");
    System.out.println();

    System.out.println("Array of doubles:");
    System.out.println("- Length: " + doubles.length);
    System.out.println("- First element: " + doubles[0]);
    System.out.println("- Last element: " + doubles[doubles.length - 1]);
    System.out.println();
  }
}
