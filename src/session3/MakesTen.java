package session3;

public class MakesTen
{
  public static void main(String[] args) {
    makesTen(10, 0);    // should print true
    makesTen(0, 10);    // should print true
    makesTen(5, 5);     // should print true
    makesTen(2, 8);     // should print true
    makesTen(3, 7);     // should print true
    makesTen(1, 9);     // should print true
    makesTen(4, 7);     // should print false
    makesTen(6, 1);     // should print false
  }

  public static void makesTen(int a, int b) {
   int result = 10;
   boolean makesTen = (a + b == result);
    System.out.println(makesTen);
  }
}