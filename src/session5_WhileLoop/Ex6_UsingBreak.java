package session5_WhileLoop;

public class Ex6_UsingBreak
{
  public static void main(String[] args) {

    int number = 1;

    while(true){
      if (number % 7==0){
        System.out.println("The first found number divisible by 7 is: " + number);
        break;
      }
      number++;
    }
    System.out.println("Loop ended. Final number: " + number);
  }
}
