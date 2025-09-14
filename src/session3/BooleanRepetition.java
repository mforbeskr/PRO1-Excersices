package session3;

public class BooleanRepetition
{
  public static void main (String[]args)
  {
    weAreInTrouble(true, 6);// should print out true
    weAreInTrouble(true, 7); // should print out false
    weAreInTrouble(false, 6); // should print out false
    weAreInTrouble(true, 21); // should print out true
    weAreInTrouble(false, 21); // should print out false
    weAreInTrouble(true, 20); // should print out false
  }
  public static void weAreInTrouble(boolean isTalking, int hour) {
    boolean weAreInTrouble = isTalking && (hour < 7 || hour > 20 );
    System.out.println(weAreInTrouble);
  }
}
