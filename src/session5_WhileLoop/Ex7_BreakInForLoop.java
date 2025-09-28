package session5_WhileLoop;

public class Ex7_BreakInForLoop
{
  public static void main(String[] args) {

    int[] numbers = {3, 7, 12, 5, 9, 15, 2};
    int target = 9;
    boolean found = false;

    for (int i = 0; i < numbers.length; i++){
    System.out.println("Checking: " + numbers[i]);

    if (numbers[i] == target)
    {
      System.out.println("\nFound " + target + " at index " + i);
      found = true;
      break;
    }
}

    if (!found) {
      System.out.println(target + " not found in the array");
    }

    System.out.println("Search completed.");

  }
}
