package session14_Abstract.Restaurant;

public abstract class MenuItem
{

  String name;
  double basePrice;
  int preparationTime;

  public MenuItem(String name, double basePrice, int preparationTime)
  {
    this.name = name;
    this.basePrice = basePrice;
    this.preparationTime = preparationTime;
  }

  public String getName()
  {
    return name;
  }

  public double getBasePrice()
  {
    return basePrice;
  }

  public int getPreparationTime()
  {
    return preparationTime;
  }

  public abstract void prepare();
  public abstract double calculateCost();

  public String getDescription(){
    return "Name: " + name + " Price: " + basePrice + " Preparation Time: " + preparationTime ;
  }

  @Override public String toString()
  {
    return "MenuItem {" + "name = '" + name + '\'' + ", basePrice = " + basePrice
        + ", preparationTime = " + preparationTime + '}';
  }
}
