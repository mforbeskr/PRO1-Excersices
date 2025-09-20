package session4_SwitchAndEnums;

public class CoffeeShop
{
  public static void main(String[] args) {
    printPrice(CoffeeSize.SMALL);
    printPrice(CoffeeSize.MEDIUM);
    printPrice(CoffeeSize.LARGE);
  }

  public static void printPrice(CoffeeSize size) {
    switch (size){
      case SMALL:
        System.out.println("SMALL: 2.50$");
        break;
      case MEDIUM:
        System.out.println("MEDIUM: 3.50$");
        break;
      case LARGE:
        System.out.println("LARGE: 4.50$");
        break;

      default:// //////////////////////////////////////////////// //
        throw new IllegalStateException("Unexpected value: " + size);
    }
  }
}

enum CoffeeSize {
  SMALL,
  MEDIUM,
  LARGE
}

