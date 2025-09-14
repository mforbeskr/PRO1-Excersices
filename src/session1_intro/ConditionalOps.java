package session1_intro;

public class ConditionalOps
{
  public static void main(String[]args)
  {
  int a = 5;
  int b = 14; // You pick a value here. Statement: "This value is between a and c."
  int c = 15;
  boolean bIsLargerThanA = (a < b);
  boolean bIsSmallerThanC = (b < c);
  boolean result = bIsLargerThanA && bIsSmallerThanC;
  System.out.println("Is b between a and c? " + result);
  }
}
