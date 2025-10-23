package session14_Abstract.Restaurant;

import java.awt.*;

public class TestClass
{
  public static void main(String[] args)
  {
    MenuItem[] menu = new MenuItem[6];

    menu[0] = new Appetizer("Buffalo Wings", 8.99, 15, true, "Large");
    menu[1] = new Appetizer("Caesar Salad", 6.99, 10, false, "Medium");
    menu[2] = new MainCourse("Grilled Salmon", 18.99, 25, "Fish", 2);
    menu[3] = new MainCourse("Beef Steak", 24.99, 30, "Beef", 3);
    menu[4] = new Dessert("Ice Cream", 4.99, 5, true, 4);
    menu[5] = new Dessert("Chocolate Cake", 6.99, 10, false, 5);

    for (MenuItem item : menu) {
      System.out.println(item.toString());
      System.out.println("Description: " + item.getDescription());
      System.out.println("Final cost: $" + String.format("%.2f", item.calculateCost()));
      item.prepare();
      System.out.println("---");
    }
  }
}
