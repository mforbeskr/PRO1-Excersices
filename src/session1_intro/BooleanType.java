package session1_intro;

public class BooleanType
{
  public static void main(String[] args)
  {
   int a = 5;
   int b = 5;
   int c = 10;
   boolean isEqual = (a==b); // true, because 5 is equal to 5
   boolean isEqualAgain = a==b; // true, because 5 is equal to 5
   boolean isNotEqual = (a != c); // false, because 5 is not equal to 10
   boolean isNotEqualAgain = a != c; // false, because 5 is not equal to 10
    double x = 3.14;
    double y = 3.14;
    double z = 2.71;
    boolean isDoubleEqual = (x == y); // true, because 3.14 is equal to 3.14
    boolean isDoubleNotEqual = (x != z); // true, because 3.14 is not equal to 2.71
    System.out.println("Is a equal to b? " + isEqual);
    System.out.println("Is a not equal to c? " + isNotEqual);
    System.out.println("Is x equal to y? " + isDoubleEqual); // Prints true
    System.out.println("Is x not equal to z? " + isDoubleNotEqual); // Prints true

  }
}
