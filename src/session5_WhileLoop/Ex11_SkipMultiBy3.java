package session5_WhileLoop;

public class Ex11_SkipMultiBy3
{
  public static void main(String[] args) {

    int number = 1;

    while (number <= 30){
      if (number % 3 == 0){
        number++;
        continue;
      }
      System.out.println(number);
      number++;
    }
  }
}
